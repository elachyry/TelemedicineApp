package DAO;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.http.HttpServletResponse;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import Models.Appointment;
import Models.DataBaseConnection;
import Models.Tools;

public class AppointmentDao {
	
	public static int addAppointment(Appointment appointment) {
		int status = 0;
		try {
			Connection con = DataBaseConnection.getConnection();
			PreparedStatement ps = con.prepareStatement(
					"INSERT INTO `appointments`(`Date`, `Patient_id`, `Doctor_id`, `Status`) "
							+ "VALUES (?,?,?,?)");
			
			
			ps.setDate(1, appointment.getDate());
			ps.setInt(2, appointment.getPatientId());
			ps.setInt(3, appointment.getDoctorId());
			ps.setString(4, appointment.getStatus());
			
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
					"UPDATE `appointments` SET `Date`=?,`Status`=?,` WHERE id = ?");

			
			ps.setDate(1, appointment.getDate());
			ps.setString(2, appointment.getStatus());
			ps.setInt(3, id);
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

	public static ResultSet getPatient(int id) {
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
			ResultSet rs = getPatient(id);
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
            XSSFSheet XFSheet = XFWB.createSheet("Patients List");
            XSSFRow HeaderRow = XFSheet.createRow(0);
            HeaderRow.createCell(0).setCellValue("Id");
            HeaderRow.createCell(1).setCellValue("First Name");
            HeaderRow.createCell(2).setCellValue("First Name");
            HeaderRow.createCell(3).setCellValue("Date of Birth");
            HeaderRow.createCell(4).setCellValue("Email");
            HeaderRow.createCell(5).setCellValue("Phone Number");
            HeaderRow.createCell(6).setCellValue("Sex");
            HeaderRow.createCell(7).setCellValue("Address");
            HeaderRow.createCell(8).setCellValue("Social Account");
            HeaderRow.createCell(9).setCellValue("Username");


            int RowNum = 1;
            while (resultSet.next()) {
                XSSFRow Row = XFSheet.createRow(RowNum);
                Row.createCell(0).setCellValue(resultSet.getInt(1));
                Row.createCell(1).setCellValue(resultSet.getString(3));
                Row.createCell(2).setCellValue(resultSet.getString(4));
                Row.createCell(3).setCellValue(resultSet.getString(5));
                Row.createCell(4).setCellValue(resultSet.getString(6));
                Row.createCell(5).setCellValue(resultSet.getString(7));
                Row.createCell(6).setCellValue(resultSet.getString(8));
                Row.createCell(7).setCellValue(resultSet.getString(10));
                Row.createCell(8).setCellValue(resultSet.getString(9));
                Row.createCell(9).setCellValue(resultSet.getString(11));

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
