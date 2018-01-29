package com.techlabs.controllers.services;

import java.sql.SQLException;

import javax.servlet.http.HttpSession;

import com.techlabs.controllers.components.Customer;
import com.techlabs.controllers.components.LowBalanceException;

public class LoginService {
	private static LoginService loginService;

	private LoginService() {
	}

	public static LoginService getLoginService() {
		if (loginService == null)
			loginService = new LoginService();

		return loginService;
	}

	public void login(String userName, String password, HttpSession session)
			throws SQLException, LowBalanceException, ClassNotFoundException, NoUserFoundException, WrongPasswordException {

		DataAccessService dataAccessService = new DataAccessService();
		Customer customer = dataAccessService.getCustomerByUsername(userName);

		if (customer == null) {
			session.setAttribute("isLoggedIn", false);
			session.setAttribute("user", null);
			throw new NoUserFoundException();
		} else {
			if (password.equals(customer.getPassword())) {
				session.setAttribute("isLoggedIn", true);
				session.setAttribute("user", customer);
			} else {
				session.setAttribute("isLoggedIn", false);
				session.setAttribute("user", null);
				throw new WrongPasswordException();
			}
		}
	}

	public void logOut(HttpSession session) {
		session.setAttribute("isLoggedIn", false);
		session.setAttribute("user", null);
	}

	public boolean isLoggedIn(HttpSession session) {
		if (session.getAttribute("isLoggedIn") == null)
			session.setAttribute("isLoggedIn", false);

		return (boolean) (session.getAttribute("isLoggedIn"));
	}

}
