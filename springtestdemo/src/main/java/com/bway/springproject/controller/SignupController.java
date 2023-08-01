package com.bway.springproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bway.springproject.model.User;

@Controller
public class SignupController {

	@GetMapping("/signup")
	public String getSignup() {
		
		return "SignupForm";
	}
	
	@PostMapping("/signup")
	public String PostSignup(@ModelAttribute User user,
							@RequestParam String gender,
							@RequestParam String city,
							@RequestParam String hobbies, Model model) {
		// gender and city is not in POJO so to get the value from the form we declare it in the parameter
		
//		System.out.println("Gender= "+gender);
//		System.out.println("Gender= "+city);
//		System.out.println("Hobbies= "+hobbies);
		
		model.addAttribute("fname",user.getFname());
		model.addAttribute("lname", user.getLname());
		model.addAttribute("uname", user.getUsername());
		model.addAttribute("pw", user.getPassword());
		model.addAttribute("gender", gender);
		model.addAttribute("city", city);
		model.addAttribute("hobbies", hobbies);
		
		return "Profile";
		// profile
		
	}
}
