package com.oops.Interface;

public interface Shape {
  
	 public double calculatearea();
	   public double calculateArea() ;
}

 class Circle implements Shape{

	@Override
	public double calculatearea() {

	 double radius = 5;
	return Math.PI * radius * radius; 
	}

	@Override
	public double calculateArea() {
		
		int length = 22;
		int breadth = 5;
		return  length*breadth;
	}
	 
	class main{
		public static void main(String[] args) {
			
			Shape s = null;
			s.calculatearea();
			s.calculateArea();
		}
	}
	   
	    
 }
