package com.create.object.clone;

public class Worker implements Cloneable {
	private String name;
	private int rollNo;

	public Worker(String name, int rollNo) {
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
	
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	
	

}
