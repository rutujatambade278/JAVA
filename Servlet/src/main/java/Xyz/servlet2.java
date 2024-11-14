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
 * Servlet implementation class servlet2
 */
@WebServlet("/servlet2")
public class servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
				
				String name=request.getParameter("name");			
				String address=request.getParameter("address");
				HttpSession obj =request.getSession();
			
				//response.setContentType("text/html");
				PrintWriter pw =response.getWriter();
				
				
				pw.println("this is session Id ----"+obj.getId());
				pw.println("this session is  time ....."+ new Date(obj.getCreationTime()));
				pw.println("this is session is get class accesssed...."+ new Date (obj.getLastAccessedTime()));
				
			}
}