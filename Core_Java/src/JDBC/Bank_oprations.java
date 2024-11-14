package Micro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Bank_oprations {

	 public static Connection con=null;
     public	static Statement st=null;
     
     //create method dbconnect-----
     
	public static  Connection dbconnect() {
    try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "root");
     if(con!=null) {
			//System.out.println(" Data inserted successfully");
			display("Data inserted successfully");
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
	
   //defn the method  display-------------
 	public static String display(String msg) {
		System.out.println(msg);
		return msg;
		}

private ResultSet rs;
 	/*
	public void AccountOpen(int accountNumber, String accountName,double balance,double withdrawal,double deposite) throws SQLException {
		try {
				if(con==null) {
				dbconnect();
				}
				else
		{
		st=con.createStatement();
		st.execute("insert into ACCOUNT values("+accountNumber+",'"+accountName+"',"+balance+","+withdrawal+","+deposite+")");
		display("insert data query successfully");
		}
			
		}catch(Exception e) 
		 {
  	     System.out.println(e);
	    }
	}
*/
	
	/*
	//create method update balance ----------------
	public void update(int acoountNumber,double balance) throws SQLException {
		  try {
			  if(con==null) {
				  dbconnect();
				  
			  }else {
				  
		  st=con.createStatement();
		  st.executeUpdate("update account Set balance=balance+"+balance+"where acoountNumber="+acoountNumber+"");
		  System.out.println("execute query in update"); 
		  
		  }
		  }catch(Exception e) {
			  System.out.println(e);
		  }
	}*/
 	
 /*	   void withdrawal(int acoountNumber,double withdrawal) {
 		try {
 			if(con==null) {
 				dbconnect();
 				
 			}else {
 				st=con.createStatement();
 				st.executeUpdate("update account set withdrawal=withdrawal-"+withdrawal+"where acoountNumber="+acoountNumber+" ");
 				 System.out.println("execute query in withdrawal"); 
 				  
 			  }
 			  }catch(Exception e) {
 				  System.out.println(e);
 			  }
 		}
 	*/
// ----------create the retrive method----------------------------------------------------------------
 	 public void retrive(int acoountNumber) throws SQLException {
 		if(con==null) {
 			dbconnect();
 			
 		}
 		try {
 			if(st==null) {
 				st=con.createStatement();
 			}
 		
 			while(rs.next()) {
 				System.out.println("Account Number :"+rs.getString(1));
 				
 				
 				System.out.println("retrive method inserted ");
 			} 			ResultSet rs=st.executeQuery("select balance from account where acoountNumber="+acoountNumber);

 	         
 			
 		
 			rs.close();
 			return;
 		}
 		
 		catch(Exception e) {
 			e.printStackTrace();
 		}
 	}
 	
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Bank_oprations b=new Bank_oprations();
		b.dbconnect();
	//	b.AccountOpen(25, "archana",70000, 700, 18000);
	 //   b.update(22, 1000);
//		b.withdrawal(24, 100);
		b.retrive(2);
		
	}

}
