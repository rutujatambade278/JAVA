package Micro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Banking_opration {

	 public static Connection con=null;
     public	static Statement st=null;
     
	public static  Connection dbconnect() {
   try {
		
	Class.forName("com.mysql.cj.jdbc.Driver");
	 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "root");

		if(con!=null) {
		//	System.out.println(" Data inserted successfully");
			//splay("Data inserted successfully");
			return con;

			}
		else {
			//System.out.println("Data does not inserted");
			display("Data does inserted successfully");
			
		}
		} catch (Exception e) {

		e.printStackTrace();
		}
   return null;
	}
	//defn the method 
	public static String display(String msg) {
		System.out.println(msg);
		return msg;
		}

	private String acoountNumber;
	/*
	public void AccountOpen(int accountNumber, String accountName,double balance) throws SQLException {
		try {
				if(con==null) {
				dbconnect();
				}
				else
		{
		st=con.createStatement();
		st.execute("insert into ACCOUNT values("+accountNumber+",'"+accountName+"',"+balance+")");
		display("insert query successfully");
		}
			
		}catch(Exception e) 
		 {
  	     System.out.println(e);
	    }
	}
	*/
	
//	public void update(int acoountNumber,double balance) throws SQLException {
//	  
//	  st=con.createStatement();
//	  st.executeUpdate("update account Set balance=balance+"+balance+"where acoountNumber="+acoountNumber+"");
//	  System.out.println("execute query"); 
//	  
//	  }
//	
	  public void withdrawal(int acuountNumber,double balance) throws SQLException {
		  st=con.createStatement();
			st.executeUpdate("update account Set balance=balance-"+balance+"where acoountNumber="+acoountNumber+"");	
	System.out.println("execute withdrawal query");
	
		  
	  }
	  
	  
	 
			
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Banking_opration b=new Banking_opration();
		b.dbconnect();
  // b.Accountopen();
// b.update(2,8000);
     b.withdrawal(51,5000);
		
	}

}
