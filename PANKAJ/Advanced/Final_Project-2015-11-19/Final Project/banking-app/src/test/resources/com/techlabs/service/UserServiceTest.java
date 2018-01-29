package com.techlabs.service;

import static org.fest.reflect.core.Reflection.field;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;

import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import com.techlabs.commons.UserType;
import com.techlabs.entities.Contact;
import com.techlabs.entities.Customer;
import com.techlabs.entities.Employee;
import com.techlabs.entities.User;
import com.techlabs.exceptions.BankingException;

public class UserServiceTest {
	User user;
	UserService userService;
	private Session session;
	private SessionFactory sessionFactory;

	@Before
	public void setUp() {
		userService = new UserService();
		session = Mockito.mock(Session.class);
		sessionFactory = Mockito.mock(SessionFactory.class);
	}

	@Test
	public void shouldLoginOnValidDetails() {
		user = new Customer(1, null, null, ' ', ' ', "RightPassword", 'A', null, null);

		field("sessionFactory").ofType(SessionFactory.class).in(userService).set(sessionFactory);

		Mockito.when(sessionFactory.getCurrentSession()).thenReturn(session);
		Mockito.when(sessionFactory.getCurrentSession().get(Customer.class, 1)).thenReturn(user);

		char userStatus = 'X';
		try {
			userStatus = userService.login(1, "RightPassword", UserType.CUSTOMER);
		} catch (BankingException e) {
		}
		assertEquals('A', userStatus);
	}

	@Test
	public void shouldNotLoginOnInvalidDetails() {
		user = new Customer(1, null, null, ' ', ' ', "RightPassword", 'A', null, null);

		field("sessionFactory").ofType(SessionFactory.class).in(userService).set(sessionFactory);

		Mockito.when(sessionFactory.getCurrentSession()).thenReturn(session);
		Mockito.when(sessionFactory.getCurrentSession().get(Customer.class, 1)).thenReturn(user);

		char userStatus = 'X';
		try {
			userStatus = userService.login(1, "WrongPassword", UserType.CUSTOMER);
		} catch (BankingException e) {
		}
		assertNotSame('A', userStatus);
	}

	@Test
	public void shouldChangePasswordOnValidCurrentPassword() {
		String newPassword = "hello";
		user = new Customer(1, null, null, ' ', ' ', "RightPassword", ' ', null, null);

		field("sessionFactory").ofType(SessionFactory.class).in(userService).set(sessionFactory);

		Mockito.when(sessionFactory.getCurrentSession()).thenReturn(session);
		Mockito.when(sessionFactory.getCurrentSession().get(Customer.class, 1)).thenReturn(user);

		try {
			userService.changePassword(1, UserType.CUSTOMER, "RightPassword", newPassword);
		} catch (BankingException e) {
		}
		assertEquals(user.getPassword(), newPassword);
	}

	@Test
	public void shouldNotChangePasswordOnInvalidCurrentPassword() {
		String newPassword = "hello";
		user = new Employee(1, null, null, ' ', ' ', "RightPassword", ' ', null, null, null);

		field("sessionFactory").ofType(SessionFactory.class).in(userService).set(sessionFactory);

		Mockito.when(sessionFactory.getCurrentSession()).thenReturn(session);
		Mockito.when(sessionFactory.getCurrentSession().get(Employee.class, 1)).thenReturn(user);

		try {
			userService.changePassword(1, UserType.EMPLOYEE, "WrongPassword", newPassword);
		} catch (BankingException e) {
		}
		assertNotSame(user.getPassword(), newPassword);
	}

	@Test
	public void shouldResetPasswordOnValidContactDetails() {
		String oldPassword = "password";
		Contact contact = new Contact(1, "p@p.com", "9898", null, 0, null, null);
		user = new Customer(1, null, null, ' ', ' ', oldPassword, ' ', null, contact);

		field("sessionFactory").ofType(SessionFactory.class).in(userService).set(sessionFactory);

		Mockito.when(sessionFactory.getCurrentSession()).thenReturn(session);
		Mockito.when(sessionFactory.getCurrentSession().get(Customer.class, 1)).thenReturn(user);
		try {
			userService.resetPassword(1, UserType.CUSTOMER, "9898", "p@p.com");
		} catch (BankingException e) {
		}
		assertNotSame(user.getPassword(), oldPassword);
	}

	@Test
	public void shouldNotResetPasswordOnInvalidContactDetails() {
		String oldPassword = "password";
		Contact contact = new Contact(1, "pankaj@gmail.com", "9876543210", null, 0, null, null);
		user = new Customer(1, null, null, ' ', ' ', oldPassword, ' ', null, contact);

		field("sessionFactory").ofType(SessionFactory.class).in(userService).set(sessionFactory);

		Mockito.when(sessionFactory.getCurrentSession()).thenReturn(session);
		Mockito.when(sessionFactory.getCurrentSession().get(Customer.class, 1)).thenReturn(user);
		try {
			userService.resetPassword(1, UserType.CUSTOMER, "1111", "xyz@abc.com");
		} catch (BankingException e) {
		}
		assertEquals(user.getPassword(), oldPassword);
	}

}
