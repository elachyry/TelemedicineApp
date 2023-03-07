package Controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.DoctorDao;

@WebServlet(urlPatterns = "/DoctorSoftDelete")

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
