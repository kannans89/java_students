package com.techlabs.action;


import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.Action;

public class TrackExerciseAction implements Action,SessionAware {
	private SessionMap<String,Object> sessionMap;
private int addtime;
private int temp=0;
private String excercise;
	@Override
	public void setSession(Map<String, Object> map) {
		sessionMap=(SessionMap)map;
		
	}

	@Override
	public String execute() throws Exception {
		System.out.println(addtime+" "+temp);
		sessionMap.put("addtime", addtime);
		sessionMap.put("totaltime",(int) sessionMap.get("totaltime")+addtime);
		sessionMap.put("timemsg",(String)sessionMap.get("timemsg")+ "\nTime: "+addtime+" minite "+"Type: "+excercise);
		temp=temp+addtime;
		if((int)sessionMap.get("totaltime")>=(int)sessionMap.get("time"))
			sessionMap.put("msg", "Goal is Reached");
		return "success";
	}

	public int getAddtime() {
		return addtime;
	}

	public void setAddtime(int addtime) {
		this.addtime = addtime;
	}

	public String getExcercise() {
		return excercise;
	}

	public void setExcercise(String excercise) {
		this.excercise = excercise;
	}

}
