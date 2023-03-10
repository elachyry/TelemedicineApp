package Models;

import java.sql.Date;

public class Appointment {
	
	private Date date;
	private String time;
	private int doctorId;
	private int patientId;
	private String status;
	private double amount;
	private String link;
	


	public Appointment(Date date, String time, int doctorId, int patientId, String status, double amount,
			String link) {
		super();
		this.date = date;
		this.time = time;
		this.doctorId = doctorId;
		this.patientId = patientId;
		this.status = status;
		this.amount = amount;
		this.link = link;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}



	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}
	
	

}
