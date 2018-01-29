package com.techlabs.action;

import com.opensymphony.xwork2.Action;

public class LoginAction implements Action{

	private String userName;
	private String messege;
	
	@Override
	public String execute() throws Exception {
		messege="Hello "+userName+"! Welcome to struts2";
		return SUCCESS;
	}
	
	public void setUserName(String userName){
		this.userName=userName;
	}
	
	public String getMessege(){
		return messege; 
	}

}
