package com.bway.springproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.bway.springproject.model.Department;
import com.bway.springproject.service.DepartmentService;

@Controller
public class DepartmentController {

	@Autowired
	private DepartmentService deptService;
	
	@GetMapping("/department")
	public String getDept() {
	
		return "DepartmentForm";
	}

	@PostMapping("/department")
	public String postDept(@ModelAttribute Department dept, Model model) {
		
		deptService.addDept(dept);
		
		return "DepartmentForm";
	}
	
}
