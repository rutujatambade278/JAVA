package com.oops.Encapsulation;

public class Student {

	private int id;
	private String Name;
	private int Age;

	public Student() {

		super();

	}

	public Student(int id, String name, int age) {
		super();
		this.id = id;
		Name = name;
		Age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public static void main(String[] args) {

		Student s = new Student();
		s.setId(1);
		s.setName("Rutuja");
		s.setAge(23);

		System.out.println("Student id:" + s.getId());
		System.out.println("Student Name: " + s.getName());
		System.out.println("Student Age:" + s.getAge());
	}

}
