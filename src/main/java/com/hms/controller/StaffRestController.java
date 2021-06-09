package com.hms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hms.bean.Staffinfo;
import com.hms.entity.Staff;
import com.hms.service.StaffService;

@RestController
@RequestMapping("/staff")
public class StaffRestController
{
	@Autowired
	StaffService staffService;
	

	
	@RequestMapping(value="/register" , method=RequestMethod.POST) 
	Staff register(@RequestBody Staffinfo staffinfo) {
	  return staffService.register(staffinfo);		
	}
	
	@RequestMapping(value="/update" , method=RequestMethod.PUT) 
     Staff update(@RequestBody Staffinfo staffinfo) {
		
		return staffService.update(staffinfo.convertToEntity());		
	}
	
	@GetMapping("/getAll")
	
	
	public List<Staff> getAll(){
		
		return staffService.getAll();
	}
	
@GetMapping("/getbyid")
	
	public Staff getById(@RequestParam("id") Long id){
		
		return staffService.getById(id);
	}
}
