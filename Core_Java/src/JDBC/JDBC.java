package Micro;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.Statement;

public class JDBC {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
     Class.forName("com.mysql.cj.jdbc.Driver");
     String URL="jdbc:mysql://localhost:3306/Class";
     String User="root";
     String pass="root";
     Connection con=DriverManager.getConnection(URL,User,pass);
     Statement st=con.createStatement();
   // st.execute("create Database Class");
  //   st.execute("create table Teacher(id int,name varchar(20),education varchar(50))");
     //st.executeUpdate("insert into Teacher values(1,'rutuja','Degree')");
   //  st.executeUpdate("insert into Teacher values(2,'Pradnya','Degree bsc')");
    // st.executeUpdate("insert into Teacher values(3,'NIKITA','MSC')");
      st.execute("Delete from Teacher where name='NIKITA'");
     System.out.println("Connected");
	}

}
