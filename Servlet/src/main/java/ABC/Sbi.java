package ABC;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Sbi
 */
@WebServlet("/Sbi")
public class Sbi extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Sbi() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String id=request.getParameter("id");
		String NAME=request.getParameter("NAME");
		String city=request.getParameter("city");
		
		System.out.println(id);
		System.out.println(NAME);
		System.out.println(city);
		
		response.setContentType("text/html");
		PrintWriter p=response.getWriter();
		   p.print(id);
		   p.print(NAME);
		   p.print(city);
		 
		 
		try {
		 Class.forName("com.mysql.cj.jdbc.Driver");
		   p.println("Driver Load");
		   Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/class","root","root");
		   
		    p.print("connection build");
		   
		      PreparedStatement ps=con.prepareStatement("insert into servlet values(?,?,?)");
		         ps.setString(1,id);
		         ps.setString(2,NAME);
		         ps.setString(3, city);
		         
		         
		       int i=  ps.executeUpdate();
		           
		     //  Statement st=con.createStatement();
		       //ResultSet rs= ps.executeQuery("select * from servlet");
		       
		         ps.close();
		         con.close();
		      // rs.close();
		     //  st.close();
		       
		       
		      response.sendRedirect("index.html");
		      //   response.sendRedirect("https://images.app.goo.gl/iQ6UX2SQPeRjeQP76");
		         
		}
		catch (Exception e) {
			System.out.println(e);			
		}
	}
}

