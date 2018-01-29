package com.techlabs.service;

import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import static org.fest.reflect.core.Reflection.field;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;
import com.techlabs.entities.Account;
import com.techlabs.exceptions.BankingException;

public class AccountServiceTest {
	private AccountService accountService;
	private Session session;
	private SessionFactory sessionFactory;

	@Before
	public void setUp() {
		accountService = new AccountService();
		session = Mockito.mock(Session.class);
		sessionFactory = Mockito.mock(SessionFactory.class);
	}

	@Test
	public void shouldTransferFundsOnSufficientFundsAvailable() {
		double oldBalance = 10000;
		Account from = new Account(1, oldBalance);
		Account to = new Account(2, 5000);

		field("sessionFactory").ofType(SessionFactory.class).in(accountService).set(sessionFactory);

		Mockito.when(sessionFactory.getCurrentSession()).thenReturn(session);
		Mockito.when(session.get(Account.class, 1)).thenReturn(from);
		Mockito.when(session.get(Account.class, 2)).thenReturn(to);

		try {
			accountService.transferFunds(from.getAccno(), to.getAccno(), 2000);
		} catch (BankingException e) {
		}
		assertNotSame(from.getBalance(), oldBalance);
	}

	@Test
	public void shouldNotTransferFundsOnInsufficientFunds() {
		double oldBalance = 2000;
		Account from = new Account(1, oldBalance);
		Account to = new Account(2, 5000);

		field("sessionFactory").ofType(SessionFactory.class).in(accountService).set(sessionFactory);

		Mockito.when(sessionFactory.getCurrentSession()).thenReturn(session);
		Mockito.when(session.get(Account.class, 1)).thenReturn(from);
		Mockito.when(session.get(Account.class, 2)).thenReturn(to);

		try {
			accountService.transferFunds(from.getAccno(), to.getAccno(), 3000);
		} catch (BankingException e) {
		}
		assertEquals(oldBalance, from.getBalance(), 0);
	}

	@Test
	public void shouldWithdrawFromAccount() {
		double newBalance = 8000;
		Account account = new Account(1, 10000);

		field("sessionFactory").ofType(SessionFactory.class).in(accountService).set(sessionFactory);

		Mockito.when(sessionFactory.getCurrentSession()).thenReturn(session);
		Mockito.when(session.get(Account.class, 1)).thenReturn(account);

		try {
			accountService.updateAccount(account.getAccno(), newBalance);
		} catch (BankingException e) {
		}
		assertEquals(newBalance, account.getBalance(), 0);
	}

	@Test
	public void shouldDepositIntoAccount() {
		double newBalance = 15000;
		Account account = new Account(1, 10000);

		field("sessionFactory").ofType(SessionFactory.class).in(accountService).set(sessionFactory);

		Mockito.when(sessionFactory.getCurrentSession()).thenReturn(session);
		Mockito.when(session.get(Account.class, 1)).thenReturn(account);

		try {
			accountService.updateAccount(account.getAccno(), newBalance);
		} catch (BankingException e) {
		}
		assertEquals(newBalance, account.getBalance(), 0);
	}

}
