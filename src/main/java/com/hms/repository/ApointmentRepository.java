package com.hms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hms.entity.Appointment;

public interface ApointmentRepository extends JpaRepository<Appointment, Long>{
	

}
