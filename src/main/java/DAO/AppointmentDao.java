package DAO;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import jakarta.servlet.http.*;



import Models.Appointment;
import Models.DataBaseConnection;

public class AppointmentDao {
	
	public static int addAppointment(Appointment appointment) {
		int status = 0;
		try {
			Connection con = DataBaseConnection.getConnection();
			PreparedStatement ps = con.prepareStatement(
					"INSERT INTO `appointments`(`Date`, `Time`, `Patient_id`, `Doctor_id`, `Status`, `amount`, `Link`) "
							+ "VALUES (?,?,?,?,?,?,?)");
			
			
			ps.setString(1, appointment.getDate());
			ps.setString(2, appointment.getTime());
			ps.setInt(3, appointment.getPatientId());
			ps.setInt(4, appointment.getDoctorId());
			ps.setString(5, appointment.getStatus());
			ps.setDouble(6, appointment.getAmount());
			ps.setString(7, appointment.getLink());
			
			status = ps.executeUpdate();
			ps.close();
			con.close();
			//Tools.sendEmail( patient.getEmail(), patient.getLastName(), patient.getFirstName(), username, password, "New Account Patient");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}
	
	public static int updateAppointment(Appointment appointment, int id) {
		int status = 0;
		try {
			Connection con = DataBaseConnection.getConnection();
			PreparedStatement ps = con.prepareStatement(
					"UPDATE `appointments` SET `Date`=?, `Time`=?,`Status`=?, `amount`=?, `Link`=? WHERE id = ?");

			
			ps.setString(1, appointment.getDate());
			ps.setString(2, appointment.getTime());
			ps.setString(3, appointment.getStatus());
			ps.setDouble(4, appointment.getAmount());
			ps.setString(5, appointment.getLink());
			ps.setInt(6, id);
			status = ps.executeUpdate();
			ps.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}
	
	public static ResultSet getAllAppointments(String type) {
		try {
			Connection con = DataBaseConnection.getConnection();
			PreparedStatement ps = con.prepareStatement("SELECT * FROM `appointments` WHERE `deleted_at`IS " + type);
			ResultSet resultSet = ps.executeQuery();
			return resultSet;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

	public static ResultSet getAppointment(int id) {
		try {
			Connection con = DataBaseConnection.getConnection();
			PreparedStatement ps = con.prepareStatement("SELECT * FROM `appointments` WHERE id = ?");
			ps.setInt(1, id);
			ResultSet resultSet = ps.executeQuery();
			return resultSet;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public static int softDelete(int id) {
		try {
			ResultSet rs = getAppointment(id);
			rs.next();
			Connection con = DataBaseConnection.getConnection();
			PreparedStatement ps = con
					.prepareStatement("UPDATE `appointments` SET `deleted_at`= CURRENT_TIMESTAMP Where id = ?");
			ps.setInt(1, id);
			//Tools.sendEmail( rs.getString(6), rs.getString(4), rs.getString(3), "", "", "Delete Account");
			return ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}
	
	public static int updateStatus(int id, String status) {
		try {
			//ResultSet rs = getPatient(id);
			//rs.next();
			Connection con = DataBaseConnection.getConnection();
			PreparedStatement ps = con
					.prepareStatement("UPDATE `appointments` SET `Status`= ? Where id = ?");
			ps.setString(1, status);
			ps.setInt(2, id);
			//Tools.sendEmail( rs.getString(6), rs.getString(4), rs.getString(3), "", "", "Delete Account");
			return ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}
	
	
	public static boolean hardDelete(int id) {
		try {
			Connection con = DataBaseConnection.getConnection();
			PreparedStatement ps = con.prepareStatement("DELETE FROM `appointments` WHERE id = ?");
			ps.setInt(1, id);
			return ps.execute();

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public static int restore(int id) {
		try {
			Connection con = DataBaseConnection.getConnection();
			PreparedStatement ps = con.prepareStatement("UPDATE `appointments` SET `deleted_at`= null Where id = ?");
			ps.setInt(1, id);
			return ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}
	
	public static boolean export(HttpServletResponse response, String type) throws ClassNotFoundException, IOException {
        try {
        	Connection con = DataBaseConnection.getConnection();
			PreparedStatement ps = con.prepareStatement("SELECT * FROM `appointments` WHERE `deleted_at`IS " + type);
			ResultSet resultSet = ps.executeQuery();

            XSSFWorkbook XFWB = new XSSFWorkbook();
            XSSFSheet XFSheet = XFWB.createSheet("Appointments List");
            XSSFRow HeaderRow = XFSheet.createRow(0);
            HeaderRow.createCell(0).setCellValue("Id");
            HeaderRow.createCell(1).setCellValue("Patient Id");
            HeaderRow.createCell(2).setCellValue("FullName");
            HeaderRow.createCell(3).setCellValue("Doctor Id");
            HeaderRow.createCell(4).setCellValue("FullName");
            HeaderRow.createCell(5).setCellValue("Date");
            HeaderRow.createCell(6).setCellValue("Time");
            HeaderRow.createCell(7).setCellValue("Status");
            HeaderRow.createCell(8).setCellValue("Amount");
            HeaderRow.createCell(9).setCellValue("Link");
            
            ResultSet rs = PatientDao.getPatient(resultSet.getInt(4));
            ResultSet rs2 = PatientDao.getPatient(resultSet.getInt(5));

            int RowNum = 1;
            while (resultSet.next()) {
                XSSFRow Row = XFSheet.createRow(RowNum);
                Row.createCell(0).setCellValue(resultSet.getInt(1));
                Row.createCell(1).setCellValue(resultSet.getInt(4));
                Row.createCell(2).setCellValue(rs.getString(3) + " " + rs.getString(4));
                Row.createCell(3).setCellValue(resultSet.getInt(5));
                Row.createCell(4).setCellValue(rs2.getString(3) + " " + rs2.getString(4));
                Row.createCell(5).setCellValue(resultSet.getString(2));
                Row.createCell(6).setCellValue(resultSet.getString(3));
                Row.createCell(7).setCellValue(resultSet.getString(6));
                Row.createCell(8).setCellValue(resultSet.getString(7));
                Row.createCell(9).setCellValue(resultSet.getString(8));

                RowNum++;
            }
            response.setContentType( "application/vnd.ms-excel" );
            XFWB.write(response.getOutputStream());
            XFWB.close();
            return true;
//            try (FileOutputStream FileOutStr = new FileOutputStream("Exported/Clients.xlsx")) {
//                XFWB.write(FileOutStr);
//                System.out.println("Okay");
//            }
        } catch ( SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }

}
