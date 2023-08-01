package com.bway.springproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.bway.springproject.model.User;

@Controller
public class LoginController {

	@GetMapping("/login")
	public String getLogin() {
		
		return "LoginForm";
	}
	
	@PostMapping("/login")
	public String postLogin(@ModelAttribute User user,Model model) {
		// to send data from controller to view "Model" is used
		
		if(user.getUsername().equals("hari") && user.getPassword().endsWith("123")) {
			
			// user name will go to uname
			model.addAttribute("uname", user.getUsername());
			return "Home";
		}else {
			
			model.addAttribute("message", "user not found !!");
			return "LoginForm";
		}
		
	}

}
