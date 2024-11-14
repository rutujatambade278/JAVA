package Micro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc5 {
	
	public static Connection con=null;
	public static Statement st=null;
	
	public static void dbconnect() {
	    try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("load driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "root");
		System.out.println("connection build");
	     if(con!=null) {
			System.out.println(" Data inserted successfully");
			

				}
			else {
		System.out.println("Data does not inserted");
		st=con.createStatement();
		}
			} catch (Exception e) {

		System.out.println(e.toString());
			}
	   
		}
		
//----------------------------------------------------------------------
	public void AccountOpen(int accountNumber, String accountName,double balance,double withdrawal,double deposite) throws SQLException {
		try {
				if(con==null) {
				dbconnect();
				}
				else {
					
		st=con.createStatement();
		st.execute("insert into account values("+accountNumber+",'"+accountName+"',"+balance+","+withdrawal+","+deposite+")");
		System.out.println("data inserted successfully");
		}
			
		}catch(Exception e) 
		 {
  	     System.out.println(e);
	    }
	}
	public static void main(String[] args) throws SQLException{
		// TODO Auto-generated method stub
		Jdbc5 j=new Jdbc5();
		//j.dbconnect();
		j.AccountOpen(17,"shiv", 3000, 300, 6000);
	}

}
