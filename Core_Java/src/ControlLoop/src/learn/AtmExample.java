package learn;

import java.util.Scanner;

public class AtmExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int balance = 100000, withdraw, deposite;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the amount:");
	    // int choice = sc.nextInt();
		while (true) {
			System.out.println("ATM");
			System.out.println("choose 1 for withdraw");
			System.out.println("choose 2 for deposite");
			System.out.println("choose 3 for cheak Balance");
			System.out.println("choose 4 Exit");
			System.out.println("choose the  operation you want to perform: ");

			int n = sc.nextInt();
			
			switch (n) {
			case 1:
				System.out.println("Enter money to be withdrawn:");
				withdraw = sc.nextInt();
				if (balance >= withdraw)
				{
					balance = balance - withdraw;
					System.out.println("please collect your money");
				}
				
				else {
					System.out.println("insufficient balance");
				     }
				System.out.println(" ");
				break;

			case 2:
				System.out.println("enter money to be deposited");

				deposite = sc.nextInt();
				balance = balance + deposite;
				System.out.println("your money has been successfully depsited");
				System.out.println("");
				break;
				
			case 3:
				System.out.println("Balance:" + balance);
				System.out.println("");
				break;
				
			case 4:
				System.exit(0);
				break;
			}
		}

	}

}
