package com.techlabs.bankapp;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.UUID;

public class Transaction {
	private String transId;
	private double amount;
	private TransactionType type;
	
	public Transaction(double amount, TransactionType type){
		this.amount=amount;
		this.type=type;
		setTransId();
	}
	public double getAmount()
	{
		return amount;
	}
	private void setTransId()
	{
		UUID uuid=UUID.randomUUID();
		transId=uuid.toString().replace("-","");
	}
	public TransactionType getTransactionType()
	{
		return type;
	}
	public String getTransId()
	{
		return transId;
	}
	public Timestamp getTransactionDateAndTime()
	{
		Calendar cal = Calendar.getInstance();
		Timestamp timestamp = new java.sql.Timestamp(cal.getTimeInMillis());
		return timestamp;
	}	

}
