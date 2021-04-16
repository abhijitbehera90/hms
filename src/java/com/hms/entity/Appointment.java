package com.hms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="patient_appointment")
public class Appointment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column
	private String name;
	@Column
	private String mob;
	@Column
	private String address;
	@Column
	private String appointmentDate;
	@Column
	private String previousVisitDate;
	@Column
	private String previousAppointmentSerialNo;
	@Column
	private String registrationNo;
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
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
	
	
	
	
	
	
}
