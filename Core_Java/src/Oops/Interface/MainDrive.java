package com.oops.Interface;

public class MainDrive {

	public static void main(String[] args) {

		Bank b = null;
		b = new Hdfc();
		b.homeLoan(11.5, 250, 2);
		System.out.println("-------------------------------");

		b = new SBI();
		b.homeLoan(8.5, 100, 3);
	}

}
