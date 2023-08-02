package com.bway.springpractice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.bway.springpractice.model.Doctor;
import com.bway.springpractice.repository.DoctorRespository;

@Controller
public class DoctorController {

	@Autowired
	private DoctorRespository docRepo;
	
	@GetMapping("/doctor")
	public String getDoctor() {
		
		
		return "Doctor";
	}
	
	@PostMapping("/doctor")
	public String postDoctor(Doctor doc,Model model) {
		
		docRepo.save(doc);
		
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

