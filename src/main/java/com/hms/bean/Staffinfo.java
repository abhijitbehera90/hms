package com.hms.bean;

import com.hms.entity.Department;
import com.hms.entity.Staff;

public class Staffinfo
{
	private String  id;
	private String  name;
	private String address;
	private String mob;
	private Department departmentId;
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
	
public Department getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(Department departmentId) {
		this.departmentId = departmentId;
	}
public Staff convertToEntity() {
		
		Staff staff= new Staff();
		if(id!=null  && id!="0")			
		staff.setId(Long.valueOf(id));
		staff.setName( name);
		staff.setAddress(address);
		staff.setMob(mob);
		staff.setDepartmentId(departmentId);
		
		
		return staff;
	  }
}
