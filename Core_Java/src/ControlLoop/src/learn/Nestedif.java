package learn;

import java.util.Scanner;

public class Nestedif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc = new Scanner(System.in);
		//System.out.println("Enter the marks");
		//int marks = sc.nextInt();
		int marks=40;
		if (marks < 50) {
			System.out.println("fail");

			if (marks >= 50 && marks < 60) {
				System.out.println("D grade");

				if (marks >= 60 && marks < 70) {
					System.out.println("c grade");

					if (marks >= 70 && marks < 80) {
						System.out.println("B grade");

						if (marks >= 80 && marks < 90) {
							System.out.println("A grade");

							if (marks >= 90 && marks < 100) {
								System.out.println("A+ grade");
							} else {
								System.out.println("less than A+ grade");
							}
						} else {
							System.out.println("less than A grade");
						}
					} else {
						System.out.println("less than B grade");
					}
				} else {
					System.out.println("less than c grade");
				}
			} else {
				System.out.println("less than d grade");
			}
		} else {
			System.out.println("distinction");
		}
	}

}
