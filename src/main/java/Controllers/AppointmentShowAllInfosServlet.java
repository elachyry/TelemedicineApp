package Controllers;

import java.io.IOException;
import jakarta.servlet.http.*;
import jakarta.servlet.*;


public class AppointmentShowAllInfosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/Admin/AppointmentShowAllInfos.jsp").forward(request, response);

	}



}
