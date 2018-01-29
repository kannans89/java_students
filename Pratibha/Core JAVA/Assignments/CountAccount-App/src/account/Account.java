package account;

import countAccount.CountAccountTest;

public class Account {
	private String name;
	private int accNo;
	private double balance;

	public Account(int accNo) {
		this(accNo, "null", 500);
	}

	public Account(int accNo, String name) {
		this(accNo, name, 500);
	}

	public Account(int accNo, String name, double balance) {
		this.accNo = accNo;
		this.name = name;
		this.balance = balance;
		CountAccountTest.setAccountCount(1);

	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}

	public int getAccountNo() {
		return accNo;
	}
}
