package com.techlabs.controllers.components;

import java.util.UUID;

public class Customer {
	private final String customerID;
	private String name;
	private String username;
	private String password;
	private String emailID;
	private double balance;

	public Customer(String customerID, String name, String username,
			String password, String emailID, double balance)
			throws LowBalanceException {
		this.customerID = customerID;
		this.name = name;
		this.username = username;
		this.password = password;
		this.emailID = emailID;
		setBalance(balance);
	}

	public Customer(String name, String username, String password,
			String emailID, double balance) throws LowBalanceException {

		this(UUID.randomUUID().toString(), name, username, password, emailID,
				balance);
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) throws LowBalanceException {
		if (balance >= 1000)
			this.balance = balance;
		else
			throw new LowBalanceException();
	}

	public String getCustomerID() {
		return customerID;
	}

	public String getName() {
		return name;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public String getEmailID() {
		return emailID;
	}

	public void withdraw(double amount) throws LowBalanceException {
		setBalance(balance - amount);
	}

	public void deposit(double amount) throws LowBalanceException {
		setBalance(balance + amount);
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}

	public void performTransaction(Transaction transaction)
			throws LowBalanceException {

		if (transaction.getType() == TransactionType.Deposit)
			deposit(transaction.getAmount());

		if (transaction.getType() == TransactionType.Withdraw)
			withdraw(transaction.getAmount());
	}

	public void reverseTransaction(Transaction transaction) throws LowBalanceException {

		if (transaction.getType() == TransactionType.Deposit)
			withdraw(transaction.getAmount());

		if (transaction.getType() == TransactionType.Withdraw)
			deposit(transaction.getAmount());
	}
}
