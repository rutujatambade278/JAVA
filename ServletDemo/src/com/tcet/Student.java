package com.tcet;

import com.mypackages.Person;

public class Student extends Person {
	public Student() {
		super("Shailesh", 31, "Nagpur");
	}
}

class MainClass {
	public static void main(String[] args) {
		System.out.println(new Student());
	}
}
