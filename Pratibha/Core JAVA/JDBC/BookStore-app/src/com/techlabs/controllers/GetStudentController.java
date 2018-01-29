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
 * Servlet implementation class GetStudentController
 */
@WebServlet(name = "GetBookController", urlPatterns = { "/GetBookController" })
public class GetStudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
     private int isbn;
     int i;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetStudentController() {
        super();
        // TODO Auto-generated constructor stub
    }
	List<Book> list=new ArrayList<Book>();

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
		List<Book> list=new ArrayList<Book>();
		BookService studService =new BookService();
		list=studService.getList();
		request.setAttribute("list",list);
		RequestDispatcher rd = request.getRequestDispatcher("View/GetDetails.jsp");
		rd.forward(request, response);
	}}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getParameter("delete")!=null){
			int id=(int)Integer.parseInt(request.getParameter("delete"));
			System.out.println(id);
			BookService studService = new BookService();
			studService.deleteStudent(id);
			List<Book> list=new ArrayList<Book>();
			list=studService.getList();
			request.setAttribute("list",list);
		
			RequestDispatcher rd = request.getRequestDispatcher("View/GetDetails.jsp");
			rd.forward(request, response);
		}
		else{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter(); 
		BookService studService=new BookService();
	     Book book1;
	     System.out.println("Inside getContrroller- ");
	     if(request.getParameter("edit")!=null)
	     System.out.println(request.getParameter("edit"));
	     int id=Integer.parseInt(request.getParameter("edit"));
	     book1=studService.getStudent(id);
	     System.out.println(book1.getISBN());
	     if(book1!=null){
	     System.out.println("Inside getContrroller- name:"+book1.getTitle());
	     request.setAttribute("isbn", book1.getISBN());
	     request.setAttribute("title", book1.getTitle());
	     request.setAttribute("image", book1.getImage());
	     request.setAttribute("author", book1.getAuthor());
	     request.setAttribute("description", book1.getDescription());
	     request.setAttribute("price", book1.getPrice());
	     }

	    RequestDispatcher rd = request.getRequestDispatcher("View/GetStudent.jsp");
	    rd.forward(request, response);	    
	}
	}
}