package Controllers;

import java.io.IOException;
import jakarta.servlet.http.*;
import jakarta.servlet.*;

import DAO.DoctorDao;


public class DoctorSoftDeleteServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		if(DoctorDao.softDelete(id) == 1) {
			response.sendRedirect("/telemedicneApp/AllDoctors?status=successSoftDelete");
		}else {
			response.sendRedirect("/telemedicneApp/AllDoctors?status=failed");
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
