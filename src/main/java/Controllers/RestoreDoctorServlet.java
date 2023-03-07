package Controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.DoctorDao;

@WebServlet(urlPatterns = "/RestorDoctor")

public class RestoreDoctorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		if(DoctorDao.restore(id) == 1) {
			response.sendRedirect("/telemedicneApp/TrachDoctor?status=successRestore");
		}else {
			response.sendRedirect("/telemedicneApp/TrachDoctor?status=failed");
		}
	}

	
}
