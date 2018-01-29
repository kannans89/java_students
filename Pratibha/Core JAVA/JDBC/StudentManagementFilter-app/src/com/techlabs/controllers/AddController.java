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

import com.techlabs.models.Student;
import com.techlabs.services.StudentService;

/**
 * Servlet implementation class AddServlet
 */
@WebServlet(name = "AddController", urlPatterns = { "/AddController" })
public class AddController extends HttpServlet {
	private static final long serialVersionUID = 1L;
     static int id=6;
     StudentService studService=new StudentService();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("View/Add.jsp");
		rd.forward(request, response);
        
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String gender = request.getParameter("gender");
		String address = request.getParameter("address");
		String contact = request.getParameter("contact");
		
		if(name.isEmpty()||email.isEmpty()||address.isEmpty()||contact.isEmpty())
		{
			RequestDispatcher rd = request.getRequestDispatcher("View/Add.jsp");
			out.println("<font color=red>Please fill all the fields</font>");
			rd.forward(request, response);
		}
		else{
			Student stud=new Student();
			stud.setName(name);
			stud.setEmail(email);
			stud.setGender(gender);
			stud.setAddress(address);
			stud.setContact(contact);
			studService.addStudent(stud);
			
			List<Student> list=new ArrayList<Student>();
			list=studService.getList();
			request.setAttribute("list",list);
			RequestDispatcher rd = request.getRequestDispatcher("View/GetDetails.jsp");
			rd.forward(request, response);
		}
	}
	}

