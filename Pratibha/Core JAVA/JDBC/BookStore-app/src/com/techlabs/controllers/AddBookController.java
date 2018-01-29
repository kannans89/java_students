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
import javax.servlet.http.HttpSession;

import com.techlabs.models.Book;
import com.techlabs.services.BookService;

/**
 * Servlet implementation class AddServlet
 */
@WebServlet(name = "AddController", urlPatterns = { "/AddController" })
public class AddBookController extends HttpServlet {
	private static final long serialVersionUID = 1L;
     static int id=6;
     BookService bookService=new BookService();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddBookController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		System.out.println("user"+session.getAttribute("user"));
        if(session.getAttribute("user")==null){
        	System.out.println("inside if");
			response.sendRedirect("http://localhost:8080/Book-Store-App/LoginController");
        }
        else{
		RequestDispatcher rd = request.getRequestDispatcher("View/Add.jsp");
		rd.forward(request, response);
        }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String title = request.getParameter("title");
		String image = request.getParameter("image");
		String author = request.getParameter("author");
		String description = request.getParameter("description");
		String price1 = request.getParameter("price");
		
		if(title.isEmpty()||image.isEmpty()||author.isEmpty()||description.isEmpty()||price1.isEmpty())
		{
			RequestDispatcher rd = request.getRequestDispatcher("View/Add.jsp");
			out.println("<font color=red>Please fill all the fields</font>");
			rd.forward(request, response);
		}
		else{
			double price=Double.parseDouble(request.getParameter("price"));
			Book book=new Book();
			book.setTitle(title);
			book.setImage(image);
			book.setAuthor(author);
			book.setDescription(description);
			book.setPrice(price);
			bookService.addStudent(book);
			
			List<Book> list=new ArrayList<Book>();
			list=bookService.getList();
			request.setAttribute("list",list);
			RequestDispatcher rd = request.getRequestDispatcher("View/GetDetails.jsp");
			rd.forward(request, response);
		}
	}
	}

