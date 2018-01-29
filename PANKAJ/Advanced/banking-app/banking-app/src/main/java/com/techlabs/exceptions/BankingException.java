package com.techlabs.exceptions;

public class BankingException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public BankingException(String messege) {
		super(messege);
	}

}
