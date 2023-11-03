package com.bway.springtestdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

	@GetMapping("/login")
	public String getLogin() {
		
		return "LoginForm";
	}
	
	@PostMapping("/login")
	public String postLogin() {
		
		return "Home";
	}
}
