package learn;

import java.util.Scanner;

public class Star5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the number of rows: ");
	 
	    int rows = sc.nextInt();    
	     for (int i=rows; i>= 1 ; i--)
	    {
	        for (int j = i; j < rows ; j++) {
	            System.out.print(" ");
	        }   
	        for (int k = 1; k <= (2*i -1) ;k++) {
	            if( k==1 || i == rows || k==(2*i-1)) {
	                System.out.print("*");
	            }
	            else {
	                System.out.print(" ");
	            }
	        }
	        System.out.println("");
	    }
	    sc.close();
	}
	}
	


