package learn;

import java.util.Scanner;

public class Conditionstmt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the age:");
		int id =sc.nextInt();
         if(id>=18) {
        	 System.out.println("Allowed vote");
         }
         else {
        	 System.out.println("not allowed vote");
         }
	}

}
