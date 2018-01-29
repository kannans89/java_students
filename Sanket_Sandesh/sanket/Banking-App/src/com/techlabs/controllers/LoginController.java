package com.techlabs.controllers;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.techlabs.controllers.components.LowBalanceException;
import com.techlabs.controllers.services.EmailNotifier;
import com.techlabs.controllers.services.INotifier;
import com.techlabs.controllers.services.LoginService;
import com.techlabs.controllers.services.NoUserFoundException;
import com.techlabs.controllers.services.WrongPasswordException;

@WebServlet("/login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private LoginService loginService;
	private INotifier emailer;
	private String url;

	public LoginController() {
		super();
		loginService = LoginService.getLoginService();
		emailer = new EmailNotifier("javatest258@gmail.com",
				"password@javatest");
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String appName = request.getContextPath();
		appName = appName + "/";
		String currentURL = request.getRequestURL().toString();
		url = currentURL.substring(0,
				currentURL.indexOf(appName) + appName.length());

		HttpSession session = request.getSession();

		loginService.logOut(session);

		session.setAttribute("notifier", emailer);
		session.setAttribute("url", url);

		RequestDispatcher requestDispatcher = request
				.getRequestDispatcher("login.jsp");
		request.setAttribute("error", "");
		requestDispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		HttpSession session = request.getSession();

		String username = request.getParameter("userName");
		String password = request.getParameter("password");

		try {
			loginService.login(username, password, session);

			response.sendRedirect(url);

		} catch (SQLException e) {
			System.out.println("SQL query failed");
			RequestDispatcher requestDispatcher = request
					.getRequestDispatcher("login.jsp");
			request.setAttribute("error", "Wrong Password");
			requestDispatcher.forward(request, response);

		} catch (LowBalanceException e) {
			System.out.println("Corrupt database entry");
			RequestDispatcher requestDispatcher = request
					.getRequestDispatcher("login.jsp");
			request.setAttribute("error", "Wrong Password");
			requestDispatcher.forward(request, response);

		} catch (ClassNotFoundException e) {
			System.out.println("JDBC Driver failed");
			RequestDispatcher requestDispatcher = request
					.getRequestDispatcher("login.jsp");
			request.setAttribute("error", "Wrong Password");
			requestDispatcher.forward(request, response);

		} catch (NoUserFoundException e) {
			RequestDispatcher requestDispatcher = request
					.getRequestDispatcher("login.jsp");
			request.setAttribute("error", "Username does not exist");
			requestDispatcher.forward(request, response);

		} catch (WrongPasswordException e) {
			RequestDispatcher requestDispatcher = request
					.getRequestDispatcher("login.jsp");
			request.setAttribute("error", "Wrong Password");
			requestDispatcher.forward(request, response);
		}

	}
}
