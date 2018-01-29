package com.techlabs.struct.spring.hibernate.viewmodel;

public class AddStudentViewModel {
	private boolean postBack=false;
	private String name;
	private int rollNo;
	public boolean isPostBack() {
		return postBack;
	}
	public void setPostBack(boolean postBack) {
		this.postBack = postBack;
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
