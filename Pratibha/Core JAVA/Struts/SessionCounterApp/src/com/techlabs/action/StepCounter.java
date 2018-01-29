package com.techlabs.action;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class StepCounter extends ActionSupport implements SessionAware {
	private Map<String, Object> sessionMap;
	private int steps;
	private String message;
	private int goal = 1000;

	public int getSteps() {
		return steps;
	}

	public void setSteps(int steps) {
		this.steps = steps;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	
	public int getGOAL() {
		return goal;
	}

	public void setGOAL(int goal) {
		this.goal = goal;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.sessionMap = session;
	}

	public Map<String, Object> getMap() {
		return sessionMap;
	}

	@Override
	public String execute() {

		if (sessionMap.containsKey("currentsteps")
				&& sessionMap.containsKey("totalsteps")) {
			System.out.println("key found");
			sessionMap.put("currentsteps", this.steps);
			sessionMap.put("totalsteps", (int) sessionMap.get("totalsteps")
					+ (int) sessionMap.get("currentsteps"));
			if ((int) sessionMap.get("totalsteps") >= this.goal) {
				message = "Goal Reached";
			} else {
				message = "";
			}

		} else {

			sessionMap.put("currentsteps", 0);
			sessionMap.put("totalsteps", 0);
			System.out.println("key added");
			sessionMap.get("currentsteps");
		}
		return this.SUCCESS;

	}
}