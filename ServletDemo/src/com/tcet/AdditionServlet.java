package com.tcet;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AdditionServlet extends HttpServlet{
	
	public void service(HttpServletRequest req, 
			HttpServletResponse res) throws IOException {
		System.out.println("i m in servlet");
		
		int x = Integer.parseInt(req.getParameter("num1"));
		int y = Integer.parseInt(req.getParameter("num2"));
		
		int z = x + y;
		
		System.out.println(z);
		
		res.getWriter().println(x + " + " + y + " = "+z);
	}
	
	
	
	
	

}
