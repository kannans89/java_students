package com.techlabs.account;

public class Account {

	private final int accno;
	private final String name;
	private double balance;
	private static int accountHolder;
	private static double totalDesposit;
	private static double totalWithDraw;

	public Account(int acccno, String name, double balance) {
		this.accno = acccno;
		this.name = name;
		this.balance = balance;
		++accountHolder;
	}

	public Account(int accno, String name) {
		this(accno, name, 500);
	}

	public void deposit(double amt) {
		if (amt > 0) {
			balance = balance + amt;
			totalDesposit = totalDesposit + amt;
		}
	}

	public void withdraw(double amt) throws InSufficentException {
		if (amt <= 1000) {
			if ((balance - amt) > 0) {
				balance = balance - amt;
				totalWithDraw = totalWithDraw + amt;
			}
		} else
			throw new InSufficentException(this);
	}

	@Override
	public String toString() {
		String value = String.format("{accno : %d , Name : %s , Balance : %f}",
				this.accno, this.name, this.balance);

		return value;
	};

	public int getAccno() {
		return accno;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}

	public int getAccountHolder() {
		return accountHolder;
	}

	public static int totalHeadCount() {
		return accountHolder;
	}

	public static double totalDepositHappened() {
		return totalDesposit;
	}

	public static double totalWithdrawHappened() {
		return totalWithDraw;
	}

	static {
		accountHolder = 1000;
		totalDesposit = 0;
		totalWithDraw = 0;
	}
}
