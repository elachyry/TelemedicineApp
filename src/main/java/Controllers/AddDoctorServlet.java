package Controllers;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.DoctorDao;
import Models.Doctor;
import Models.Tools;

@WebServlet(urlPatterns = "/addDoctor")
public class AddDoctorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("/Admin/AddDoctor.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		if (request.getParameter("submit") != null) {
			String firstName = request.getParameter("firstName");
			String lastName = request.getParameter("lastName");
			String email = request.getParameter("email");
			String sex = request.getParameter("sex");
			String address = request.getParameter("address");
			String phoneNumber = request.getParameter("phoneNumber");
			String BirthDay = request.getParameter("BirthDay");
			String specialty = request.getParameter("specialty");
			String workingDays[] = request.getParameterValues("workingDays");
			String workingHours[] = request.getParameterValues("workingHours");
			
			try {
				System.out.println(Tools.checkField("doctor", "Email", email));
				if(Tools.checkField("doctor", "Email", email)) {
					response.sendRedirect("/telemedicine/addDoctor?status=emailExist");
					request.setAttribute("test", "test");
					return;
				}else if(Tools.checkField("doctor", "Number_Phone", phoneNumber)) {
					response.sendRedirect("/telemedicine/addDoctor?status=phoneExist");
					return;
				}
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			Doctor doctor = new Doctor(firstName, lastName, email, sex, address, phoneNumber, BirthDay, specialty, workingDays, workingHours);

			if(DoctorDao.addDoctor(doctor) == 1 ) {
				response.sendRedirect("/telemedicine/addDoctor?status=success");
			}else {
				response.sendRedirect("/telemedicine/addDoctor?status=failed");
			}
		}
	}

}
