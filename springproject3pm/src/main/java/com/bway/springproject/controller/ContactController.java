package com.bway.springproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;

@Controller
public class ContactController {

	@GetMapping("/contact")
	public String getContact(HttpSession session) {
		if(session.getAttribute("activeuser") == null) {
			return "LoginForm";
		}
	return "EmailForm";	
	}
	
	@PostMapping("/contact")
	public String postContact(@RequestParam String toEmail, @RequestParam String subjectString, @RequestParam String message) {
		
		return "EmailForm";
	}
}


