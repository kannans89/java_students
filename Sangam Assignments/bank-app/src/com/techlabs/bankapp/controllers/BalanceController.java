package com.techlabs.bankapp.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.techlabs.bankapp.services.BalanceService;

/**
 * Servlet implementation class BalanceController
 */
@WebServlet("/Balance")
public class BalanceController extends HttpServlet {
	private static final long serialVersionUID = 1L;
        public BalanceController() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String userName=(String)session.getAttribute("user");
		double balance=new BalanceService().getBalance(userName);
		session.setAttribute("balance", balance);
		request.getRequestDispatcher("/WEB-INF/view/balance.jsp").forward(request, response);	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
