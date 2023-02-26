package Controllers;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

import java.sql.*;


public class DoctorRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		RequestDispatcher dispatcher = null;
		
		String username = request.getParameter("name");
		String email = request.getParameter("email");
		String password = request.getParameter("pass");
		String contact = request.getParameter("contact");
				
		
		try {
			  Class.forName("com.mysql.cj.jdbc.Driver");
			  String url = "jdbc:mysql://localhost/telemedicine?useSSL=false";
			  String user = "root";
			  String ConnPass = "";
			  Connection connection = DriverManager.getConnection(url, user, ConnPass);
			  
			  System.out.println("Database is Connected !");
			  PreparedStatement statement = connection.prepareStatement("INSERT INTO doctor (Email,Number_Phone,Username,Password) "
			  		+ "VALUES (?,?,?,?)");
			  statement.setString(1,email);
			  statement.setString(2,contact );
			  statement.setString(3,username);
			  statement.setString(4, password);
			  int rowsCount = statement.executeUpdate();
			  
			  dispatcher = request.getRequestDispatcher("Login/DoctorRegister.jsp");
			  statement.close();
			  
			  if (rowsCount > 0) {
				  request.setAttribute("status", "success");
			  } else {
				  request.setAttribute("status", "failed");
			  }
			  
			  dispatcher.forward(request, response);
			  
			  
			  connection.close();
		} catch (ClassNotFoundException e) {
			} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 		
	}

}
