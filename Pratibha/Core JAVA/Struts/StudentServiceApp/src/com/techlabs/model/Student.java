package com.techlabs.model;

public class Student {
	private String name="ABC";
	private int rollno=100;
	private int age=10;

	public Student(){
		name="ABC";
		rollno=100;
		age=10;
		System.out.println("Student is ceated.");
	}
	public Student(String name,int rollno,int age){
		setAge(age);
		setName(name);
		setRollno(rollno);
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}