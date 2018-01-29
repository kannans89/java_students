package com.techlabs.controllers.components;

import java.sql.Date;
import java.util.UUID;

public class Transaction {
	private final String transactionID;
	private final String customerID;
	private final TransactionType type;
	private final Date date;
	private final double amount;

	public Transaction(String transactionID, String customerID,
			TransactionType type, Date date, double amount) {

		this.transactionID = transactionID;
		this.customerID = customerID;
		this.type = type;
		this.date = date;
		this.amount = amount;
	}

	public Transaction(String customerID, TransactionType type, Date date,
			double amount) {

		this(UUID.randomUUID().toString(), customerID, type, date, amount);
	}

	public String getTransactionID() {
		return transactionID;
	}

	public String getCustomerID() {
		return customerID;
	}

	public TransactionType getType() {
		return type;
	}

	public Date getDate() {
		return date;
	}

	public double getAmount() {
		return amount;
	}

}
