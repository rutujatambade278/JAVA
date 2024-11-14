package learn;

import java.util.Scanner;

public class Star4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    Scanner sc = new Scanner(System.in);
		    System.out.println("Enter the number of rows: ");
		 
		    int rows = sc.nextInt();        
		    for (int i= 0; i<= rows-1 ; i++)
		    {
		        for (int j=0; j<=i; j++)
		        {
		            System.out.print(" ");
		        }
		        for (int k=0; k<=rows-1-i; k++)
		        {
		            System.out.print("*" + " ");
		        }
		        System.out.println();
		    }
		    sc.close();
		 
		}
		

	}

