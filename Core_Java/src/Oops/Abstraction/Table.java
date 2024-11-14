package com.oops.Abstraction;

 abstract class Table {
  
	 public void print() {
		 for(int i=0; i<5; i++) {
			 System.out.println(i);
		 }
		 
	 }

	public abstract void printNumber();
}
