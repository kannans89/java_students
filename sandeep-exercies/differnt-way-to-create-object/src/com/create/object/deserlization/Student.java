package com.create.object.deserlization;

import java.io.Serializable;

public class Student  implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String name;
	private int rollNo;
	
	public Student(){
		
	}

	public Student(String name, int rollNo) {
		super();
		this.name = name;
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

}
