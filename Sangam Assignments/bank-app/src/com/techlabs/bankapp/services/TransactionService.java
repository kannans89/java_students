package com.techlabs.bankapp.services;

import com.techlabs.bankapp.Transaction;
import com.techlabs.bankapp.TransactionType;
import com.techlabs.bankapp.dao.AccountDao;
import com.techlabs.bankapp.dao.BankTransactionDao;

public class TransactionService {
	public void getTransactionDetails(Double amount, String type,String name) {
		Transaction transaction;
		if (type.equals("D")) {
			transaction = new Transaction(amount, TransactionType.D);
		} else {
			transaction = new Transaction(amount, TransactionType.W);
		}
		
		new BankTransactionDao().createNewtransaction(transaction, name);
		new AccountDao().updateBalance(name, type, amount);
	}

}
