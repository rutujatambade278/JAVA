package com.oops;

 class B_IMPL  implements Demo_A  {

	@Override
	public void Add() {
		
		System.out.println("method Add");
	}

	@Override
	public void sub() {
		System.out.println("sub method...");
	}
	public static void main(String[] args) {
		
		B_IMPL  b=new B_IMPL();
		b.Add();
		
	
	  
	}
	
 }
