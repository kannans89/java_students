package com.techlabs.account;

@SuppressWarnings("serial")
public class InsuffiecientFundException extends RuntimeException{
	
	public InsuffiecientFundException(Account account)
	{
		
	}
	@Override
	public String getMessage()
	{
		return "Insufficient balance:";
	}
}
