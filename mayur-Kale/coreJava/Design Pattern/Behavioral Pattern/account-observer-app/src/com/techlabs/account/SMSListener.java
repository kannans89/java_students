package com.techlabs.account;

public class SMSListener implements IBalanceListener{

	@Override
	public void onBalanceChanged(Account x) {
		System.out.println("Account detail of " + x.getName()
				+ " is send via SMS current balance:" + x.getBalance());
	}

}
