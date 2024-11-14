package Micro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC3 {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
       try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/Class";
	       String user="root";
	       String pass="root";
	    Connection con=DriverManager.getConnection(url, user, pass);
	    Statement st=con.createStatement();
	    ResultSet rs=st.executeQuery("select * from Teacher");
	     while(rs.next()) {
	    	 System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
	     }
	    
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.out.println("connected");
	}
       
	}

	
}
