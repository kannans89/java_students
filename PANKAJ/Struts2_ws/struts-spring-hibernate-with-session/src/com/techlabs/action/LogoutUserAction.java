package com.techlabs.action;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class LogoutUserAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	@Override
	public String execute() {
		ServletActionContext.getRequest().getSession().invalidate();
		return SUCCESS;
	}
}
