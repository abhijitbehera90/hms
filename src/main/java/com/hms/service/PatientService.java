package com.hms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hms.bean.Patientinfo;
import com.hms.entity.Patient;
import com.hms.repository.PatientRepository;

@Service
public class PatientService
{

	@Autowired
	PatientRepository patientRepository;
	
	public Patient register(Patientinfo patientinfo) {
		return patientRepository.save(patientinfo.convertToEntity());
	}
	
	public Patient update(Patient patient) {
		return patientRepository.save(patient);
	}
	
	public List<Patient> getAll() {
		return patientRepository.findAll();
	}
	
	public Patient getById(Long id) {
		return patientRepository.getOne(id);
	}
}
