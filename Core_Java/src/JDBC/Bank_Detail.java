package Micro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Bank_Detail {
	public static Connection con=null;
 public static Statement st=null;
private Object r_bal;
	
	public  Connection dbconnect() throws SQLException {
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
			}
   public void fun_insert(int A_Number, String A_Name,double balance) throws SQLException {
	    		try {
	    				if(con==null) {
	    				dbconnect();
	    				}
	    				else
	    		{
	    		st=con.createStatement();
	    		st.execute("insert into bank_account values("+A_Number+",'"+A_Name+"',"+balance+")");
	    		System.out.println("insert data query successfully");
	    		}
	    			
	    		}catch(Exception e) 
	    		 {
	      	     System.out.println(e);
	    	    }
	    	}
   // create method retrive------------------------------------------------
   public void retrive(int A_Number) throws SQLException {
		if(con==null) {
			dbconnect();
			
		}
		try {
			if(st==null) {
				st=con.createStatement();
			}
		
			ResultSet rs=st.executeQuery("select balance from bank_account where A_Number="+A_Number);
			while(rs.next()) {
				System.out.println("Account Number :"+rs.getString(1));
				
				
				System.out.println("retrive method inserted ");
			}
	         
		rs.close();
			return;
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
				}

	 // main method----------------------------------------------------
	
	        public static void main(String[]args) throws SQLException {
	        	Bank_Detail b=new Bank_Detail();
	        	b.dbconnect();
	        	//b.fun_insert(3, "Nikita", 16000);
	        	b.retrive(2);
	        }
	}


		
		
