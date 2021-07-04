package com.hms.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hms.bean.PatientAppointmentInfo;
import com.hms.entity.PatientAppointment;
import com.hms.service.PatientAppointmentService;



@RestController
@RequestMapping("/patientappointment")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class PatientAppointmentRestController {


	@Autowired
	PatientAppointmentService patientappointmentService;
	

	@RequestMapping("/checkAvailability")
	Boolean checkAppointment(@PathVariable String date){
		if(date.equalsIgnoreCase("14/05/2021"))
		return true;
		else 
			return false;
	}
	
	@RequestMapping(value="/register" , method=RequestMethod.POST) 
	PatientAppointment register(@RequestBody PatientAppointmentInfo patientappointmentInfo) {
	//	patientappointmentInfo.setRegistrationNo("");
		return patientappointmentService.register(patientappointmentInfo);		
	}
	
	@RequestMapping(value="/update" , method=RequestMethod.PUT) 
	PatientAppointment update(@RequestBody PatientAppointmentInfo patientappointmentinfo) {
		
		
		return patientappointmentService.update(patientappointmentinfo.convertToEntity());		
	}
	
	@GetMapping("/getAll")
	
	public List<PatientAppointment> getAll(){
		
		return patientappointmentService.getAll();
	}
	
@GetMapping("/getbyid")
	
	public PatientAppointment getById(@RequestParam("id") Long id){
		
		return patientappointmentService.getById(id);
	}
	
}
