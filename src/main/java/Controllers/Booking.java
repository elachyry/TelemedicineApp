package Controllers;

import java.io.IOException;
import java.sql.SQLException;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;

import com.mysql.cj.Session;

import Models.Doctor;
import Models.HelperClass;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class Booking
 */
public class Booking extends HttpServlet {
	private static final long serialVersionUID = 1L;
	HelperClass help = new HelperClass();
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String Id = request.getParameter("Id");
		String workingHours[] = request.getParameterValues("workingHours");
		String date = request.getParameter("date");
		
		
		System.out.println("doctor id : "+Id);
		System.out.println("my id : "+session.getAttribute("Id"));
		
		
	
		
	}
	
	 

}