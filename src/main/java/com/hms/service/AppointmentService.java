package com.hms.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hms.bean.AppointmentInfo;
import com.hms.entity.Appointment;
import com.hms.repository.AppointmentRepository;

@Service
public class AppointmentService {

	@Autowired
	AppointmentRepository appointmentRepository;
	
	public Appointment register(AppointmentInfo appointmentInfo) {
		return appointmentRepository.save(appointmentInfo.convertToEntity());
	}
	
	public Appointment update(Appointment appointment) {
		return appointmentRepository.save(appointment);
	}
	
	public List<Appointment> getAll() {
		return appointmentRepository.findAll();
	}
	
	public Appointment getById(Long id) {
		return appointmentRepository.getOne(id);
	}
}
