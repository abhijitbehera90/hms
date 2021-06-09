package com.hms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hms.bean.Doctorinfo;
import com.hms.entity.Doctor;
import com.hms.service.DoctorService;

@RestController
@RequestMapping("/doctor")
public class DoctorRestController 
{
	@Autowired
	DoctorService doctorService;
	

	
	@RequestMapping(value="/register" , method=RequestMethod.POST) 
	Doctor register(@RequestBody Doctorinfo doctorinfo) {
	  return doctorService.register(doctorinfo);		
	}
	
	@RequestMapping(value="/update" , method=RequestMethod.PUT) 
     Doctor update(@RequestBody Doctorinfo doctorinfo) {
		
		return doctorService.update(doctorinfo.convertToEntity());		
	}
	
	@GetMapping("/getAll")
	
	
	public List<Doctor> getAll(){
		
		return doctorService.getAll();
	}
	
@GetMapping("/getbyid")
	
	public Doctor getById(@RequestParam("id") Long id){
		
		return doctorService.getById(id);
	}

}
