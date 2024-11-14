package Micro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc4 {
   
	public static Connection con=null;
	public static Statement st=null;

	public static Connection Database() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver load the successfully");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "root");
		    System.out.println("connection build");
		
		    
		} catch (Exception e) {
            e.printStackTrace();
			}
		return con;
	
		}
	public void AccountOpen(int accountNumber, String accountName,double balance,double withdrawal,double deposite) throws SQLException {
		try {
				if(con==null) {
					Database();
				}
				else
		{
		
		st=con.createStatement();
		//st.execute("insert into account values("+accountNumber+",'"+accountName+"',"+balance+","+withdrawal+","+deposite+")");
	       // System.out.println("Data successsfully inserted");
		String s="insert into account values("+accountNumber+",'"+accountName+"',"+balance+","+withdrawal+","+deposite+")";
		st.execute(s);
		System.out.println("execute query");
		
		
		}
			
		}catch(Exception e) 
		 {
  	     System.out.println(e);
	    }
		
	}

	
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Jdbc4 j=new Jdbc4();
	//	Jdbc4.Database();
		j.AccountOpen(26, "Shruti", 11000, 5000, 15000);
		
		
	}

}
