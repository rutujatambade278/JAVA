package learn;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the year");
		int year=sc.nextInt();
		if((year%400== 0)||((year%4==0) &&(year%100!=0)))
	       {
	       System.out.println("year" + year + "is a leap year");
	       }
	    	   System.out.println("year" + year + "is not a leap year");
		}

	}

		
	
