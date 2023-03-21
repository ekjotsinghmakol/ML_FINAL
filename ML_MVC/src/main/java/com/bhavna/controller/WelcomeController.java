package com.bhavna.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

	@RequestMapping("/login")
	public String Welcome() {
		return "login";
	}

	@RequestMapping("/login2")
	public String login() {
		return "login2";
	}
}
