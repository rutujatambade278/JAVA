package Micro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Select_Account {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		Connection con=null;
		Statement st=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/class","root","root");
			st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from Account_Detail where id=1");
			
			while(rs.next()) {
				System.out.println("Account Number :"+rs.getString(1));
				System.out.println("Account Holder Name :"+rs.getString(2));
				System.out.println("Account Balance :"+rs.getString(3));
				
				System.out.println(" ");
			}
			}
			
			catch(Exception e) {
				e.printStackTrace();
				}finally {
					try {
						st.close();
						con.close();
						}
					catch(Exception e) {
						e.printStackTrace();
					}
				}
	}

}
