package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Department;
import com.example.respository.IDepartmentRepository;
@Service
public class IDepartmentServiceImpl implements IDepartmentService {

	@Autowired
	IDepartmentRepository departmentRepository;
	@Override
	public Department addDepartment(Department department) {
		
		
		
		return departmentRepository.save(department);
	}
	@Override
	public void updateDepartmnt(Department department) {
		// TODO Auto-generated method stub
		departmentRepository.save(department);
	}

}
