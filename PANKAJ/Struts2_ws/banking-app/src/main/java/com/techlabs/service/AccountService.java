package com.techlabs.service;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techlabs.entities.Account;
import com.techlabs.exceptions.BankingException;

@Service
public class AccountService {

	@Autowired
	SessionFactory sessionFactory;

	public void transferFunds(int from, int to, double amount) {
		Account fromAccount = getAccount(from);
		boolean amountWithdrawn = fromAccount.withdraw(amount);
		if (amountWithdrawn) {
			Account toAccount = getAccount(to);
			toAccount.deposit(amount);
		} else
			throw new BankingException("Insufficient Funds");
	}

	public boolean accountExists(int accno) {
		Account account = getAccount(accno);
		if (account == null)
			return false;
		return true;
	}

	private Account getAccount(int accno) {
		return (Account) sessionFactory.getCurrentSession().get(Account.class, accno);
	}

}
