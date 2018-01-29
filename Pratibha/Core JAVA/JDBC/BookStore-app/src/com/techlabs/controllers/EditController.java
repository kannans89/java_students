package com.techlabs.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techlabs.models.Book;
import com.techlabs.services.BookService;

/**
 * Servlet implementation class EditController
 */
@WebServlet(name = "EditController", urlPatterns = { "/EditController" })
public class EditController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EditController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String title = request.getParameter("title");
		String image = request.getParameter("image");
		String author = request.getParameter("author");
		String description = request.getParameter("description");
		String price1 = request.getParameter("price");
		int id = Integer.parseInt(request.getParameter("isbn"));
		System.out.println("inside EditContrill post" + id);

		if (title.isEmpty() || image.isEmpty() || author.isEmpty()
				|| description.isEmpty()||price1.isEmpty()) {
			RequestDispatcher rd = request
					.getRequestDispatcher("View/GetStudent.jsp");
			out.println("<font color=red>Please fill all the fields</font>");
			rd.include(request, response);
		} else {
			double price=Double.parseDouble(request.getParameter("price"));
			BookService bookService = new BookService();
			Book book = new Book();
			book.setTitle(title);
			book.setImage(image);
			book.setPrice(price);
			book.setAuthor(author);
			book.setDescription(description);
			book.setISBN(id);
			bookService.editStudent(book);
			List<Book> list = new ArrayList<Book>();
			list = bookService.getList();
			request.setAttribute("list", list);

			RequestDispatcher rd = request
					.getRequestDispatcher("View/GetDetails.jsp");
			rd.forward(request, response);

		}

	}
}
