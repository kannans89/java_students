package com.techlabs.account.junit.test;

import junit.framework.Assert;
import org.junit.Test;
import com.techlabs.account.Account;
import com.techlabs.account.InsuffiecientFundException;

@SuppressWarnings("deprecation")
public class AccountJUnitTest {
	private double expectedAmount;
	private double actualAmount;
	private double withdraw;
	private double deposite;
	@Test(expected=RuntimeException.class)
	public void withdrawTest() {
		withdraw = 500;
		Account acc = new Account("Sangam", 1000); // Arrange
		expectedAmount = acc.getBalance() - withdraw;
		acc.withdraw(withdraw); // act
		actualAmount = acc.getBalance();
		Assert.assertEquals(expectedAmount, actualAmount); // assert
	}
	@Test(expected=RuntimeException.class)
	public void depositTest() {
		deposite = 50000;
		Account acc1 = new Account("Vilas", 5000); // Arrange
		expectedAmount = acc1.getBalance() + deposite;
		acc1.deposit(deposite); // act
		actualAmount = acc1.getBalance();
		Assert.assertTrue(expectedAmount==actualAmount); // assert
	}
	@Test(expected=RuntimeException.class)
	public void minimumBalanceShouldBeThousand()
	{
		withdraw=110;
		Account acc2=new Account("Pratik",1000);
		acc2.withdraw(withdraw);
		Assert.assertTrue(1000==acc2.getBalance());
	}
	@Test(expected=RuntimeException.class)
	public void cannotDepositeNegativeAmount()
	{
		deposite=-10;
		Account acc4=new Account("Santosh",1000);
		Assert.assertTrue(deposite<0);
	}
	@Test(expected=RuntimeException.class)
	public void cannotWithdrawNegativeAmount()
	{
		withdraw=-100;
		Account acc5=new Account("Sandeep",2000);
		Assert.assertTrue(withdraw<0);
	}
	
}
