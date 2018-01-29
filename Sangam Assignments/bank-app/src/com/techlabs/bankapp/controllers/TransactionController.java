package com.techlabs.bankapp.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.techlabs.bankapp.services.TransactionService;

/**
 * Servlet implementation class TransactionController
 */
@WebServlet("/Transaction")
public class TransactionController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TransactionController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @throws IOException 
	 * @throws ServletException 
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
		{
			HttpSession session = request.getSession();
			session.setAttribute("result", "");
			request.getRequestDispatcher("/WEB-INF/view/transaction.jsp").forward(request, response);
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {response.setContentType("text/html");
	HttpSession session = request.getSession();
	String name = (String) session.getAttribute("user");
	
	double amount = Double.parseDouble(request.getParameter("amount"));
	String type = request.getParameter("transaction");	
	new TransactionService().getTransactionDetails(amount, type, name);
	session.setAttribute("result", "Balance updated Sucessfully ");
	request.getRequestDispatcher("/WEB-INF/view/transaction.jsp").forward(request, response);}

}
