package Controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.PatientDao;

@WebServlet(urlPatterns = "/ExportPatients")

public class ExportPatientsServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		try {
//			if(DoctorDao.export(response, "NULL")) {
//				response.sendRedirect("/telemedicneApp/AllDoctors?status=successExport");
//			}else {
//				response.sendRedirect("/telemedicneApp/AllDoctors?status=failed");
//			}
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		try {
			PatientDao.export(response, "NULL");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



}
