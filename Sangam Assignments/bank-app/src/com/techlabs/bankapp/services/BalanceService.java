package com.techlabs.bankapp.services;

import com.techlabs.bankapp.dao.AccountDao;

public class BalanceService {
	public double getBalance(String userName)
	{
		return new AccountDao().getUserBalance(userName);
	}

}
