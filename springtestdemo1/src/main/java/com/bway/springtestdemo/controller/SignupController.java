package com.bway.springtestdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SignupController {
	
	@GetMapping("/signup")
	public String getSignup() {
		
		return "SignupForm";
	}
	
	@PostMapping("/signup")
	public String postSignup() {
		
		return "Home";
	}
}
