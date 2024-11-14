package learn;

import java.util.Scanner;

public class Star6 {

	public static void main(String[] args) {
		// TODO Auto-generated method 

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of rows: ");

		int rows = sc.nextInt();

		for (int i = 1; i <= rows; i++) {

		for (int j = i; j < rows; j++) { 

		System.out.print(" ");

		}

		for (int k = 1; k <= i; k++) { 

		System.out.print("*"); 

		}

		System.out.println("");

		}

		for (int i = rows; i >= 1; i--) {

		for (int j = i; j <= rows; j++) { 

		System.out.print(" "); 

		}

		for (int k = 1; k < i; k++) { 

		System.out.print("*"); 

		}

		System.out.println("");

		}

		sc.close();

		}

		
	}


