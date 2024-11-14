package Micro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;


    public class Bank_jdbc {
	public static void deposit(int accountNumber, String accountName, double amount) throws Exception {

	Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "root");
       PreparedStatement preparedStatement = connection.prepareStatement("insert into account(accountNumber,accountName,amount) values(?,?,?)");
       preparedStatement.setInt(1, accountNumber);
       preparedStatement.setString(2, accountName);
       preparedStatement.setDouble(3, amount);
       preparedStatement.executeUpdate();

		}

		/*
           public static void withdraw(int accountNumber, double amount) throws
          SQLException { Connection connection =
          DriverManager.getConnection("jdbc:mysql://localhost:3306/bank");
          PreparedStatement preparedStatement =
          connection.prepareStatement("select*from account");
          preparedStatement.setInt(1, accountNumber); ResultSet resultSet =
          preparedStatement.executeQuery(); double balance = 0; while
         (resultSet.next()) { balance = resultSet.getDouble("balance");
          } 
          if (balance>= amount) 
          { balance -= amount; 
          PreparedStatement updateStatement =connection.prepareStatement("update account");
           updateStatement.setDouble(1, balance); updateStatement.setInt(2, accountNumber);
          updateStatement.executeUpdate(); 
          } else
           { 
           throw newRuntimeException("Insufficient balance"); 
           } }

		*/

		public static double getBalance(int accountNumber) throws Exception {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank", "root", "root");
        PreparedStatement preparedStatement = connection.prepareStatement("select * from account where accountNumber=?");
       preparedStatement.setInt(1, accountNumber);
        ResultSet resultSet = preparedStatement.executeQuery();
        double balance = 0 ;
        while (resultSet.next()) {
       balance = resultSet.getDouble("balance");

		}
     return balance;

		}

		public static void main(String[] args) {

		try {
        Bank_jdbc obj = new Bank_jdbc();

		obj.deposit(10, "Rutu", 1000);
		System.out.println("Deposit successful");

		//double balance = (double) jdbc8.getBalance(1000)
		//System.out.println("Balance: " +balance);

		obj.getBalance(500);

		} catch (Exception e) {

		e.printStackTrace();

		}

		}

		


    }

