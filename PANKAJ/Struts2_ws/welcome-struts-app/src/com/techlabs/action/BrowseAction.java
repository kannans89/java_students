package com.techlabs.action;

import com.opensymphony.xwork2.Action;

public class BrowseAction implements Action {

	private String messege="hello";

	@Override
	public String execute() throws Exception {
		return SUCCESS;
	}

	public String getMessege() {
		return messege;
	}

	public void setMessege(String messege) {
		this.messege = messege;
	}

}
