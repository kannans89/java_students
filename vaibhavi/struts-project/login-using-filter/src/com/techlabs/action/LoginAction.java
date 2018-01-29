package com.techlabs.action;
import com.opensymphony.xwork2.Action;

public class LoginAction implements Action {

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Inside Login Action");
		return INPUT;
	}

}
