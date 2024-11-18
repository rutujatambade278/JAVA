package com.di;

import java.util.Scanner;

interface Shape {
	public void draw();
	public void area();
}

class Circle implements Shape {
	public void draw() {
		System.out.println("Draw a circle");
	}

	@Override
	public void area() {
		// TODO Auto-generated method stub
		
	}
}

class Rectangle implements Shape {
	public void draw() {
		System.out.println("Draw a rectangle");
	}

	@Override
	public void area() {
		// TODO Auto-generated method stub
		
	}
}

class DependencyInjection {
	Shape s;

	public DependencyInjection(Shape s) {
		super();
		this.s = s;
	}
	
	public void drawShape() {
		s.draw();
	}
}

class DependencyInjectionFactoryMethod {
	Shape s;
	
	public DependencyInjectionFactoryMethod(String str) {
		switch(str) {
			case "circle":
				s = new Circle();
				break;
				
			case "rectangle":
				s = new Rectangle();
				break;
			default:
				System.out.println("Invalid input");
		}
	}
	
	public void drawShape() {
		s.draw();
	}
}

public class MainClass {

	public static void main(String[] args) {
		System.out.println("Enter shape: e.g. circle or rectangle");
		
		Scanner sc = new Scanner(System.in);
		
		String shape = sc.nextLine();
		
//		String shape = "circle";
		
		DependencyInjectionFactoryMethod difm = 
				new DependencyInjectionFactoryMethod(shape);
		
		difm.drawShape();
		
//		DependencyInjection di = 
//				new DependencyInjection(new Rectangle());
//		
//		di.drawShape();
//		
//		Circle cobj = new Circle();
//		cobj.draw();
//		
//		Rectangle robj = new Rectangle();
//		robj.draw();
		
//		Shape s = new Rectangle();
//		s.draw();
		
		
	}
}




