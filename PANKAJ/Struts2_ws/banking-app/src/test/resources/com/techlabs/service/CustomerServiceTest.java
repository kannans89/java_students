package com.techlabs.service;

import static org.fest.reflect.core.Reflection.field;
import static org.junit.Assert.assertEquals;

import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import org.junit.Test;
import org.mockito.Mockito;

import com.techlabs.entities.Customer;
import com.techlabs.entities.Payee;
import com.techlabs.exceptions.BankingException;

public class CustomerServiceTest {

	CustomerService custService = new CustomerService();

	AccountService accService = Mockito.mock(AccountService.class);
	Session session = Mockito.mock(Session.class);
	SessionFactory sessionFactory = Mockito.mock(SessionFactory.class);

	@Test
	public void shouldRegisterPayeeOnValidDetails() {
		Customer customer = new Customer(1, null, null, ' ', ' ', "Password", ' ', null, null);
		Payee payee = new Payee(10, customer);

		field("sessionFactory").ofType(SessionFactory.class).in(custService).set(sessionFactory);
		field("accService").ofType(AccountService.class).in(custService).set(accService);

		Mockito.when(sessionFactory.getCurrentSession()).thenReturn(session);
		Mockito.when(sessionFactory.getCurrentSession().get(Customer.class, 1)).thenReturn(customer);
		Mockito.when(accService.accountExists(Mockito.anyInt())).thenReturn(true);

		try {
			custService.registerPayee(1, payee.getAccno(), "Password");
		} catch (BankingException e) {
		}
		assertEquals(1, customer.getPayees().size());
	}

	@Test
	public void shouldNotRegisterPayeeOnInvalidPassword() {
		Customer customer = new Customer(1, null, null, ' ', ' ', "Password", ' ', null, null);

		field("sessionFactory").ofType(SessionFactory.class).in(custService).set(sessionFactory);
		field("accService").ofType(AccountService.class).in(custService).set(accService);

		Mockito.when(sessionFactory.getCurrentSession()).thenReturn(session);
		Mockito.when(sessionFactory.getCurrentSession().get(Customer.class, 1)).thenReturn(customer);
		Mockito.when(accService.accountExists(Mockito.anyInt())).thenReturn(true);

		try {
			custService.registerPayee(1, 10, "WrongPassword");
		} catch (BankingException e) {
		}
		assertEquals(0, customer.getPayees().size());
	}

	@Test
	public void shouldNotRegisterPayeeOnInvalidAccountNumber() {
		Customer customer = new Customer(1, null, null, ' ', ' ', "Password", ' ', null, null);

		field("sessionFactory").ofType(SessionFactory.class).in(custService).set(sessionFactory);
		field("accService").ofType(AccountService.class).in(custService).set(accService);

		Mockito.when(sessionFactory.getCurrentSession()).thenReturn(session);
		Mockito.when(sessionFactory.getCurrentSession().get(Customer.class, 1)).thenReturn(customer);
		Mockito.when(accService.accountExists(Mockito.anyInt())).thenReturn(false);
		try {
			custService.registerPayee(1, 10, "Password");
		} catch (BankingException e) {
		}
		assertEquals(0, customer.getPayees().size());
	}
}
