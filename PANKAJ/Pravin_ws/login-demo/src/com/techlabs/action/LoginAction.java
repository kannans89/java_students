package com.techlabs.action;

import com.opensymphony.xwork2.Action;

public class LoginAction implements Action {

	@Override
	public String execute() throws Exception {
		System.out.println("Login done");
		return "success";
	}
}