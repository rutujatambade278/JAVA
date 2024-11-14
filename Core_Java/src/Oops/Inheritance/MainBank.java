package com.oops.Inheritance;

public class MainBank {

	public static void main(String[] args) {
		
		Bank b=null;
		
		b= new SBI();
		System.out.println("SBI:"+b);
		b.homeLoan(7.5, 100, 2);
		b=new HDFC();
		b.homeLoan(11.5, 500, 4);
		System.out.println("HDFC:"+b);
	}

}
