package com.bway.springproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bway.springproject.model.Employee;
import com.bway.springproject.service.DepartmentService;
import com.bway.springproject.service.EmployeeService;
import com.bway.springproject.utils.EmployeeExcelView;
import com.bway.springproject.utils.EmployeePDFView;

import jakarta.servlet.http.HttpSession;

@Controller
public class EmployeeController {

	@Autowired
	public EmployeeService empService;

	@Autowired
	private DepartmentService deptService;

	@GetMapping("/employee")
	public String getEmp(Model model, HttpSession session) {
		if (session.getAttribute("activeuser") == null) {
			return "LoginForm";
		}
		model.addAttribute("dList", deptService.getAllDepts());
		return "EmployeeForm";
	}

	@PostMapping("/employee")
	public String postEmp(@ModelAttribute Employee emp) {
		empService.addEmp(emp);

		return "redirect:/employee";
	}

	@GetMapping("/empList")
	public String empList(Model model, HttpSession session) {
		if (session.getAttribute("activeuser") == null) {
			return "LoginForm";
		}
		model.addAttribute("empList", empService.getAllEmps());

		return "EmployeeListForm";
	}

	@GetMapping("/emp/edit")
	public String editEmp(@RequestParam int id, Model model, HttpSession session) {
		if (session.getAttribute("activeuser") == null) {
			return "LoginForm";
		}
		model.addAttribute("eModel", empService.getEmpById(id));
		model.addAttribute("dList", deptService.getAllDepts());
		return "EmployeeEditForm";
	}

	@PostMapping("/emp/update")
	public String updateEmp(@ModelAttribute Employee emp, HttpSession session) {
		if (session.getAttribute("activeuser") == null) {
			return "LoginForm";
		}
		empService.updateEmp(emp);
		return "redirect:/empList";
	}

	@GetMapping("/emp/delete")
	public String deleteEmp(@RequestParam int id, HttpSession session) {
		if (session.getAttribute("activeuser") == null) {
			return "LoginForm";
		}
		empService.deleteEmp(id);
		return "redirect:/empList";
	}

	@GetMapping("/emp/excel")
	public ModelAndView excel() {

		ModelAndView mv = new ModelAndView(); // in this class we can both keep model and view
		mv.addObject("list", empService.getAllEmps());
		mv.setView(new EmployeeExcelView());

		return mv;
	}

	@GetMapping("/emp/pdf")
	public ModelAndView pdf() {
		ModelAndView mv = new ModelAndView();
		
		mv.addObject("list", empService.getAllEmps());
		mv.setView(new EmployeePDFView());
		return mv;
	}
}
