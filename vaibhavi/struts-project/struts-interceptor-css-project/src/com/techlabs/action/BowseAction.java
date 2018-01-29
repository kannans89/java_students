package com.techlabs.action;

import com.opensymphony.xwork2.ActionSupport;

public class BowseAction extends ActionSupport {
	
	@Override
	public String execute() {
		System.out.println("Inside execute");
		
		return SUCCESS;
	}

}
