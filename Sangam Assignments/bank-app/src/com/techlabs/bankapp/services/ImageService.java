package com.techlabs.bankapp.services;

import com.techlabs.bankapp.dao.AccountDao;

public class ImageService {
	public String getUserImage(String name){
		return new AccountDao().getImage(name);
	}
}
