package com.techlabs.controllers;

import java.io.IOException;
import java.sql.Date;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techlabs.controllers.components.Customer;
import com.techlabs.controllers.components.LowBalanceException;
import com.techlabs.controllers.components.Transaction;
import com.techlabs.controllers.components.TransactionType;
import com.techlabs.controllers.services.DataAccessService;
import com.techlabs.controllers.services.INotifier;
import com.techlabs.controllers.services.TransactionFailedException;

@WebServlet("/transaction")
public class TransactionController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public TransactionController() {
		super();
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		RequestDispatcher requestDispatcher = request
				.getRequestDispatcher("transaction.jsp");
		requestDispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String url = (String) request.getSession().getAttribute("url");

		String proceedButton = request.getParameter("submit");
		String cancelButton = request.getParameter("cancel");

		Customer customer = null;
		Transaction transaction = null;

		if (proceedButton != null) {
			double amount = Double.valueOf(request.getParameter("amount"));
			String typeString = request.getParameter("type");
			String dateChoice = request.getParameter("dateChoice");
			String dateString = request.getParameter("date");
			Date date;

			try {
				if (dateChoice.equals("Custom")) {

					dateString = dateString.replace('-', '/');
					String[] months1 = { "Jan", "Feb", "Mar", "Apr", "May",
							"Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
					String[] months2 = { "jan", "feb", "mar", "apr", "may",
							"jun", "jul", "aug", "sep", "oct", "nov", "dec" };
					for (int i = 1; i <= 12; i++) {

						dateString = dateString.replace(months1[i - 1],
								String.valueOf(i));
						dateString = dateString.replace(months2[i - 1],
								String.valueOf(i));
					}

					DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
					java.util.Date utilDate = dateFormat.parse(dateString);
					date = new Date(utilDate.getTime());

				} else {
					java.util.Date utilDate = new java.util.Date();
					date = new Date(utilDate.getTime());
				}

				TransactionType type = TransactionType.valueOf(typeString);

				customer = (Customer) request.getSession().getAttribute("user");

				transaction = new Transaction(customer.getCustomerID(), type,
						date, amount);

				DataAccessService dataAccessService = new DataAccessService();

				customer.performTransaction(transaction);
				dataAccessService.storeTransaction(transaction, customer);

				if (type == TransactionType.Deposit) {

					INotifier emailer = (INotifier) request.getSession()
							.getAttribute("notifier");
					emailer.sendNotification(
							"Deposit Successful",
							"Hello, "
									+ customer.getName()
									+ "\nYour account has been successfully deposited with Rs. "
									+ transaction.getAmount()
									+ ". Current Balance :- Rs. "
									+ customer.getBalance(),
							customer.getEmailID());
				}

				if (type == TransactionType.Withdraw) {

					INotifier emailer = (INotifier) request.getSession()
							.getAttribute("notifier");
					emailer.sendNotification(
							"Withdrawal Successful",
							"Hello, "
									+ customer.getName()
									+ "\nYour account has been successfully withdrwan with Rs. "
									+ transaction.getAmount()
									+ ". Current Balance :- Rs. "
									+ customer.getBalance(),
							customer.getEmailID());
				}

				response.sendRedirect(url);

			} catch (ParseException e) {
				RequestDispatcher requestDispatcher = request
						.getRequestDispatcher("transaction.jsp");
				request.setAttribute("error", "Date processing error");
				requestDispatcher.forward(request, response);

			} catch (LowBalanceException e) {
				RequestDispatcher requestDispatcher = request
						.getRequestDispatcher("transaction.jsp");
				request.setAttribute("error",
						"Minimum account balance required :- 1000 Rs.");
				requestDispatcher.forward(request, response);

			} catch (TransactionFailedException e) {
				try {
					customer.reverseTransaction(transaction);
					RequestDispatcher requestDispatcher = request
							.getRequestDispatcher("transaction.jsp");
					request.setAttribute("error",
							"Transaction failed. Internal Error !");
					requestDispatcher.forward(request, response);

				} catch (LowBalanceException e1) {
					System.out.println("Corrupt database entry");
					RequestDispatcher requestDispatcher = request
							.getRequestDispatcher("transaction.jsp");
					request.setAttribute("error",
							"Transaction failed. Internal Error !");
					requestDispatcher.forward(request, response);

				}
			} catch (ClassNotFoundException e) {
				System.out.println("JDBC Driver failed");
				RequestDispatcher requestDispatcher = request
						.getRequestDispatcher("transaction.jsp");
				request.setAttribute("error",
						"Transaction failed. Internal Error !");
				requestDispatcher.forward(request, response);

			} catch (SQLException e) {
				System.out.println("SQL query failed");
				RequestDispatcher requestDispatcher = request
						.getRequestDispatcher("transaction.jsp");
				request.setAttribute("error",
						"Transaction failed. Internal Error !");
				requestDispatcher.forward(request, response);
			}
		}

		if (cancelButton != null) {
			response.sendRedirect(url);
		}

	}
}
