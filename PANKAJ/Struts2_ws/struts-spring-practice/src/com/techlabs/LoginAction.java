package com.techlabs;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	private User user;

	public User getUser() {
		System.out.println("In getUser()");
		return user;
	}

	public void setUser(User user) {
		System.out.println("In setUser()");
		this.user = user;
	}

	@Override
	public String execute() {
		System.out.println("In execute()");
		return SUCCESS;
		// return INPUT;
	}

}
