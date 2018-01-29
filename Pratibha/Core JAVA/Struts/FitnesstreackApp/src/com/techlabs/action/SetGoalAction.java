package com.techlabs.action;

import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.Action;
import com.techlabs.service.ValidationService;

public class SetGoalAction implements SessionAware,Action{
	private int time;
	private SessionMap<String,Object> sessionMap;

	public String execute() throws Exception {
		System.out.println(time);
		ValidationService validate = new ValidationService();
		boolean isValid = validate.validateGoal(time);
		if (isValid){
			sessionMap.put("time", time);
			sessionMap.put("totaltime", 0);
			sessionMap.put("timemsg","");
			return "success";
		}
		else {
			System.out.println("Excersice Goal Time Cannot Be Greater Than " + validate.getLimit());
			sessionMap.put("error", "Excersice Goal Time Cannot Be Greater Than "+validate.getLimit());
			// response.sendRedirect("http://localhost:8080/Fitness-tracker-app/SetGoal");
			return "failed";

		}
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	@Override
	public void setSession(Map<String, Object> map) {
		sessionMap=(SessionMap)map;
		
	}

}
