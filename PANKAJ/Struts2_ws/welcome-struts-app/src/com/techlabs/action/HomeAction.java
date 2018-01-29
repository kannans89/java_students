package com.techlabs.action;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.Action;

public class HomeAction implements Action, SessionAware {

	private SimpleDateFormat time;
	private Map<String, Object> sessionMap;

	public HomeAction() {
		time = new SimpleDateFormat("dd-MM-yyyy hh-mm-ss");
	}

	@Override
	public String execute() throws Exception {
		if (this.sessionMap.containsKey("foo")) {
			System.out.println("found foo");
		} else
			this.sessionMap.put("foo", "this is foo");
		return SUCCESS;
	}

	public String getTime() {
		return time.format(new Date());
	}

	@Override
	public void setSession(Map<String, Object> map) {

		this.sessionMap = map;

	}
}
