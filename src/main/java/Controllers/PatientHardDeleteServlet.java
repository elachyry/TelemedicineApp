package Controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.PatientDao;

@WebServlet(urlPatterns = "/PatientHardDelete")

public class PatientHardDeleteServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		if(PatientDao.hardDelete(id)) {
			response.sendRedirect("/telemedicneApp/TrachPatient?status=failed");
		}else {
			response.sendRedirect("/telemedicneApp/TrachPatient?status=success");
		}
		
	}

}
