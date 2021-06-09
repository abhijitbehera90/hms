package com.hms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.hms.bean.Patientinfo;
import com.hms.entity.Patient;
import com.hms.service.PatientService;

@RestController
@RequestMapping("/patientdetails")
public class PatientRestController
{
	@Autowired
	PatientService patientService;
	

	
	@RequestMapping(value="/register" , method=RequestMethod.POST) 
	Patient register(@RequestBody Patientinfo patientinfo) {
	  return patientService.register(patientinfo);		
	}
	
	@RequestMapping(value="/update" , method=RequestMethod.PUT) 
	Patient update(@RequestBody Patientinfo patientinfo) {
		
		return patientService.update(patientinfo.convertToEntity());		
	}
	
	@GetMapping("/getAll")
	
	
	public List<Patient> getAll(){
		
		return patientService.getAll();
	}
	
@GetMapping("/getbyid")
	
	public Patient getById(@RequestParam("id") Long id){
		
		return patientService.getById(id);
	}
}
