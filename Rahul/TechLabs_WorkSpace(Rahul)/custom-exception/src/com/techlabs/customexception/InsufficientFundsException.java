package com.techlabs.customexception;

public class InsufficientFundsException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// constructor
	public InsufficientFundsException(Account acc) {
		account = acc;

	}

	public InsufficientFundsException(Account acc, double withdrawAmt) {
		this(acc);
		amountToWithdraw = withdrawAmt;

	}

	// Methods
	@Override
	public String getMessage() {
		String msg = "";
		if (amountToWithdraw > 0){
		msg = "HDFC bank Says there are no funds for "
				+ account.getAccountNumber() + ". Current Balance is :"
				+ account.getAccountBalance()+" and you are trying to withdraw "+ this.amountToWithdraw;
		}
		else 
		{
			msg = "HDFC bank Says there are no funds for "
					+ account.getAccountNumber() + ". Current Balance is :"
					+ account.getAccountBalance();
		}
		return msg;
		
	}

	// Instance Variables
	private Account account;
	private double amountToWithdraw = 0;
}
