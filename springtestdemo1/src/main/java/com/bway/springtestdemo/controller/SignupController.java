package com.bway.springtestdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.bway.springtestdemo.model.User;

@Controller
public class SignupController {
	
	@GetMapping("/signup")
	public String getSignup() {
		
		return "SignupForm";
	}
	
	@PostMapping("/signup")
	public String postSignup(@ModelAttribute User user, Model model) {
		
		model.addAttribute("fname", user.getFname());
		model.addAttribute("lname", user.getLname());
		model.addAttribute("uname", user.getUsername());
		model.addAttribute("password", user.getPassword());
		return "Home";
	}
}
