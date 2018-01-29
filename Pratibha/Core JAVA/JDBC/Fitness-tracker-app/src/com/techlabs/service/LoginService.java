package com.techlabs.service;

import com.techlabs.dao.LoginDao;

public class LoginService {
	public boolean getAuthentication(String user, String password) {
		LoginDao ld = new LoginDao();
		boolean isValid = ld.getLoginCredentials(user, password);
		if (isValid)
			return true;
		else
			return false;

	}

}
