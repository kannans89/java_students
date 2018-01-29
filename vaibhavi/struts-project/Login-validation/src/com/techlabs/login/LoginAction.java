package com.techlabs.login;

import org.apache.commons.lang.StringUtils;


import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport { 
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String userName;
	String password;
	
	

	@Override
	public void validate()
	{
		
		if(userName!=null && password!=null)
		{
			System.out.println("inside if");
		if(StringUtils.isEmpty(userName))
		{
			System.out.println("inside if is empty");
			this.addFieldError("userName", "User name is empty");
			
		}
		if(StringUtils.isEmpty(password))
		{
			this.addFieldError("password", "Password is empty");
		}
		}
		System.out.println("inside validate");
		
	} 
	
	@Override
	public String execute()
	{
		System.out.println("inside execute..."+this.userName+ "---"+this.password);
		if(userName!=null && password!=null)
		{
		if(userName.equals("admin") && userName.equals("admin"))
		 {
			return SUCCESS;
		 }
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
