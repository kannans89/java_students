package com.techlab.account;

import org.junit.Test;

public class CurrentAccountWithdrawTest {

	@Test(expected = InsufficientFundException.class)
	public void testAdd() throws InsufficientFundException {
		new CurrentAccount(111, "ABDC", 10000).withdraw(90000);
		
	}

}
