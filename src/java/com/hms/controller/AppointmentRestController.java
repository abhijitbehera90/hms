package com.hms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hms.bean.AppointmentInfo;
import com.hms.entity.Appointment;
import com.hms.service.AppointmentService;

@RestController
@RequestMapping("/appointment")
public class AppointmentRestController {

	@Autowired
	AppointmentService appointmentService;
	
	@RequestMapping("/checkAvailability")
	Boolean checkAppointment(@PathVariable String date){
		if(date.equalsIgnoreCase("14/05/2021"))
		return true;
		else 
			return false;
	}
	
	@RequestMapping(value="/register" , method=RequestMethod.POST) 
	Appointment register(@RequestBody Appointment appointment) {
		appointment.setRegistrationNo("14042021001");
		
		return appointmentService.register(appointment);		
	}
	
	@RequestMapping(value="/update" , method=RequestMethod.PUT) 
	Appointment update(@RequestBody Appointment appointment) {
		//appointment.setRegistrationNo("14042021001");
		
		return appointmentService.update(appointment);		
	}
	
}
