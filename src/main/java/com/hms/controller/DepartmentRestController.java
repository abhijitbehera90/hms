package com.hms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hms.bean.Departmentinfo;
import com.hms.entity.Department;
import com.hms.service.DepartmentService;

@RestController
@RequestMapping("/department")
public class DepartmentRestController
{
	@Autowired
	DepartmentService departmentService;
	

	
	@RequestMapping(value="/register" , method=RequestMethod.POST) 
	Department register(@RequestBody Departmentinfo departmentinfo) {
	  return departmentService.register(departmentinfo);		
	}
	
	@RequestMapping(value="/update" , method=RequestMethod.PUT) 
	Department update(@RequestBody Departmentinfo departmentinfo) {
		
		return departmentService.update(departmentinfo.convertToEntity());		
	}
	
	@GetMapping("/getAll")
	
	
	public List<Department> getAll(){
		
		return departmentService.getAll();
	}
	
@GetMapping("/getbyid")
	
	public Department getById(@RequestParam("id") Long id){
		
		return departmentService.getById(id);
	}
}
