package com.bway.springproject.service;

import java.util.List;


import com.bway.springproject.model.Department;
import com.bway.springproject.model.Employee;


public interface EmployeeService {

	void addEmp(Employee emp);

	void deleteEmp(int id);

	void updateEmp(Employee emp);

	List<Employee> getAllEmps();
	
	Employee getEmpById(int id);
	
}
