package com.crud.Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.hibernate.query.Query;

import com.crud.db.HibernateDatabaseConnection;

@Controller
public class DashboardController {

	@RequestMapping("/dashboard")
	public String loadDashboard(Model m, 
			HttpServletRequest req, 
			HttpServletResponse res) throws IOException {
		
		
		String username = (String)req.getSession().getAttribute("username");
		
		if(username == null) {
			res.sendRedirect("login");
		}
		
		Session session = null;
		session = HibernateDatabaseConnection.getSessionFactory().openSession();
		Query query2 = session.createQuery("FROM Student");
		List students = query2.list();

		m.addAttribute("name", "Ravi");
		m.addAttribute("students_list", students);
		
		return "views/dashboard.jsp";
	
	}
	
	
}
