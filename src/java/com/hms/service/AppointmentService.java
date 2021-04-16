package com.hms.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hms.entity.Appointment;
import com.hms.repository.AppointmentRepository;

@Service
public class AppointmentService {

	@Autowired
	AppointmentRepository appointmentRepository;
	
	public Appointment register(Appointment appointment) {
		return appointmentRepository.save(appointment);
	}
	
	public Appointment update(Appointment appointment) {
		return appointmentRepository.save(appointment);
	}
}
