package Models;

import java.sql.Date;

public class Appointment {
	
	private Date date;
	private int doctorId;
	private int patientId;
	private String status;
	
	public Appointment(Date date, int doctorId, int patientId, String status) {
		super();
		this.date = date;
		this.doctorId = doctorId;
		this.patientId = patientId;
		this.status = status;
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
	
	

}
