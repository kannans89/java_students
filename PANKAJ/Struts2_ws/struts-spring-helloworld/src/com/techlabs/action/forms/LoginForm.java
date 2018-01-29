package com.techlabs.action.forms;

import org.springframework.beans.factory.annotation.Autowired;

public class LoginForm {
	private String userName;
	private String password;
	
	public LoginForm(){
		System.out.println("In loginform constructor");
	}

	public String getUserName() {
		return userName;
	}

	@Autowired
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	@Autowired
	public void setPassword(String password) {
		this.password = password;
	}
}
