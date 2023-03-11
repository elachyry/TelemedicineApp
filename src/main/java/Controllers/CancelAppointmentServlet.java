package Controllers;

import java.io.IOException;

import DAO.AppointmentDao;
import DAO.DoctorDao;
import jakarta.servlet.http.*;
import jakarta.servlet.*;


public class CancelAppointmentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		if(AppointmentDao.updateStatus(id, "cancelled") == 1) {
			response.sendRedirect("/telemedicine/AllAppointments?status=failed");
		}else {
			response.sendRedirect("/telemedicine/AllAppointments?status=success");
		}
	}



}
