package com.bway.springPractice1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.bway.springPractice1.model.Patient;
import com.bway.springPractice1.repository.PatientRepository;

@Controller
public class PatientController {
	
	@Autowired
	public PatientRepository patRepo;

	@GetMapping("/patient")
	public String getPatient() {

		return "PatForm";
	}

	@PostMapping("/patient")
	public String postPatient(@ModelAttribute Patient pat, Model model) {
		
		patRepo.save(pat);

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
