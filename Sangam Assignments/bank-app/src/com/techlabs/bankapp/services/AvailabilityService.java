package com.techlabs.bankapp.services;

import com.techlabs.bankapp.dao.AccountDao;

public class AvailabilityService {
	public boolean checkAvailabilty(String userName)
	{
		return new AccountDao().isAvailable(userName);
	}

}
