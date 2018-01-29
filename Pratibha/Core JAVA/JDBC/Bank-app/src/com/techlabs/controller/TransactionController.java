package com.techlabs.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.techlabs.service.BankService;

@WebServlet("/TransactionController")
//@WebServlet(name = "TransactionController", urlPatterns = { "/TransactionController" })
public class TransactionController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public TransactionController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("Veiw/Transaction.jsp").forward(request,
				response);

	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
String transtype=request.getParameter("transType");
Double amount=(double)Double.parseDouble(request.getParameter("amount"));
System.out.println(transtype+amount);
HttpSession session = request.getSession();
BankService bs=new BankService();
System.out.println( bs.doTransaction(amount,transtype,(String)session.getAttribute("name"),(String)session.getAttribute("accno")));
session.setAttribute("balance", bs.doTransaction(amount,transtype,(String)session.getAttribute("name"),(String)session.getAttribute("accno")));
response.sendRedirect("http://localhost:8080/Bank-app/PassBookController");

	}

}
