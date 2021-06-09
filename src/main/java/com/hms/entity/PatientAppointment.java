package com.hms.entity;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="appointment")

public class PatientAppointment 
{
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long id;
     @JoinColumn
     @ManyToOne(targetEntity = Patient.class)
     private Patient patientId;
     @JoinColumn
     @ManyToOne(targetEntity = Doctor.class)
     private  Doctor  doctorId;
     @Column
     private Date appointmentDate;
     @Column
     private Date previousVisitDate;
     @Column
     private String priviousAppSerialNo;
     @Column
     private String registrationNo;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Patient getPatientId() {
		return patientId;
	}
	public void setPatientId(Patient patientId) {
		this.patientId = patientId;
	}
	public Doctor getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(Doctor doctorId) {
		this.doctorId = doctorId;
	}
	public Date getAppointmentDate() {
		return appointmentDate;
	}
	public void setAppointmentDate(Date appointmentDate) {
		this.appointmentDate = appointmentDate;
	}
	public Date getPreviousVisitDate() {
		return previousVisitDate;
	}
	public void setPreviousVisitDate(Date previousVisitDate) {
		this.previousVisitDate = previousVisitDate;
	}
	public String getPriviousAppSerialNo() {
		return priviousAppSerialNo;
	}
	public void setPriviousAppSerialNo(String priviousAppSerialNo) {
		this.priviousAppSerialNo = priviousAppSerialNo;
	}
	public String getRegistrationNo() {
		return registrationNo;
	}
	public void setRegistrationNo(String registrationNo) {
		this.registrationNo = registrationNo;
	}
	

	
}

