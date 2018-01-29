package com.techlabs.bankapp.controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.techlabs.bankapp.services.DownloadPassbookService;
import com.techlabs.bankapp.services.PassbookDto;
import com.techlabs.bankapp.services.PassbookService;

/**
 * Servlet implementation class Passbook
 */
@WebServlet("/Passbook")
public class PassbookController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PassbookController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String name=(String)session.getAttribute("user");
		System.out.println(name);
		List<PassbookDto> passbook=new ArrayList<PassbookDto>();
		PassbookService service=new PassbookService();
		passbook = service.getTransactionDetails(name);
		session.setAttribute("passbook", passbook);
		request.getRequestDispatcher("/WEB-INF/view/passbook.jsp").forward(request, response);	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		@SuppressWarnings("unchecked")
		List<PassbookDto> passbook = (List<PassbookDto>)
		session.getAttribute("passbook");
		String name=(String)session.getAttribute("user");
		DownloadPassbookService ds=new DownloadPassbookService();
		ds.downloadPassbook(passbook,name);
		request.getRequestDispatcher("/WEB-INF/view/passbook.jsp").forward(request, response);
	}

}
