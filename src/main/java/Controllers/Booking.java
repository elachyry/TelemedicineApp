package Controllers;

import java.io.IOException;
import java.sql.SQLException;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;

import Models.Doctor;
import Models.HelperClass;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Booking
 */
public class Booking extends HttpServlet {
	private static final long serialVersionUID = 1L;
	HelperClass help = new HelperClass();
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
		String Id = request.getParameter("Id");
		String workingHours[] = request.getParameterValues("workingHours");
		String date = request.getParameter("date");
		Doctor d;
		int itemId = Integer.parseInt(request.getParameter("itemId"));
		HelperClass h = new HelperClass();
		d = h.getDoctor(Id);
		for(int i;i<d.getWorkingDays().length;i++) {
			
		}
		
		System.out.println(help.FullDayNameExtractor(date));
		
		
			} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	 

}