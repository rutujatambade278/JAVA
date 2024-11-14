package Micro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		try {
		 Class.forName("com.mysql.cj.jdbc.Driver");
	     String URL="jdbc:mysql://localhost:3306/Class";
	     String User="root";
	     String pass="root";
	     Connection con=DriverManager.getConnection(URL,User,pass);
	       Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("select * from Teacher");
        while(rs.next())
        	System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
        
        con.close();
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
  // System.out.println("connect");
}
}

