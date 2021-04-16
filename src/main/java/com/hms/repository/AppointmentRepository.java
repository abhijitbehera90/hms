package com.hms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.hms.entity.Appointment;

public interface AppointmentRepository extends JpaRepository<Appointment, Long>{
	

}
