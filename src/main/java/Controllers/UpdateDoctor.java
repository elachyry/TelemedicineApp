package Controllers;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Models.DataBaseConnection;
import jakarta.servlet.*;
import jakarta.servlet.http.*;


public class UpdateDoctor extends HttpServlet {
	private static final long serialVersionUID = 1L;
	

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		getServletContext().getRequestDispatcher("/Doctor/profil.jsp").forward(req, resp);

	}

	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		if(req.getParameter("Submit") != null) {
			HttpSession session =(HttpSession) req.getSession();
			Connection connection = null;
			PreparedStatement ps = null;
			RequestDispatcher dispatcher = null;
			int id = (Integer) session.getAttribute("Id");
			String[] fullname = req.getParameter("FullName").split(" ");
			String firstName = fullname[0];
			String lastName = fullname[1];
			String email = req.getParameter("email");
			String address = req.getParameter("address");
			String phoneNumber = req.getParameter("phone");
			String workingDays[] = req.getParameterValues("workingDays");
			String workingHours[] = req.getParameterValues("workingHours");
			
			
			String password = req.getParameter("passwordNew");
			
			if(password.isEmpty()) {
				password = req.getParameter("password");
			}
			
			String days = "";
			String hours = "";
			
			for (String s : workingDays) {
				days += s + "-";
			}

			for (String s : workingHours) {
				hours += s + "-";
			}
			
			try {
				connection = DataBaseConnection.getConnection();
				  System.out.println("Database is Connected !");

				ps = connection.prepareStatement(
						"UPDATE `doctor` SET `First_Name`=?,`Last_Name`=?,`Email`=?,`Number_Phone`=?,"
						+ "`Address`=?,`Work_Days`=?,`Work_Hours`=?,`Password`=? WHERE id = ?");
				
				ps.setString(1, firstName);
				ps.setString(2, lastName);
				ps.setString(3, email);
				ps.setString(4, phoneNumber);
				ps.setString(5, address);
				ps.setString(6, days);
				ps.setString(7, hours);
				ps.setString(8, password);
				ps.setInt(9, id);
			
				int rowsCount = ps.executeUpdate();
				  
				if (rowsCount > 0) {
					  req.setAttribute("status", "success");
					  dispatcher = (RequestDispatcher) req.getRequestDispatcher("/Doctor/profil.jsp");
					  session.setAttribute("fullname", firstName +" "+ lastName);
					  session.setAttribute("FisrtName", firstName);
					  session.setAttribute("LastName", lastName);
					  session.setAttribute("Email", email);
					  session.setAttribute("Phone", phoneNumber);
					  session.setAttribute("Adress", address);
					  session.setAttribute("Password", password);
					  session.setAttribute("WorkingDays", days);
					  session.setAttribute("WorkingHours", hours);

				  } else { 
					  req.setAttribute("status", "failed");
				  }
				  
				  
				ps.close();
				dispatcher.forward(req, resp);

				connection.close();

			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
