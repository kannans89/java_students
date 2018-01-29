package com.techlabs.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.Action;

public class WishAction implements Action,SessionAware {
	
	private String yourName;
	private String messege;
	private Map<String,Object> sessionMap;
	
	@Override
	public String execute() throws Exception {
		
		
		if(this.sessionMap.containsKey("foo")){
			System.out.println("found foo");
		}
		if(yourName!=null){
			messege="Hello "+yourName+"! Welcome back.";
			System.out.println("In execute() method");
		}
		return SUCCESS;
	}

	public String getYourName() {
		return yourName;
	}

	public void setYourName(String yourName) {
		this.yourName = yourName;
	}
	
	public String getMessege(){
		return messege;
	}

	@Override
	public void setSession(Map<String, Object> arg0) {
		this.sessionMap=arg0;
		
	}

}
