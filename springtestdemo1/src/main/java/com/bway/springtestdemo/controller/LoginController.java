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
public class LoginController {
	
	@Autowired
	private UserRepository userRepo;
	
	@GetMapping("/login")
	public String getLogin() {
		
		return "LoginForm";
	}
	
	@PostMapping("/login")
	public String postLogin(@ModelAttribute User user, Model model) {
		// to send data from controller to view "Model" is used
		
		// dynamic method
		
		user.setPassword(DigestUtils.md5DigestAsHex(user.getPassword().getBytes()));
		User usr = userRepo.findByUsernameAndPassword(user.getUsername(), user.getPassword());
		
		if(usr != null) {
			model.addAttribute("uname", user.getUsername());
			return "Home";
		}
		model.addAttribute("message", "user not found");
		return "LoginForm";
		/*
		// static method
		if(user.getUsername().equals("hari") && user.getPassword().equals("123")) {
		
			// user name will go to uname
			model.addAttribute("uname", user.getUsername());
			return "Home";
		}
		model.addAttribute("message", "user not found");
		return "LoginForm";
		*/
	}
}
