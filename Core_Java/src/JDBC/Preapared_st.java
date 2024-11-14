package Micro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Preapared_st {
	
	public static Connection con=null;           //connection object
	public static PreparedStatement st=null;      //prepared statement.........
	

	public static  Connection dbconnect() {           //dbconnect method static
	    try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "root");
	     if(con!=null) {
			System.out.println(" Data inserted successfully");
			
				return con;

				}
			else {
		       System.out.println("Data does not inserted");
			}
			} catch (Exception e) {

			e.printStackTrace();
			}
	   return null;
	} //  end dbconnect...........
	   
	public void insertData() {
		  int row=0;
		  try {
			  String qry="insert into bank_account values(?,?,?)";
			  
			  st=con.prepareStatement(qry);
			 st.setInt(1, 98);
			 st.setString(2,"ovi");
			 st.setDouble(3,55000);
			 
			 row=st.executeUpdate();
			 
			 if(row==1) 
				 System.out.println("Data inserted");
				 
		  }
		  
	       catch(Exception e) {
				 System.out.println("exception in insert data");
				 
			 }
		  
	} // end insertData method.............
	
	//----------------main method--------


	public static void  main(String []args) {
		   Preapared_st p=new Preapared_st();
		   dbconnect();
		   p.insertData();
	   }
		
	}// end of class----------


