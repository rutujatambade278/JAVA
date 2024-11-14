package Micro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Account {
 
	
	private String acoountNumber;
	//insert data in database...........

	/* public static void AccountOpen(int accountNumber, String accountName,double balance) throws ClassNotFoundException, SQLException {
		 Connection con=null;
			Statement st=null;
			 try {
				 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","root");
				 System.out.println("Build the connection");
				 st=con.createStatement();
				st.execute("insert into ACCOUNT values("+accountNumber+",'"+accountName+"',"+balance+")");
				System.out.println("execute the query");
			
		     }catch(Exception e) 
			 {
	   	     System.out.println(e);
		    }
	 }
			 //end of the method
		 
	public void existingAccount(int accountNumber,double balance) {
		Connection con=null;
		Statement st=null;
		try {
			 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","root");
			 System.out.println("Build the connection");
			st=con.createStatement();
			st.executeUpdate("update account Set balance=balance+"+balance +"where acoountNumber="+acoountNumber+"");
			System.out.println("Execute the query");
		
	 }
		
		   catch(Exception e) 
	 {
	     System.out.println(e);
   }
}


*/
	//------------end of the method-------
	// withdrawal method ......
	public void withdrawal(int acoountNumber,double balance) {
		Connection con=null;
		Statement st=null;
		try {
			 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","root");
			 System.out.println("Build the connection");
			st=con.createStatement();
			st.executeUpdate("update account Set balance=balance-"+balance+"where acoountNumber="+acoountNumber+"");	
	}
	catch(Exception e) {
		System.out.println(e);
	}
	}
    public static void main(String[]args) throws ClassNotFoundException, SQLException {
		 Account a=new Account();
	//	 a.AccountOpen(6, "pradnya", 20000);
		// a.existingAccount(6, 2400);
		 a.withdrawal(12, 800);
	 }
	 
	 
	 
		 
}
