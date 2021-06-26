package com.hms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.hms.entity.PatientAppointment;
public interface PatientAppointmentRepository extends JpaRepository<PatientAppointment, Long>{
@Query("SELECT COUNT(u) FROM PatientAppointment u WHERE u.appointmentDate= :appointmentDate")
public Long getCountByAppointmentDate(@Param("appointmentDate") String appointmentDate);


}
