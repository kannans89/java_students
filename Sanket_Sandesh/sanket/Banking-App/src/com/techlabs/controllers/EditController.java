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
import com.techlabs.controllers.services.DataAccessService;
import com.techlabs.controllers.services.INotifier;

@WebServlet("/editProfile")
public class EditController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public EditController() {
		super();
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		Customer customer = (Customer) request.getSession()
				.getAttribute("user");

		RequestDispatcher requestDispatcher = request
				.getRequestDispatcher("/editProfile.jsp");
		request.setAttribute("user", customer);
		requestDispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String url = (String) request.getSession().getAttribute("url");

		String updateButton = request.getParameter("submit");
		String cancelButton = request.getParameter("cancel");

		if (cancelButton != null) {
			response.sendRedirect(url);

		} else if (updateButton != null) {
			String name = request.getParameter("name");
			String emailID = request.getParameter("email");
			String username = request.getParameter("userName");
			String password = request.getParameter("password");

			Customer customer = (Customer) request.getSession().getAttribute(
					"user");

			try {
				customer.setName(name);
				customer.setUsername(username);
				customer.setEmailID(emailID);
				customer.setPassword(password);

				new DataAccessService().updateCustomer(customer);

				request.getSession().setAttribute("user", customer);

				INotifier emailer = (INotifier) request.getSession()
						.getAttribute("notifier");
				emailer.sendNotification(
						"Account Information Updated",
						"Hello, "
								+ customer.getName()
								+ "\nYour account information has been successfully updated",
						customer.getEmailID());

				response.sendRedirect(url);

			} catch (ClassNotFoundException e) {
				System.out.println("JDBC Driver failed");
				RequestDispatcher requestDispatcher = request
						.getRequestDispatcher("editProfile.jsp");
				request.setAttribute("error", "Internal Error !");
				requestDispatcher.forward(request, response);

			} catch (SQLException e) {
				System.out.println("SQL query failed");
				RequestDispatcher requestDispatcher = request
						.getRequestDispatcher("editProfile.jsp");
				request.setAttribute("error", "Internal Error !");
				requestDispatcher.forward(request, response);
			
			} catch (Exception e) {
				RequestDispatcher requestDispatcher = request
						.getRequestDispatcher("editProfile.jsp");
				request.setAttribute("error", "Username is already used");
				requestDispatcher.forward(request, response);
			}

		}

	}

}
