package com.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthController {

	@RequestMapping("/login")
	public String getLoginForm() {
		return "views/login_form.jsp";
	}

	@RequestMapping("/login_action")
	public String checkAuth() {
		return "views/dashboard.jsp";
	}
}






