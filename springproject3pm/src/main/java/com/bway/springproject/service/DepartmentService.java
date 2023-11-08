package com.bway.springproject.service;

import java.util.List;

import com.bway.springproject.model.Department;

public interface DepartmentService {

	void addDept(Department dept);

	void deleteDept(int id);

	void updateDept(Department dept);

	List<Department> getAllDepts();
	
	Department getDeptById(int id);

}
