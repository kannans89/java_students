package com.techlabs.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.techlabs.service.BankService;
import com.techlabs.service.PasswordGenerationService;

//@WebServlet("/RegisterController")
@WebServlet(name = "RegisterController", urlPatterns = { "/RegisterController" })
public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public RegisterController() {
		super();
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("Veiw/Register.jsp").forward(request,
				response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		System.out.println("test");
		if (((String) session.getAttribute("status")).equals("available")) {
			System.out.println("Test");
			BankService bs = new BankService();
			String email = request.getParameter("email");
			String name = request.getParameter("name");
			String profile = request.getParameter("profile");
			if(email.isEmpty()||name.isEmpty()||profile.isEmpty())
			{
				RequestDispatcher rd = request.getRequestDispatcher("Veiw/Register.jsp");
				out.println("<font color=red>Please fill all the fields</font>");
				rd.forward(request, response);
			}
			else{
			bs.register(name, email, profile);
			response.sendRedirect("http://localhost:8080/Bank-app/LoginController");
			}
		} else
			response.sendRedirect("http://localhost:8080/Bank-app/RegisterController");
	}

}
