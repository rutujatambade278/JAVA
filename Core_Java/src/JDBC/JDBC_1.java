package Micro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_1 {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
      
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/Student";
		String user="root";
		String pass="root";
		
		try {
			Connection con= DriverManager.getConnection(url, user, pass);
			Statement st=con.createStatement();
			//st.execute("create table junior_st(id int,name varchar(20),class varchar(50),Department varchar(20))");
			//st.executeUpdate("insert into junior_st values(1,'Neha','fy.cs','science')");
			st.executeUpdate("insert into junior_st values(2,'sejal','sy.cs','commarse')");
			st.executeUpdate("insert into junior_st values(3,'shruta','ty','science')");
			st.executeUpdate("insert into junior_st values(4,'Nikita','fy.cs','science')");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("connected");
	}

}
