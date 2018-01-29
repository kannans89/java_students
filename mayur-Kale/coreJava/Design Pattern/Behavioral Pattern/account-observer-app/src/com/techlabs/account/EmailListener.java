package com.techlabs.account;

public class EmailListener implements IBalanceListener {

	@Override
	public void onBalanceChanged(Account x) {
		System.out.println("Account detail of " + x.getName()
				+ " is send via Email current balance:" + x.getBalance());
	}

}
