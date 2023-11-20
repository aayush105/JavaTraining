package com.bway.springproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bway.springproject.model.Employee;
import com.bway.springproject.service.DepartmentService;
import com.bway.springproject.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	public EmployeeService empService;

	@Autowired
	private DepartmentService deptService;
	
	@GetMapping("/employee")
	public String getEmp(Model model) {
		model.addAttribute("dList", deptService.getAllDepts());
		return "EmployeeForm";
	}

	@PostMapping("/employee")
	public String postEmp(@ModelAttribute Employee emp) {
		empService.addEmp(emp);

		return "redirect:/employee";
	}

	@GetMapping("/empList")
	public String empList(Model model) {

		model.addAttribute("eList", empService.getAllEmps());

		return "EmployeeListForm";
	}

	@GetMapping("/emp/edit")
	public String editEmp(@RequestParam int id, Model model) {

		model.addAttribute("eModel", empService.getEmpById(id));

		return "EmployeeEditForm";
	}

	@PostMapping("/emp/update")
	public String updateEmp(@ModelAttribute Employee emp) {

		empService.updateEmp(emp);
		return "redirect:/empList";
	}

	@GetMapping("/emp/delete")
	public String deleteEmp(@RequestParam int id) {

		empService.deleteEmp(id);
		return "redirect:/empList";
	}
}
