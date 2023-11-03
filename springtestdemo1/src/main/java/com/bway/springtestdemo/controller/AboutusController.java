package com.bway.springtestdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AboutusController {
	
	@GetMapping("/about")
	public String getAbout() {
		
		return "AboutUs";
	}

}
