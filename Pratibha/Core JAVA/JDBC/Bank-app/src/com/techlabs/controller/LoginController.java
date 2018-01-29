package com.techlabs.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.techlabs.service.BankService;

/**
 * Servlet implementation class LoginController
 */
// @WebServlet("/LoginController")
@WebServlet(name = "LoginController", urlPatterns = { "/LoginController" })
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginController() {
		super();
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("Veiw/login.jsp").forward(request,
				response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		BankService bs = new BankService();
		boolean isValid = bs.getAuthentication(name, password);
		if (isValid) {
			HttpSession session = request.getSession();
			session.setAttribute("user", name);
			session.setAttribute("name", name);
			session.setAttribute("balance", bs.getAccount().getBalance());
			session.setAttribute("accno",bs.getAccount().getAccno() );
			session.setAttribute("profile", bs.getAccount().getProfile());
			response.sendRedirect("http://localhost:8080/Bank-app/PassBookController");
		} else
			response.sendRedirect("http://localhost:8080/Bank-app/LoginController");

	}

}
