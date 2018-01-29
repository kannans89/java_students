package com.techlab.student.model;

public class Student {
	private int rollNo;
	private String name;
	private int age;
	public int getRollNo() {
		System.out.println("getting rollNo="+rollNo);
		return rollNo;
	}

	public String getName() {
		return name;
	}

	public void setRollNo(int 
			rollNo) {
		System.out.println("Setting rollNo="+rollNo);
		this.rollNo = rollNo;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

}
