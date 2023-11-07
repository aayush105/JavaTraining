package com.bway.springPractice1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.bway.springPractice1.model.Doctor;
import com.bway.springPractice1.repository.DoctorRepository;

@Controller
public class DoctorController {
	
	@Autowired
	public DoctorRepository doctorRepo;

	@GetMapping("/doctor")
	public String getDoctor() {
		
		return "DocForm";
	}
	
	@PostMapping("/doctor")
	public String postDoctor(@ModelAttribute Doctor doc, Model model) {
		
		doctorRepo.save(doc);
		
		
		model.addAttribute("fname", doc.getFname());
		model.addAttribute("lname", doc.getLname());
		model.addAttribute("specialization", doc.getSpecialization());
		model.addAttribute("address", doc.getAddress());
		model.addAttribute("mobile", doc.getMobile());
		model.addAttribute("gender", doc.getGender());
		model.addAttribute("note", doc.getNote());
		model.addAttribute("photo", doc.getPhoto());
		
		return "DocProfile";
	}
}
