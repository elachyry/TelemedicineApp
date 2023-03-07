package Controllers;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Models.DataBaseConnection;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class ProfilDoctor
 */

public class ProfilDoctor extends HttpServlet {
	private static final long serialVersionUID = 1L;
	RequestDispatcher dispatcher = null;

       
	@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		  dispatcher = (RequestDispatcher) req.getRequestDispatcher("/Doctor/profil.jsp");
		}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = (HttpSession) request.getSession();

		String username = (String) session.getAttribute("username");

		try {
			Connection con = DataBaseConnection.getConnection();
			try {
				PreparedStatement ps = con.prepareStatement("SELECT First_Name, Last_Name, Email, Number_Phone, Speciality, Adress, Password, Work_Days, Work_Hours FROM doctor WHERE Username = "+ username);
				ResultSet resultSet = ps.executeQuery();
				while (resultSet.next()) { 
					String firstName = resultSet.getString("First-Name");
					String lastName = resultSet.getString("Last-Name");
					String email = resultSet.getString("Email");
					String mobile = resultSet.getString("Number_Phone");
					String speciality = resultSet.getString("Speciality");
					String adress = resultSet.getString("Adress");
					String password = resultSet.getString("Password");
										
					session.setAttribute("fullName", firstName+" "+lastName);
					session.setAttribute("FisrtName", firstName);
					session.setAttribute("LastName", lastName);
					session.setAttribute("Email", email);
					session.setAttribute("Phone", mobile);
					session.setAttribute("Speciality", speciality);
					session.setAttribute("Adress", adress);

					
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
