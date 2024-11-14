package com.oops;


 class B{
	
	public void Add() {
		System.out.println("superclass");
	}
}
public class Demo extends B {
	
	public void Add() {
		System.out.println("subclass...");
	}
	
	

	public static void main(String[] args) {
		//Demo d=new Demo();
	B d=new Demo();
		//Demo d=new B();//compile error
		d.Add();
		
	}

}
