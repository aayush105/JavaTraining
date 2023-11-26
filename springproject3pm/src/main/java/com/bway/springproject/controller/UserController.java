package com.bway.springproject.controller;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.bway.springproject.model.User;
import com.bway.springproject.repository.UserRepository;
import com.bway.springproject.service.UserService;

import ch.qos.logback.classic.Logger;
import jakarta.mail.Session;
import jakarta.servlet.http.HttpSession;

@Controller
public class UserController {
	
	private static final Logger log = (Logger) LoggerFactory.getLogger(UserController.class);

	@Autowired
	private UserService userService;

	@GetMapping({ "/login", "/" }) // multiple url pattern
	public String getLogin() {

		log.info("------ inside login page -------");
		return "LoginForm";
	}

	@PostMapping("/login")
	public String postLogin(@ModelAttribute User user, Model model, HttpSession session) {

		user.setPassword(DigestUtils.md5DigestAsHex(user.getPassword().getBytes()));
		User usr = userService.userLogin(user.getEmail(), user.getPassword());

		if (usr != null) {
			log.info("------ login success -------");
			session.setAttribute("activeuser", usr);
			session.setMaxInactiveInterval(200);
//			model.addAttribute("uname", usr.getFname());
			return "Home";
		}
		model.addAttribute("message", "user not found!!");
		return "LoginForm";

	}

	@GetMapping("/signup")
	public String getSignup() {
		log.info("------ signup file loaded -------");
		return "SignupForm";
	}

	@PostMapping("/signup")
	public String postSignup(@ModelAttribute User user) {

		user.setPassword(DigestUtils.md5DigestAsHex(user.getPassword().getBytes()));

		userService.userSignup(user);

		return "LoginForm";
	}

	@GetMapping("/logout")
	public String logout(HttpSession session) {
		log.info("------ logout success -------");
		session.invalidate(); // session kill
		return "LoginForm";
	}

	@GetMapping("/profile")
	public String getProfile(HttpSession session) {
		if(session.getAttribute("activeuser") == null) {
			return "LoginForm";
		}
		return "Profile";
	}
}
