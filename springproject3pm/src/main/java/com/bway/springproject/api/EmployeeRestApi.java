package com.bway.springproject.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.PutExchange;

import com.bway.springproject.model.Employee;
import com.bway.springproject.service.EmployeeService;

@RestController
public class EmployeeRestApi {
	
	@Autowired
	private EmployeeService empService;

	@GetMapping("/api/emp/list")
	public List<Employee> getAll() {
		
		return empService.getAllEmps();
	}
	
	@GetMapping("/api/emp/{id}")
	public Employee getOne(@PathVariable int id) {
		
		return empService.getEmpById(id);
	}
	@GetMapping("/api/emp/add")
	public String add(@RequestBody Employee emp) {
		
		empService.addEmp(emp);
		return "Success";
	}
	@PutMapping("/api/emp/update")
	public String update(@RequestBody Employee emp) {
		
		empService.updateEmp(emp);
		return "Update Success";
	}
	@GetMapping("/api/emp/delete/{id}")
	public String delete(@PathVariable int id) {
		
		empService.deleteEmp(id);
		return "Detele Success";
	}
	
}
