package Micro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Insert1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Connection connection=null;
     Statement stmt=null;
       
     try {
    	 Class.forName("com.mysql.cj.jdbc.Driver");
    	 connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/class","root","root");
    	 stmt=connection.createStatement() ;
    	 stmt.execute("insert into Account_Detail values(3,'Neha',1000)");
    	 
    	 if(stmt!=null)
    	 System.out.println("Data inserted!");
    	 else
    		 System.out.print("not inserted");
    	 
     }
     catch(Exception e) {
    	 e.printStackTrace();
    	 
     }finally {
    	 try {
    		 stmt.close();
    		 connection.close();
    		 
    	 }catch(Exception e) {
    		 e.printStackTrace();    	 }
     }
     
	}

}
