package com.techlabs.bankapp.services;

public class PassbookDto {

	private String transId;
	private double amount;
	private String type;
	private String date;
	private String acc_no;
	public PassbookDto(String transId,String accNo, double amount, String type, String date) {
		this.transId = transId;
		this.acc_no=accNo;
		this.amount = amount;
		this.type = type;
		this.date = date;
	}

	public String getTransId() {
		return transId;
	}
	public String getAccNo()
	{
		return acc_no;
	}

	public double getAmount() {
		return amount;
	}

	public String getTransactionType() {
		return type;
	}

	public String getTransactionDate() {
		return date;
	}


}
