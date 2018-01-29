package com.techlabs.interceptors;

import com.opensymphony.xwork2.Action;

public class GetHomeAction implements Action{

	@Override
	public String execute() throws Exception {
		return "success";
	}

}
