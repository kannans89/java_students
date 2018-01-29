package com.techlabs.controllers;

import java.io.IOException;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techlabs.controllers.components.Customer;
import com.techlabs.controllers.components.PassbookEntry;
import com.techlabs.controllers.components.Transaction;
import com.techlabs.controllers.components.TransactionDateComparator;
import com.techlabs.controllers.components.TransactionType;
import com.techlabs.controllers.services.DataAccessService;

@WebServlet("/passbook")
public class PassbookController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private List<PassbookEntry> entries;

	public PassbookController() {
		super();
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		try {

			Customer customer = (Customer) request.getSession().getAttribute(
					"user");

			entries = new ArrayList<PassbookEntry>();

			List<Transaction> transactions = new DataAccessService()
					.getAllTransactions(customer);
			transactions.sort(new TransactionDateComparator());

			int i = 1;
			double balance = 0;
			for (Transaction transaction : transactions) {

				double withdraw = 0;
				double deposit = 0;

				if (transaction.getType() == TransactionType.Withdraw) {
					withdraw = transaction.getAmount();
					balance = balance - withdraw;
				}
				if (transaction.getType() == TransactionType.Deposit) {
					deposit = transaction.getAmount();
					balance = balance + deposit;
				}

				PassbookEntry entry = new PassbookEntry(String.valueOf(i),
						transaction.getTransactionID(), transaction.getDate(),
						withdraw, deposit, balance);

				entries.add(entry);

				i++;
			}

			RequestDispatcher requestDispatcher = request
					.getRequestDispatcher("passbook.jsp");
			request.setAttribute("entries", entries);
			requestDispatcher.forward(request, response);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String okayButton = request.getParameter("submit");
		String downloadButton = request.getParameter("passbook");

		if (okayButton != null) {
			String url = (String) request.getSession().getAttribute("url");
			response.sendRedirect(url);

		} else if (downloadButton != null) {

			try {
				Customer customer = (Customer) request.getSession()
						.getAttribute("user");
				String name = customer.getName();
				DateFormat dateFormat = new SimpleDateFormat(
						"EEE, d MMM yyyy HH:mm:ss");
				String currentDate = dateFormat.format(new Date());

				response.reset();
				response.setContentType("text/csv");
				String passbookName = name + "_Passbook_" + currentDate
						+ ".csv";
				passbookName = passbookName.replace(',', '_');
				response.setHeader("Content-disposition", "attachment; "
						+ "filename=" + passbookName);

				ArrayList<String> rows = new ArrayList<String>();
				rows.add("Sr. Number, Transaction ID, Date, Deposit, Withdraw, Balance");
				rows.add("\n");

				for (PassbookEntry entry : entries) {
					rows.add(String.valueOf(entry.getSrNo()) + ","
							+ entry.getTransactionID() + ","
							+ String.valueOf(entry.getDate()) + ","
							+ String.valueOf(entry.getDeposit()) + ","
							+ String.valueOf(entry.getWithdraw()) + ","
							+ String.valueOf(entry.getBalance()));
					rows.add("\n");
				}

				Iterator<String> iterator = rows.iterator();
				while (iterator.hasNext()) {
					String outputString = (String) iterator.next();
					response.getOutputStream().print(outputString);
				}
				response.getOutputStream().flush();

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
