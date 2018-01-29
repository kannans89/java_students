package com.techlabs.fitness.validation.service;

import java.sql.SQLException;

public class LoginService {
	public boolean isAuthoriseUser(String userId,String password) throws SQLException, ClassNotFoundException
	{
		return new LoginDao().isAuthoriseUser(userId, password);
	}
}
