package Xyz;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Serv
 */
@WebServlet("/Serv")
public class Serv extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Serv() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		response.setContentType("text/html");
		PrintWriter pw =response.getWriter();
		
		String name=request.getParameter("name");			
		String address=request.getParameter("address");
		
		HttpSession obj =request.getSession();
	
		obj.setAttribute("name", name);
		obj.setAttribute("address", address);
		
		pw.print("First page");
		pw.print("<a href='Serv2'>visit</a>");
		
		pw.close();
		
		
	//	pw.println("this is session Id ----"+obj.getId());
		//pw.println("this session is  time ....."+ new Date(obj.getCreationTime()));
	//	pw.println("this is session is get class accesssed...."+ new Date (obj.getLastAccessedTime()));
		
	
	}

}
