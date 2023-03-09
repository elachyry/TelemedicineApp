package Models;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Random;
import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

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
	
	public static boolean checkFieldOnUpdate(String table, String column, String value, int id)
			throws ClassNotFoundException, SQLException {
		Connection con = DataBaseConnection.getConnection();
		PreparedStatement st = con
				.prepareStatement("Select * From " + table + " Where " + column + " = '" + value + "'" + "' AND id != " + id);
		ResultSet rs = st.executeQuery();
		System.out.println("rs " + rs.next());
		if (!rs.next()) {
			return false;
		} else {
			return true;
		}
	}
	
	public static boolean checkInternetConnection() {
        try {
            final URL url = new URL("http://www.google.com");
            final URLConnection conn = url.openConnection();
            conn.connect();
            conn.getInputStream().close();
            return true;
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            return false;
        }
    }
	
	public static void sendEmail(String recipient, String nom, String prenom, String username, String password, String emailType) throws Exception {
        if (checkInternetConnection()) {
            System.out.println("Praparing sent email");
            Properties properties = new Properties();
            properties.put("mail.smtp.auth", "true");
            properties.put("mail.smtp.starttls.enable", "true");
            properties.put("mail.smtp.host", "smtp.gmail.com");
            properties.put("mail.smtp.port", "587");

            final String myEmail = "medivisit.app@gmail.com";
            final String myPassword = "osegqsfgudphncta";


            Session session = Session.getInstance(properties, new Authenticator() {
                @Override
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(myEmail, myPassword);
                }
            });
            Message message = preapareMessage(session, myEmail, recipient, nom, prenom, username, password, emailType);
            Transport.send(message);
            System.out.println("message sent!");
        }


    }

    private static Message preapareMessage(Session session, String MyEmail, String recipient, String nom, String prenom, String username, String password, String emailType) {
        try {
           
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(MyEmail));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(recipient));
            if ("New Account".equals(emailType)) {
                message.setSubject("Welcom to Medivist");
                message.setText("Hello Dr." + prenom + " " + nom + ", \n\n" + "Congratulations! \nYou have been added to become a member of the medical staff" + "\n\nYour login information: " + "\nEmail: " + recipient + "\n" + "\nUsername: " + username + "\n" + "Password: " + password + "\n" + "Noticed: You can change your username and password from your account.");
            }
            if ("Update Account".equals(emailType)) {
                message.setSubject("Your username and password has been reset.");
                message.setText("Hello " + prenom + " " + nom + ", \n\n" + "We reset your login information for you.\n\nYour login information:" + "\nEmail: " + recipient + "\n" + "\nUsername: " + username + "\n" + "Mot de passe: " + password + "\n" + "Noticed: You can change your username and password from your account.");
            }
            if ("Delete Account".equals(emailType)) {
                message.setSubject("Your account have been deleted!");
                message.setText("Hello " + prenom + " " + nom + ", \n\n" + "Unfortunately your account has been deleted, you will no longer be able to log in to your account.\n" + "If you believe an error has been made, please contact us.");
            }

            return message;
        } catch (MessagingException ex) {
        }
        return null;
    }
    
    public static String encryptPassword(String password) {
        Encoder encoder = Base64.getEncoder();
        String originalString = password;
        String encodedString = encoder.encodeToString(originalString.getBytes());
//        System.out.println("Encrypted Value :: " + encodedString);
        return encodedString;
    }

    public static String decryptPassword(String Password) {
        System.out.println("Password " + Password);
        Decoder decoder = Base64.getDecoder();
        byte[] bytes = decoder.decode(Password);
//        System.out.println("Decrypted Value :: " +new String(bytes));
        return new String(bytes);
    }

}
