package com.bway.springproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.bway.springproject.model.User;
import com.bway.springproject.repository.UserRepository;

@Controller
public class LoginController {

	@Autowired
	private UserRepository userRepo;
	
	@GetMapping("/login")
	public String getLogin() {
		
		return "LoginForm";
	}
	
	@PostMapping("/login")
	public String postLogin(@ModelAttribute User user,Model model) {
		
		
		User u = userRepo.findByUsernameAndPassword(user.getUsername(), user.getPassword());
		
		if(u != null) {
			
			// user name will go to uname
			model.addAttribute("uname", user.getUsername());
			return "Home";
		}else {
			
			model.addAttribute("message", "user not found !!");
			return "LoginForm";
		}
		
		
		
		
//		if(user.getUsername().equals("hari") && user.getPassword().endsWith("123")) {
//			
//			// user name will go to uname
//			model.addAttribute("uname", user.getUsername());
//			return "Home";
//		}else {
//			
//			model.addAttribute("message", "user not found !!");
//			return "LoginForm";
//		}
		
	}

}
