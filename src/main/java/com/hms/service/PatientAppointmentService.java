package com.hms.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hms.bean.PatientAppointmentInfo;
import com.hms.entity.PatientAppointment;
import com.hms.repository.PatientAppointmentRepository;

@Service

public class PatientAppointmentService {

	@Autowired
	PatientAppointmentRepository patientappointmentRepository;
	
	public PatientAppointment register(PatientAppointmentInfo patientappointmentInfo) {
		PatientAppointment patientAppointment=patientappointmentInfo.convertToEntity();
		patientAppointment.setRegistrationNo(generateRegistrationNo(patientappointmentInfo.getAppointmentDate()));
		return patientappointmentRepository.save(patientappointmentInfo.convertToEntity());
	}
	public long getCountByAppointmentDate(String appointmentDate ) {
		return patientappointmentRepository.getCountByAppointmentDate(appointmentDate);
	}
	public PatientAppointment update(PatientAppointment patientappointment) {
		return patientappointmentRepository.save(patientappointment);
	}
	
	
	public List<PatientAppointment> getAll() {
		return patientappointmentRepository.findAll();
	}
	
	public PatientAppointment getById(Long id) {
		return patientappointmentRepository.getOne(id);
	}
	
	private String generateRegistrationNo(String appointmentDate) {
	String regNo="";
	long count=patientappointmentRepository.getCountByAppointmentDate(appointmentDate);
	
	return appointmentDate+"-"+count;
	}
	
}
