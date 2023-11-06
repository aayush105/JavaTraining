package com.bway.springtestdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.bway.springtestdemo.model.User;
import com.bway.springtestdemo.repository.UserRepository;

@Controller
public class SignupController {
	
	@Autowired
	private UserRepository userRepo;
	
	@GetMapping("/signup")
	public String getSignup() {
		
		return "SignupForm";
	}
	
	@PostMapping("/signup")
	public String postSignup(@ModelAttribute User user, Model model) {
		
		// password encryption
		user.setPassword(DigestUtils.md5DigestAsHex(user.getPassword().getBytes()));
		userRepo.save(user);

		return "LoginForm";
	}
	
	/*
	 * ---------- How to connect database in spring boot
	 * 	1> spring data JPA (Hibernate + Data API) // this is used now
	 * 		-> put dependency of "Spring Data JPA"
	 * 		-> put dependency of  Driver(Mysql Driver)
	 * 
	 * 	2> JDBC Template
	 * 
	 */
}
