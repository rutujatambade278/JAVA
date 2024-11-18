package controllers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

@Controller
@SessionAttributes("name")
public class TestController {
	
	@RequestMapping("/test")
	public void foo() {
		System.out.println("\n=====\nI am in foo\n====\n");
	}
	
	
	
	@RequestMapping(value="/bar", method = RequestMethod.GET)
	public String bar() {
//		System.out.println("\n\n====\nI am in bar\n====\n\n");
		return "response.jsp";
	}
	
	@RequestMapping(value="/fruits", method = RequestMethod.GET)
	public ModelAndView showData() {
		String name = "Reva";
//		
		ModelAndView mv = new ModelAndView("fruit_list.jsp");
		mv.addObject("fruit", "Orange");
		
		ArrayList fruit_list = new ArrayList();
		fruit_list.add("orange");
		fruit_list.add("banana");
		fruit_list.add("grapes");
		fruit_list.add("mango");
		
		mv.addObject("fruit_list", fruit_list);
		
		try{  
			Class.forName("com.mysql.cj.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
					"jdbc:mysql://localhost:3306/crudapp","root","");  
			//here sonoo is database name, root is username and password  
			Statement stmt=con.createStatement();
//			stmt.executeUpdate("insert into emp VALUES (null, 'Reva', 10, 'Nagpur')");
			ResultSet rs=stmt.executeQuery("select * from emp");  
			while(rs.next())
				System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4));  
			con.close();  
		} catch(Exception e){ System.out.println(e);}  
		
		return mv;
	}
	
	public String test() {
		
		
		return "test.jsp";
	}
	
}







