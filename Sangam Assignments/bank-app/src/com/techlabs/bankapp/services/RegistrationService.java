package com.techlabs.bankapp.services;

import java.sql.SQLException;

import com.techlabs.bankapp.Account;
import com.techlabs.bankapp.PasswordGenerator;
import com.techlabs.bankapp.dao.AccountDao;


public class RegistrationService {
	
	public void registerUser(String name,String email,String imgURL)
	{
		PasswordGenerator generatePass=new PasswordGenerator();
		String password=generatePass.genetatePassword(8);
		Account account=new Account(name,email,password,imgURL);
		AccountDao accDao=new AccountDao();
		try {
			accDao.registerUser(account);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	}

