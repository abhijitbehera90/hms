package com.hms.bean;

import com.hms.entity.Patient;

public class Patientinfo
{
	private String id;
	private String  name;
	private String address;
	private String mob;
	
	
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
	
public Patient convertToEntity() {
		
		Patient patient= new Patient();
		if(id!=null  && id!="0")			
		patient.setId(Long.valueOf(id));
		patient.setName( name);
		patient.setAddress(address);
		patient.setMob(mob);
		
		return patient;
	  }
	
}
