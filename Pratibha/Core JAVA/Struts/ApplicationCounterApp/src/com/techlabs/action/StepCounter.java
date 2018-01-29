package com.techlabs.action;
import java.util.Map;

import org.apache.struts2.interceptor.ApplicationAware;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class StepCounter extends ActionSupport implements ApplicationAware {
	private Map<String, Object> appMap;
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

	
	public int getGoal() {
		return goal;
	}

	public void setGoal(int goal) {
		this.goal = goal;
	}

	@Override
	public void setApplication(Map<String, Object> app) {
		this.appMap = app;
	}

	public Map<String, Object> getMap() {
		return appMap;
	}

	@Override
	public String execute() {

		if (appMap.containsKey("currentsteps")
				&& appMap.containsKey("totalsteps")) {
			System.out.println("key found");
			appMap.put("currentsteps", this.steps);
			appMap.put("totalsteps", (int) appMap.get("totalsteps")
					+ (int) appMap.get("currentsteps"));
			if ((int) appMap.get("totalsteps") >= this.goal) {
				message = "Goal Reached";
			} else {
				message = "";
			}

		} else {

			appMap.put("currentsteps", 0);
			appMap.put("totalsteps", 0);
			System.out.println("key added");
			appMap.get("currentsteps");
		}
		return SUCCESS;

	}
}