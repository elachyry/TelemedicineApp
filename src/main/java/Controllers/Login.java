package Controllers;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import Models.DataBaseConnection;

public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String profil = request.getParameter("profil");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		Connection connection = null;
		PreparedStatement statement = null;
		HttpSession session =(HttpSession) request.getSession();
		RequestDispatcher dispatcher = null;
		
			try {
				connection = DataBaseConnection.getConnection();
			  System.out.println("Database is Connected !");
			  
			  	if(profil.equals("doctor")) {
			  		  statement = connection.prepareStatement("SELECT * FROM `doctor` WHERE Username = ? AND Password = ?");
					  statement.setString(1,username);
					  statement.setString(2,password );
					  ResultSet rs = statement.executeQuery();
					  if(rs.next()) {
						  session.setAttribute("fullname", rs.getString("First_Name")+' '+rs.getString("Last_Name"));
						  dispatcher = (RequestDispatcher) request.getRequestDispatcher("Doctor/index.jsp");
					  }else {
						  request.setAttribute("status", "failed");
						  dispatcher = (RequestDispatcher) request.getRequestDispatcher("Login/DoctorLogin.jsp");
					  }
					  }
					  dispatcher.forward(request, response);
			  	
					  connection.close();
			  } catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			
		
	}

}
