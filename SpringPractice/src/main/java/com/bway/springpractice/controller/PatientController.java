package com.bway.springpractice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.bway.springpractice.model.Patient;

@Controller
public class PatientController {

	@GetMapping("/patient")
	public String getPatient() {
		
		return "Patient";
	}
	
	@PostMapping("/patient")
	public String postPatient(Patient pat, Model model) {
		
		model.addAttribute("fname", pat.getFname());
		model.addAttribute("lname", pat.getLname());
		model.addAttribute("mobile", pat.getMobile());
		model.addAttribute("gender", pat.getGender());
		model.addAttribute("dob", pat.getDob());
		model.addAttribute("status", pat.getStatus());
		model.addAttribute("paddress", pat.getPaddress());
		model.addAttribute("caddress", pat.getCaddress());
		model.addAttribute("medical", pat.getMedical());
		model.addAttribute("other", pat.getOther());
		model.addAttribute("detail", pat.getDetail());
		
		return "PatProfile";
	}
}
