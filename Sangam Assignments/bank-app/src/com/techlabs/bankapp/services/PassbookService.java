package com.techlabs.bankapp.services;

import java.util.List;

import com.techlabs.bankapp.dao.BankTransactionDao;

public class PassbookService {
	public List<PassbookDto> getTransactionDetails(String name){
		return new BankTransactionDao().getPassbookDetails(name);
	}
}
