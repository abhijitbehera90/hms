package com.hms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hms.bean.Doctorinfo;
import com.hms.entity.Doctor;
import com.hms.repository.DoctorRepository;
@Service

public class DoctorService 
{
	@Autowired
	DoctorRepository doctorRepository;
	
	public Doctor register(Doctorinfo doctorinfo) {
		return doctorRepository.save(doctorinfo.convertToEntity());
	}
	
	public Doctor update(Doctor doctor) {
		return doctorRepository.save(doctor);
	}
	
	public List<Doctor> getAll() {
		return doctorRepository.findAll();
	}
	
	public Doctor getById(Long id) {
		return doctorRepository.getOne(id);
	}
}
