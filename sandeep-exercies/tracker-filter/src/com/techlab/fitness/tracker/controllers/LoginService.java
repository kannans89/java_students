package com.techlab.fitness.tracker.controllers;

public class LoginService {

	public boolean checkUser(String username, String password) {
		return new LoginDAO().validateUser(username, password);
		/*if(username.equals("root") && password.equals("root")){
			return true;
		}
		return false;*/
	}
}
