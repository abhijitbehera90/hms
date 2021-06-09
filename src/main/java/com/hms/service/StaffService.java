package com.hms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hms.bean.Staffinfo;
import com.hms.entity.Staff;
import com.hms.repository.StaffRepository;

@Service
public class StaffService 
{

	@Autowired
	StaffRepository staffRepository;
	
	public Staff register(Staffinfo staffinfo) {
		return staffRepository.save(staffinfo.convertToEntity());
	}
	
	public Staff update(Staff staff) {
		return staffRepository.save(staff);
	}
	
	public List<Staff> getAll() {
		return staffRepository.findAll();
	}
	
	public Staff getById(Long id) {
		return staffRepository.getOne(id);
	}
}
