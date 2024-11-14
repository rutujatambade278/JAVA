package learn;

import java.util.Scanner;

public class Ifelseif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc = new Scanner(System.in);
		//int marks = sc.nextInt();
		//System.out.println("Enter the marks:");
         int marks =70;
		if (marks < 50) {
			System.out.println("fail");
		} else if (marks >= 50 && marks < 60) {
			System.out.println("D grade");
		} else if (marks >= 60 && marks < 70) {
			System.out.println("c grade");
		} else if (marks >= 70 && marks < 80) {
			System.out.println("B grade");
		} else if (marks >= 80 && marks < 90) {
			System.out.println("A grade");
		} else if (marks >= 90 && marks < 100) {
			System.out.println("A+ grade");
		} else {
			System.out.println("invalid");
		}
	}

}
