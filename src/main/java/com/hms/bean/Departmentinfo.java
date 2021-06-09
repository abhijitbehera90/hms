package com.hms.bean;

import com.hms.entity.Department;

public class Departmentinfo
{

	private String  id;
	private String name;
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

public Department convertToEntity() {
		
		Department department= new Department();
		if(id!=null  && id!="0")			
		department.setId(Long.valueOf(id));
		department.setName( name);
		
		
		return department;
   }
	

}