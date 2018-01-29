package com.techlabs.controllers.components;

public class LowBalanceException extends Exception {
	private static final long serialVersionUID = 1L;

	@Override
	public String getMessage() {
		return "Customer Balance cannot get lower than 1000";
	}
}
