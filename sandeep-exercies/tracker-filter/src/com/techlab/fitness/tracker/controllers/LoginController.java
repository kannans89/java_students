package com.techlab.fitness.tracker.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginController() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		session.setAttribute("loginError", "");
		RequestDispatcher reqDispatcher = request
				.getRequestDispatcher("/WEB-INF/view/Login.jsp");
		reqDispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		HttpSession session = request.getSession();
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		LoginService check = new LoginService();
		if (check.checkUser(username, password)) {
			session.setAttribute("validUser", username);
			if (session.getAttribute("page").equals(true)) {
				response.sendRedirect("setGoal");
			} else {
				response.sendRedirect("trackExercise");
			}
		} else {
			session.setAttribute("loginError",
					"Incorrect Username and Password");
			RequestDispatcher reqDispatcher = request
					.getRequestDispatcher("/WEB-INF/view/Login.jsp");
			reqDispatcher.forward(request, response);
		}

	}

}
