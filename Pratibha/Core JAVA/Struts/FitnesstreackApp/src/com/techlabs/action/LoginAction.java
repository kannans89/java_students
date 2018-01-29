package com.techlabs.action;

import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class LoginAction extends ActionSupport implements SessionAware{
private String name,password;
private SessionMap<String,Object> sessionMap;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

@Override
public void setSession(Map<String, Object> map) {
	sessionMap=(SessionMap)map;
}
@Override
public void validate() {
System.out.println("validate");
if(name.isEmpty())
		addFieldError("name","Name can't be blank");
	if(password.isEmpty())
		addFieldError("password","Password can't be blank");
	}

public String execute(){
	System.out.println("execute");
	return "success";


}

public String logout(){
	if(sessionMap!=null){
		sessionMap.invalidate();
	}
	return "success";
}

}
