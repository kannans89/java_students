package com.techlabs.action;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class LoginUserAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	private String userName;
	private String password;

	@Override
	public String execute() {
		System.out.println("In exec of Login with:"+userName+password);
		if (userName.equals("admin") && password.equals("admin")){
			ServletActionContext.getRequest().getSession().setAttribute("user", userName);
			return SUCCESS;
		}
		return INPUT;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		System.out.println("In setUserName with: "+userName);
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		System.out.println("In setPassword with: "+password);
		this.password = password;
	}

}
