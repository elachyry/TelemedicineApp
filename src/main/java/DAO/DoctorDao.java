package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;

import Models.DataBaseConnection;
import Models.Doctor;
import Models.Tools;

public class DoctorDao {

	public static int addDoctor(Doctor doctor) {
		int status = 0;
		try {
			Connection con = DataBaseConnection.getConnection();
			PreparedStatement ps = con
					.prepareStatement("INSERT INTO `doctor`(`First_Name`, `Last_Name`, `BirthDay`, `Email`, "
							+ "`Number_Phone`, `Sex`, `Address`, `Speciality`, `Work_Days`, `Work_Hours`, `Username`, `Password`) "
							+ "VALUES (?,?,?,?,?,?,?,?,?,?,?,?)");
			String workingDays = "";
			String workingHours = "";
			for (String s : doctor.getWorkingDays()) {
				workingDays += s + "-";
			}
			for (String s : doctor.getWorkingHours()) {
				workingHours += s + "-";
			}
			String username = "";
			boolean exist;
			do {
				username = doctor.getLastName() + Tools.generateNumber(5);
				exist = Tools.checkField("doctor", "Username", username);
			} while (exist == true);
			System.out.println(exist);
			System.out.println(username);
			ps.setString(1, doctor.getFirstName());
			ps.setString(2, doctor.getLastName());
			ps.setString(3, doctor.getBirthDay());
			ps.setString(4, doctor.getEmail());
			ps.setString(5, doctor.getPhoneNumber());
			ps.setString(6, doctor.getSex());
			ps.setString(7, doctor.getAddress());
			ps.setString(8, doctor.getSpecialty());
			ps.setString(9, workingDays);
			ps.setString(10, workingHours);
			ps.setString(11, username);
			ps.setString(12, Tools.generatePassword(10));
			status = ps.executeUpdate();
			ps.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

}
