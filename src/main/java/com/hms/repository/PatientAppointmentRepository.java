package com.hms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.hms.entity.PatientAppointment;

public interface PatientAppointmentRepository extends JpaRepository<PatientAppointment, Long>{
	

}
