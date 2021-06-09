package com.hms.bean;

import com.hms.entity.Doctor;

public class Doctorinfo 
{
	private String  id;
	private String  name;
	private String address;
	private String mob;
	private String specialization;
	private String qualification;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMob() {
		return mob;
	}
	public void setMob(String mob) {
		this.mob = mob;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	
public Doctor convertToEntity() {
		
		Doctor doctor= new Doctor();
		if(id!=null  && id!="0")			
		doctor.setId(Long.valueOf(id));
		doctor.setName( name);
		doctor.setAddress(address);
		doctor.setMob(mob);
		doctor.setQualification(qualification);
		doctor.setSpecialization(specialization);
		
		return doctor;
	  }

}
