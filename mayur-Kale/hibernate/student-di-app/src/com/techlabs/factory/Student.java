package com.techlabs.factory;

public class Student {
	private Mobile mobile;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(Mobile mobile) {
		this.mobile = mobile;
		System.out.println("Inside Student Constructor");
	}

	public void getStudent() {
		this.mobile.getMobile();
		System.out.println("Inside Student function");
	}

}
