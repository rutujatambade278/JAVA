package Xyz;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Serv2
 */
@WebServlet("/Serv2")
public class Serv2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Serv2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	response.getWriter().append("Served at: ").append(request.getContextPath());
	
	response.setContentType("text/html");
	PrintWriter pw =response.getWriter();
		
   HttpSession obj=request.getSession();
	
	String name=(String)obj.getAttribute("name");
	String address=(String)obj.getAttribute("address");
	
	pw.print("name:"+name+"<br>");
	pw.print("address:"+address+"<br>");
	
	}
		
}