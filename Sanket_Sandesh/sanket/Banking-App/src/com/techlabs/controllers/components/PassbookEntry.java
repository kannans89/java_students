package com.techlabs.controllers.components;

import java.sql.Date;

public class PassbookEntry {

	private final String srNo;
	private final String transactionID;
	private final Date date;
	private final double withdraw;
	private final double deposit;
	private final double balance;

	public PassbookEntry(String srNo, String transactionID, Date date,
			double withdraw, double deposit, double balance) {
		this.srNo = srNo;
		this.transactionID = transactionID;
		this.date = date;
		this.withdraw = withdraw;
		this.deposit = deposit;
		this.balance = balance;
	}

	public String getSrNo() {
		return srNo;
	}

	public Date getDate() {
		return date;
	}

	public double getWithdraw() {
		return withdraw;
	}

	public double getDeposit() {
		return deposit;
	}

	public double getBalance() {
		return balance;
	}

	public String getTransactionID() {
		return transactionID;
	}
}
