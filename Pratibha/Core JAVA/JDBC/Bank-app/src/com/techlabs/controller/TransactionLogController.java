package com.techlabs.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.techlabs.model.Transaction;
import com.techlabs.service.BankService;

/**
 * Servlet implementation class TransactionLogController
 */
//@WebServlet("/TransactionLogController")
@WebServlet(name = "TransactionLogController", urlPatterns = { "/TransactionLogController" })
public class TransactionLogController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TransactionLogController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BankService bs=new BankService();
		HttpSession session = request.getSession();
List<Transaction> translist;
System.out.println("accno: "+session.getAttribute("accno"));
		translist=bs.getTransactions((String)session.getAttribute("accno"));
		request.setAttribute("translist", translist);
		session.setAttribute("translist", translist);
		request.getRequestDispatcher("Veiw/TransactionLog.jsp").forward(request,response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
