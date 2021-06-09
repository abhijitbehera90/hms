package com.hms.bean;


import java.text.ParseException;
import java.text.SimpleDateFormat;

import com.hms.entity.Doctor;
import com.hms.entity.Patient;
import com.hms.entity.PatientAppointment;

public class PatientAppointmentInfo {

	private String id;
	private String patientId;
	private String doctorId;
	private String appointmentDate;
	private String previousVisitDate;
	private String  priviousAppSerialNo;
	private String rgistrationNo;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPatientId() {
		return patientId;
	}
	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}
	public String getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}
	public String getAppointmentDate() {
		return appointmentDate;
	}
	public void setAppointmentDate(String appointmentDate) {
		this.appointmentDate = appointmentDate;
	}
	public String getPreviousVisitDate() {
		return previousVisitDate;
	}
	public void setPreviousVisitDate(String previousVisitDate) {
		this.previousVisitDate = previousVisitDate;
	}
	public String getPriviousAppSerialNo() {
		return priviousAppSerialNo;
	}
	public void setPriviousAppSerialNo(String priviousAppSerialNo) {
		this.priviousAppSerialNo = priviousAppSerialNo;
	}
	public String getRgistrationNo() {
		return rgistrationNo;
	}
	public void setRgistrationNo(String rgistrationNo) {
		this.rgistrationNo = rgistrationNo;
	}
	
	
public PatientAppointment convertToEntity() {
		
		PatientAppointment appointment= new PatientAppointment();

		if(id!=null  && id.trim()!="")			
		appointment.setId(Long.valueOf(id));
		appointment.setPriviousAppSerialNo(priviousAppSerialNo);
		appointment.setRegistrationNo(rgistrationNo);
		if(patientId!=null && patientId!="") {
			Patient patient= new Patient();
			patient.setId(Long.valueOf(patientId));
			appointment.setPatientId(patient);
		}
			if(doctorId!=null && doctorId!="") {
				Doctor doctor=new Doctor();
				doctor.setId(Long.valueOf(doctorId));
				appointment.setDoctorId(doctor);
			}
			
		
		SimpleDateFormat format= new SimpleDateFormat("DD/MM/YYYY");
		try {
			if(appointmentDate!=null && !appointmentDate.equals(""))
			appointment.setAppointmentDate(format.parse(appointmentDate));
			if(previousVisitDate!=null && !previousVisitDate.equals(""))
			appointment.setPreviousVisitDate(format.parse(previousVisitDate));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
	    	e.printStackTrace();
		}
		
		
		
		
		return appointment;
	  }
	
	
}