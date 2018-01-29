package com.techlabs.controller;

import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.techlabs.model.Transaction;
import com.techlabs.service.BankService;
import com.techlabs.service.CsvFileWriter;

/**
 * Servlet implementation class DownloadCSV
 */
@WebServlet("/DownloadController")
public class DownloadController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DownloadController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@SuppressWarnings("unchecked")
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	System.out.println("downloadController");	
	response.setContentType("application/octet-stream");
	response.setHeader("Content-Disposition",
	"attachment;filename=F:\\photo\\images (27).jpg");
	CsvFileWriter csv =new CsvFileWriter();
	HttpSession session = request.getSession();
List list=(List<Transaction>) session.getAttribute("translist");
	csv.writeCsvFile(list);
	response.sendRedirect("http://localhost:8080/Bank-app/PassBookController");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
