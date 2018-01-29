package com.techlabs.controllers.services;

public class TransactionFailedException extends Exception{
	private static final long serialVersionUID = 1L;
	
	@Override
	public String getMessage() {
		return "SQL Transaction failed";
	}

}
