package Micro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/Class";
	       String user="root";
	       String pass="root";
	    Connection con=DriverManager.getConnection(url, user, pass);
	    Statement st=con.createStatement();
	    System.out.println("Created stetatment");
	    
	    
	    Scanner sc=new Scanner(System.in);
	  //  System.out.println("enter your tableName");
	    System.out.println("enter your id");
       String id = sc.nextLine();
        
        System.out.println("enter your Name");
        String name=sc.nextLine();
        
        System.out.println("enter your class");
        String Eduction =sc.nextLine();
        
        
        String Query="insert into Teacher values ('"+id+"','"+name+"','"+Eduction+"')";
         st.executeUpdate(Query);
		}
        
	}


