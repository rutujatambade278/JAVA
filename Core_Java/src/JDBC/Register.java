
package Micro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Register {

	private static String city;
	private static String Address;
	private static String NAME;
	private static String email;
	private static int Id;
	private static String password;

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		 try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				String url="jdbc:mysql://localhost:3306/Class";
			       String user="root";
			       String pass="root";
			    Connection con=DriverManager.getConnection(url, user, pass);
			    //Statement st=con.createStatement();
			   PreparedStatement p=con.prepareStatement("insert into register values(?,?,?,?,?,?)");
	         p.setInt(1, Id);
	         p.setString(2,NAME);
	         p.setString(3, Address);
	         p.setString(4,city);
	         p.setString(5,email);
	         p.setString(6,password);
	         
	        int i=p.executeUpdate();
	         
	         p.close();
	         
	        String sql="select * from register";
	        PreparedStatement ps=con.prepareStatement(sql);
	        ResultSet rs=ps.executeQuery();
	        while(rs.next()){
	             	System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5)+" "+rs.getString(6));
	        }    	   //     }
	               ps.close();
	               rs.close();
	               con.close();
	        
     }
     
	
	        catch (ClassNotFoundException e) {
	    		// TODO Auto-generated catch block
	    		e.printStackTrace();
	    		System.out.println("connected");
	    	}
	         
	    
	}

}
