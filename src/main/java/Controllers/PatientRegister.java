package Controllers;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Models.DataBaseConnection;
import java.sql.*;




public class PatientRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = null;
		
		String username = request.getParameter("name");
		String email = request.getParameter("email");
		String password = request.getParameter("pass");
		String contact = request.getParameter("contact");
		
		Connection connection = null;
				
		
		try {
				connection = DataBaseConnection.getConnection();
			  if(connection!=null) {
			  System.out.println("Database is Connected !");
			  }else {
				  System.out.println("ERROR!");
			  }
			  
			  PreparedStatement statement = connection.prepareStatement("INSERT INTO patient (Email,Number_Phone,Username,Password) "
			  		+ "VALUES (?,?,?,?)");
			  statement.setString(1,email);
			  statement.setString(2,contact );
			  statement.setString(3,username);
			  statement.setString(4, password);
			  int rowsCount = statement.executeUpdate();
			  
			  dispatcher = request.getRequestDispatcher("Login/PatientRegister.jsp");
			  statement.close();
			  
			  if (rowsCount > 0) {
				  request.setAttribute("status", "success");
			  } else { 
				  request.setAttribute("status", "failed");
			  }
			  
			  dispatcher.forward(request, response);
			  
			  
			  connection.close();
		} catch (ClassNotFoundException ee) {
			ee.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
		}
		 		
	}

}
