package com.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AuthController {

	@RequestMapping("/login")
	public String getLoginForm() {
		System.out.println("\n==\nI am in getlogin form\n===\n");
		return "views/login_form.jsp";
	}
	
	/**
	 * 
	 * @param nm
	 * @param req
	 * @return
	 */
	@RequestMapping("/login_action")
	public String checkAuth(
			@RequestParam("username") String nm, 
			HttpServletRequest req) 
	{
		
		req.getSession().setAttribute("unm", nm);
		
		return "views/dashboard.jsp";
	}
	
	@RequestMapping("/logout")
	public String destroySession(HttpServletRequest rq) {
		
		rq.getSession().invalidate();
		
		return "views/login_form.jsp";
	}
	
}

//@RequestParam("username") String nm

//String nm = request.getParamter("username");





