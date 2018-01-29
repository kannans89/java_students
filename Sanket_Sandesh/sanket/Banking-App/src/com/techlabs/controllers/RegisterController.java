package com.techlabs.controllers;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techlabs.controllers.components.Customer;
import com.techlabs.controllers.components.LowBalanceException;
import com.techlabs.controllers.services.DataAccessService;
import com.techlabs.controllers.services.INotifier;
import com.techlabs.controllers.services.TransactionFailedException;

@WebServlet("/register")
public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String url;

	public RegisterController() {
		super();
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		RequestDispatcher requestDispatcher = request
				.getRequestDispatcher("register.jsp");
		request.setAttribute("error", "");
		requestDispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String submitButton = request.getParameter("submit");
		String cancelButton = request.getParameter("cancel");

		if (submitButton != null) {
			String name = request.getParameter("name");
			String emailID = request.getParameter("email");
			double balance = Double.valueOf(request.getParameter("balance"));
			String username = request.getParameter("userName");
			String password = request.getParameter("password");

			try {
				Customer customer = new Customer(name, username, password,
						emailID, balance);

				DataAccessService dataAccessService = new DataAccessService();

				try {
					dataAccessService.registerCustomer(customer);
					
					INotifier emailer = (INotifier) request.getSession()
							.getAttribute("notifier");
					if(emailer == null)
						System.out.println("Locha");
					emailer.sendNotification("Account Created", "Hello, "
							+ customer.getName()
							+ "\nYour account has been created successfully",
							customer.getEmailID());

					url = (String) request.getSession().getAttribute("url");
					response.sendRedirect(url + "login");

				} catch (TransactionFailedException e) {
					dataAccessService.removeCustomer(customer);
					RequestDispatcher requestDispatcher = request
							.getRequestDispatcher("register.jsp");
					request.setAttribute("error", "Username is already used");
					requestDispatcher.forward(request, response);
				}

				
			} catch (LowBalanceException e) {
				RequestDispatcher requestDispatcher = request
						.getRequestDispatcher("register.jsp");
				request.setAttribute("error",
						"Minimum Initial Balance :- 1000 Rs");
				requestDispatcher.forward(request, response);

			} catch (ClassNotFoundException e) {
				System.out.println("JDBC Driver failed");
				RequestDispatcher requestDispatcher = request
						.getRequestDispatcher("register.jsp");
				request.setAttribute("error", "Internal Error !");
				requestDispatcher.forward(request, response);

			} catch (SQLException e) {
				System.out.println("SQL query failed");
				RequestDispatcher requestDispatcher = request
						.getRequestDispatcher("register.jsp");
				request.setAttribute("error", "Internal Error !");
				requestDispatcher.forward(request, response);
			}

		} else if (cancelButton != null) {
			response.sendRedirect(url + "login");
		}
	}

}
