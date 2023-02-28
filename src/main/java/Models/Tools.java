package Models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;

public class Tools {

	public static String generatePassword(int length) {
		String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "1234567890";
		String combinedChars = capitalCaseLetters + lowerCaseLetters + numbers;
		Random random = new Random();
		char[] password = new char[length];

		password[0] = lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length()));
		password[1] = capitalCaseLetters.charAt(random.nextInt(capitalCaseLetters.length()));
		password[2] = numbers.charAt(random.nextInt(numbers.length()));

		for (int i = 3; i < length; i++) {
			password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
		}
		String pass = "";
		for (char c : password) {
			pass += c;
		}
		return pass;
	}

	public static String generateNumber(int length) {
		String numbers = "1234567890";
		String combinedChars = numbers;
		Random random = new Random();
		char[] password = new char[length];

		password[0] = numbers.charAt(random.nextInt(numbers.length()));

		for (int i = 1; i < length; i++) {
			password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
		}
		String pass = "";
		for (char c : password) {
			pass += c;
		}
		return pass;
	}

	public static boolean checkField(String table, String column, String value)
			throws ClassNotFoundException, SQLException {
		Connection con = DataBaseConnection.getConnection();
		PreparedStatement st = con
				.prepareStatement("Select * From " + table + " Where " + column + " = '" + value + "'");
		ResultSet rs = st.executeQuery();
		System.out.println("rs " + rs.next());
		if (!rs.next()) {
			return false;
		} else {
			return true;
		}
	}

}
