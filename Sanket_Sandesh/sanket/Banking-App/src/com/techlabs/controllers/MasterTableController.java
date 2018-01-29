package com.techlabs.controllers;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techlabs.controllers.components.Customer;
import com.techlabs.controllers.components.LowBalanceException;
import com.techlabs.controllers.services.DataAccessService;

@WebServlet("/masterTable")
public class MasterTableController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public MasterTableController() {
		super();
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		try {
			List<Customer> customers = new DataAccessService()
					.getAllCustomers();

			RequestDispatcher requestDispatcher = request
					.getRequestDispatcher("masterTable.jsp");
			request.setAttribute("customers", customers);
			requestDispatcher.forward(request, response);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (LowBalanceException e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String url = (String) request.getSession().getAttribute("url");
		response.sendRedirect(url);
	}

}
