package com.techlabs.action;

import org.apache.commons.lang.StringUtils;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	private String userName;
	private String password;

	@Override
	public void validate() {
		if (StringUtils.isEmpty(userName)) {
			this.addFieldError("userName", "UserName is empty");
		}
		if (StringUtils.isEmpty(password))
			this.addFieldError("password", "Password is empty");
		System.out.println("In validate() method");
	}

	@Override
	public String execute() {
		System.out.println("In execute() method");
		if (userName.equals("admin") && password.equals("admin")) {
			return "welcome";
		}
		return INPUT;

	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
