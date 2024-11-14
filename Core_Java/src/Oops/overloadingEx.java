package com.oops;

public class overloadingEx {
	
	
   static int  multiply(int a,int b) {
		
		return a*b;
	}
   
   static int Multiply(int a,int b,int c) {
	   
	   return a*b*c;
   }

	public static void main(String[] args) {
		
		System.out.println(overloadingEx.multiply(11, 11));
		System.out.println(overloadingEx.Multiply(10, 10, 10));
		
	}

}
