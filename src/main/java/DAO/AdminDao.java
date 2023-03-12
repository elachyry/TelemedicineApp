package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Models.DataBaseConnection;
import Models.Tools;

public class AdminDao {

	
	public static ResultSet login(String email, String password) {
		try {
			Connection con = DataBaseConnection.getConnection();
			PreparedStatement ps = con.prepareStatement("SELECT * FROM `admin` WHERE (Email = ? OR Username = ?) AND Password = ?");
			ps.setString(1, email);
			ps.setString(2, email);
			ps.setString(3, Tools.encryptPassword(password));
			ResultSet resultSet = ps.executeQuery();
			return resultSet;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}
}
