package com.techlabs.account;

public class InSufficentException extends Exception {
	Account account;

	public InSufficentException(Account account) {
		this.account = account;
	}

	@Override
	public String getMessage() {
		String errorMessage = this.account.getName()
				+ ", you have no funds.Your balance is "
				+ this.account.getBalance();
		return errorMessage;
	}

}
