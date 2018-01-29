package com.techlabs.service;

import static org.fest.reflect.core.Reflection.field;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;

import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import org.junit.Test;
import org.mockito.Mockito;

import com.techlabs.action.form.UserType;
import com.techlabs.entities.Contact;
import com.techlabs.entities.Customer;
import com.techlabs.entities.Employee;
import com.techlabs.entities.User;
import com.techlabs.exceptions.BankingException;

public class UserServiceTest {
	User user;
	UserService userService = new UserService();

	private Session session = Mockito.mock(Session.class);
	private SessionFactory sessionFactory = Mockito.mock(SessionFactory.class);

	/*
	 * @Test public void shouldLoginOnValidDetails() { // userForm = new
	 * UserForm(1, null, "RightPassword", null, // UserType.CUSTOMER); user =
	 * new Customer(1, null, null, ' ', ' ', "RightPassword", 'A', null, null);
	 * 
	 * field("sessionFactory").ofType(SessionFactory.class).in(userService).set(
	 * sessionFactory);
	 * 
	 * Mockito.when(sessionFactory.getCurrentSession()).thenReturn(session);
	 * Mockito.when(sessionFactory.getCurrentSession().get(Customer.class,
	 * 1)).thenReturn(user);
	 * 
	 * try { userService.login(1, "RightPassword", UserType.CUSTOMER); } catch
	 * (BankingException e) {
	 * 
	 * } assertEquals(loginResult, 'A'); System.out.println(); }
	 * 
	 * @Test public void shouldNotLoginOnInvalidDetails() { userForm = new
	 * UserForm(1, null, "WrongPassword", null, UserType.CUSTOMER); user = new
	 * Customer(1, null, null, ' ', ' ', "RightPassword", 'A', null, null);
	 * 
	 * field("sessionFactory").ofType(SessionFactory.class).in(userService).set(
	 * sessionFactory);
	 * 
	 * Mockito.when(sessionFactory.getCurrentSession()).thenReturn(session);
	 * Mockito.when(sessionFactory.getCurrentSession().get(Customer.class,
	 * 1)).thenReturn(user);
	 * 
	 * char loginResult = userService.login(userForm);
	 * 
	 * assertEquals(loginResult, 'X'); System.out.println(loginResult); }
	 */

	@Test
	public void shouldChangePasswordOnValidCurrentPassword() {
		String newPassword = "hello";
		user = new Customer(1, null, null, ' ', ' ', "RightPassword", ' ', null, null);

		field("sessionFactory").ofType(SessionFactory.class).in(userService).set(sessionFactory);

		Mockito.when(sessionFactory.getCurrentSession()).thenReturn(session);
		Mockito.when(sessionFactory.getCurrentSession().get(Customer.class, 1)).thenReturn(user);

		try {
			userService.changePassword(1, UserType.CUSTOMER, "RightPassword", newPassword);
			assertEquals(user.getPassword(), newPassword);
		} catch (BankingException e) {
		}
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
			assertNotSame(user.getPassword(), newPassword);
		}
	}

	@Test
	public void shouldResetPasswordOnForgotPassword() {
		String oldPassword = "password";
		Contact contact = new Contact(1, "p@p.com", "9898", null, 0, null, null);
		user = new Customer(1, null, null, ' ', ' ', oldPassword, ' ', null, contact);

		field("sessionFactory").ofType(SessionFactory.class).in(userService).set(sessionFactory);

		Mockito.when(sessionFactory.getCurrentSession()).thenReturn(session);
		Mockito.when(sessionFactory.getCurrentSession().get(Customer.class, 1)).thenReturn(user);

		userService.forgotPassword(1, UserType.CUSTOMER, "9898", "p@p.com");

		assertNotSame(user.getPassword(), oldPassword);
	}

}
