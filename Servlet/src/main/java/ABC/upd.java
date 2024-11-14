package ABC;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class upd
 */
@WebServlet("/upd")
public class upd extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public upd() {
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
		String id =request.getParameter("id");
		String city=request.getParameter("city");
		try {
			
			 Class.forName("com.mysql.cj.jdbc.Driver");
			   System.out.println("Driver Load");
			   Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/class","root","root");
			   System.out.println("connection build");
			//String s="update servlet set city =? where id=?";
			PreparedStatement p= con.prepareStatement("update servlet set city = ? where id = ?");
			p.setString(1, id);
			p.setString(3, city);
			
			p.executeUpdate();
			p.close();
			con.close();
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
