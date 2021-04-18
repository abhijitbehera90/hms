package com.hms.bean;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import com.hms.entity.Appointment;

public class AppointmentInfo {

	private String id;
	private String name;
	private String mob;
	private String address;
	private String appointmentDate;
	private String previousVisitDate;
	private String previousAppointmentSerialNo;
	private String registrationNo;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMob() {
		return mob;
	}
	public void setMob(String mob) {
		this.mob = mob;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
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
	public String getPreviousAppointmentSerialNo() {
		return previousAppointmentSerialNo;
	}
	public void setPreviousAppointmentSerialNo(String previousAppointmentSerialNo) {
		this.previousAppointmentSerialNo = previousAppointmentSerialNo;
	}
	public String getRegistrationNo() {
		return registrationNo;
	}
	public void setRegistrationNo(String registrationNo) {
		this.registrationNo = registrationNo;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	
	public Appointment convertToEntity() {
		
		Appointment appointment= new Appointment();
		
		SimpleDateFormat format= new SimpleDateFormat("DD/MM/YYYY");
		appointment.setId(Long.valueOf(id));
		appointment.setName(name);
		appointment.setAddress(address);
		appointment.setPreviousAppointmentSerialNo(previousAppointmentSerialNo);
		appointment.setRegistrationNo(registrationNo);
		try {
			if(appointmentDate!=null || appointmentDate.equals(""))
			appointment.setAppointmentDate(format.parse(appointmentDate));
			if(previousVisitDate!=null || previousVisitDate.equals(""))
			appointment.setPreviousVisitDate(format.parse(previousVisitDate));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		return appointment;
	}
	
	
	
	
}
