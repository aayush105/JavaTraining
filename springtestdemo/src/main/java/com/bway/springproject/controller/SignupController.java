package com.bway.springproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SignupController {

	@GetMapping("/signup")
	public String getSignup() {
		
		return "SignupForm";
	}
	
}
