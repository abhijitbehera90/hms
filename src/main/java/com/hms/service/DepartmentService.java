package com.hms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hms.bean.Departmentinfo;
import com.hms.entity.Department;
import com.hms.repository.DepartmentRepository;
@Service
public class DepartmentService 
{
 
	@Autowired
	DepartmentRepository DepartmentRepository;
	
	public Department register(Departmentinfo departmentinfo) {
		return DepartmentRepository.save(departmentinfo.convertToEntity());
	}
	
	public Department update(Department departmen) {
		return DepartmentRepository.save(departmen);
	}
	
	public List<Department> getAll() {
		return DepartmentRepository.findAll();
	}
	
	public Department getById(Long id) {
		return DepartmentRepository.getOne(id);
		
	}

}