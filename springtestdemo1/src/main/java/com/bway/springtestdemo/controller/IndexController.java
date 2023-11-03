package com.bway.springtestdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // used for request processing
public class IndexController {

	@GetMapping("/hello") //root url
	public String index() {
		return "index";
	}
}
