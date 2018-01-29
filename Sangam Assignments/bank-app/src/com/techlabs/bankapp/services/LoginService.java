package com.techlabs.bankapp.services;

import com.techlabs.bankapp.dao.AccountDao;

public class LoginService {
	public boolean isAuthoriseUser(String userName,String password)
	{
		return new AccountDao().isAutheriseUser(userName, password);
	}
}
