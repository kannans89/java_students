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
import com.techlabs.entities.Employee;
import com.techlabs.exceptions.BankingException;

public class EmployeeServiceTest {
	private EmployeeService employeeService;
	private SessionFactory sessionFactory;
	private Session session;

	@Before
	public void setUp() {
		employeeService = new EmployeeService();
		sessionFactory = Mockito.mock(SessionFactory.class);
		session = Mockito.mock(Session.class);
	}

	@Test
	public void shouldChangeStatusOnNoBankingException() {
		Employee emp = new Employee(1, null, null, 'F', 'N', "password", 'L', null, null, null);

		field("sessionFactory").ofType(SessionFactory.class).in(employeeService).set(sessionFactory);

		Mockito.when(session.get(Employee.class, 1)).thenReturn(emp);
		Mockito.when(sessionFactory.getCurrentSession()).thenReturn(session);

		try {
			employeeService.changeUserStatus(1, 'A', UserType.EMPLOYEE);
		} catch (BankingException e) {
		}
		assertEquals('A', emp.getStatus());
	}

	@Test
	public void shouldNotChangeStatusOnBankingException() {
		Employee emp = new Employee(1, null, null, 'F', 'N', "password", 'L', null, null, null);

		field("sessionFactory").ofType(SessionFactory.class).in(employeeService).set(sessionFactory);

		Mockito.when(session.get(Employee.class, 1)).thenReturn(emp);
		Mockito.when(sessionFactory.getCurrentSession()).thenReturn(session);

		try {
			employeeService.changeUserStatus(5, 'A', UserType.EMPLOYEE);
		} catch (BankingException e) {
		}
		assertNotSame('A', emp.getStatus());
	}
}
