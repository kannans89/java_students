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

	public void updateAccount(int accno, double newBalance) {
		Account account = getAccount(accno);
		double oldBalance = account.getBalance();
		if (newBalance < oldBalance)
			account.withdraw(oldBalance - newBalance);
		else
			account.deposit(newBalance - oldBalance);
	}

	public boolean accountExists(int accno) {
		getAccount(accno);
		return true;
	}

	public int getBalance(int accno) {
		return (int) getAccount(accno).getBalance();
	}

	private Account getAccount(int accno) {
		Account account = (Account) sessionFactory.getCurrentSession().get(Account.class, accno);
		if (account != null)
			return account;
		else
			throw new BankingException("Invalid Account Number");
	}

}
