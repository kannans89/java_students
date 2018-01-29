package com.techlabs.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.techlabs.service.LoginService;

@WebServlet(name = "LoginController", urlPatterns = { "/LoginController" })
public class LoginController extends HttpServlet {
	LoginService ls = new LoginService();

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		System.out.println("inside get");
		System.out.println("hi");
		request.getRequestDispatcher("WEB-INF/veiw/login.jsp").forward(request,
				response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String user = request.getParameter("username");
		String password = request.getParameter("password");

		if (user.isEmpty() || password.isEmpty()) {
			request.setAttribute("message", "Fill Username and password");
			request.getRequestDispatcher("WEB-INF/veiw/login.jsp").forward(
					request, response);

			return;
		}

		else if (ls.getAuthentication(user, password)) {
			HttpSession session = request.getSession();
			session.setAttribute("user", "root");
			System.out.println(session.getAttribute("user"));

			System.out.println("url=" + session.getAttribute("url"));
			// request.getRequestDispatcher((String)
			// session.getAttribute("url")).forward(request, response);
			response.sendRedirect((String) session.getAttribute("url"));
			// response.sendRedirect("http://localhost:8080/Fitness-tracker-app/index.html");

		}

		else {
			request.setAttribute("message", "Invalid Username or password");
			request.getRequestDispatcher("WEB-INF/veiw/login.jsp").forward(
					request, response);

			return;
		}
	}

}
