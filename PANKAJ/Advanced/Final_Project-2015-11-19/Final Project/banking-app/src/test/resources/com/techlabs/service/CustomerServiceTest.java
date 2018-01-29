package com.techlabs.service;

import static org.fest.reflect.core.Reflection.field;
import static org.junit.Assert.assertEquals;

import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import com.techlabs.entities.Customer;
import com.techlabs.entities.Payee;
import com.techlabs.exceptions.BankingException;

public class CustomerServiceTest {

	private Customer customer;
	private CustomerService custService;
	private AccountService accService;
	private Session session;
	private SessionFactory sessionFactory;

	@Before
	public void setUp() throws Exception {
		custService = new CustomerService();
		accService = Mockito.mock(AccountService.class);
		session = Mockito.mock(Session.class);
		sessionFactory = Mockito.mock(SessionFactory.class);
	}

	@Test
	public void shouldRegisterPayeeOnValidDetails() {
		customer = new Customer(1, null, null, ' ', ' ', "Password", ' ', null, null);
		Payee payee = new Payee(10, customer);

		field("sessionFactory").ofType(SessionFactory.class).in(custService).set(sessionFactory);
		field("accService").ofType(AccountService.class).in(custService).set(accService);

		Mockito.when(sessionFactory.getCurrentSession()).thenReturn(session);
		Mockito.when(sessionFactory.getCurrentSession().get(Customer.class, 1)).thenReturn(customer);
		Mockito.when(accService.accountExists(payee.getAccno())).thenReturn(true);

		try {
			custService.registerPayee(1, payee.getAccno(), "Password");
		} catch (BankingException e) {
		}
		assertEquals(1, customer.getPayees().size());
	}

	@Test
	public void shouldNotRegisterPayeeOnInvalidPassword() {
		customer = new Customer(1, null, null, ' ', ' ', "Password", ' ', null, null);

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
		customer = new Customer(1, null, null, ' ', ' ', "Password", ' ', null, null);

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
