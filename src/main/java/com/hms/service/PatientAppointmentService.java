package com.hms.service;
import java.util.Date;
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
		System.out.println(patientappointmentInfo.getAppointmentDate());
		PatientAppointment patientAppointment=patientappointmentInfo.convertToEntity();
		System.out.println(patientAppointment.getAppointmentDate());
		patientAppointment.setRegistrationNo(generateRegistrationNo(patientAppointment.getAppointmentDate(),patientappointmentInfo.getAppointmentDate()));
		return patientappointmentRepository.save(patientAppointment);
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
	
	private String generateRegistrationNo(Date appointmentDate,String  appDate) {
	System.out.println(appDate);
	System.out.println(appointmentDate.toString());
	long count=patientappointmentRepository.getCountByAppointmentDate(appointmentDate);
	
	System.out.println(count);
	String reg=(appDate+"-"+(++count)).replaceAll("/", "");
	System.out.println(reg);
	return reg;
	}
	
}
