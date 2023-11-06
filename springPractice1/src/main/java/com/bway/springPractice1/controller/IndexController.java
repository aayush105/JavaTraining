package com.bway.springPractice1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller //used for request processing
public class IndexController {

	@GetMapping("/hello") //root request
	public String index() {
		return "index";
	}
}
