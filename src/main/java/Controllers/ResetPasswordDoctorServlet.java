package Controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.DoctorDao;

@WebServlet(urlPatterns = "/resetPasswordDoctor")
public class ResetPasswordDoctorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		if(DoctorDao.restePassword(id) == 1) {
			response.sendRedirect("/telemedicneApp/AllDoctors?status=successResetPassword");
		}else {
			response.sendRedirect("/telemedicneApp/AllDoctors?status=failed");
		}
	}

}
