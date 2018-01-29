package com.techlabs.action;

import com.opensymphony.xwork2.ActionSupport;

public class WelcomeAction extends ActionSupport {
	
	public WelcomeAction() {
		System.out.println("welcome action created !!");
	}
	
	public String execute() {
		System.out.println("inside execute method");
		return "welcome";
	}

}
