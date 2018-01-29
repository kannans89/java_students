package com.techlabs;

public class User {

	private String userName;
	private String password;

	public String getUserName() {
		System.out.println("In getUserName()");
		return userName;
	}

	public void setUserName(String userName) {
		System.out.println("In setUserName()");
		this.userName = userName;
	}

	public String getPassword() {
		System.out.println("In getPassword()");
		return password;
	}

	public void setPassword(String password) {
		System.out.println("In setPassword()");
		this.password = password;
	}

}
