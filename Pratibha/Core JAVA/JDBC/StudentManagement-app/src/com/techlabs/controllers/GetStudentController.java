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

import com.techlabs.models.Student;
import com.techlabs.services.StudentService;

/**
 * Servlet implementation class GetStudentController
 */
@WebServlet(name = "GetStudentController", urlPatterns = { "/GetStudentController" })
public class GetStudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
     private int id;
     int i;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetStudentController() {
        super();
        // TODO Auto-generated constructor stub
    }
	List<Student> list=new ArrayList<Student>();

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		System.out.println("user"+session.getAttribute("user"));
        if(session.getAttribute("user")==null){
        	System.out.println("inside if");
			response.sendRedirect("http://localhost:8080/StudentManagement-app/LoginController");
        }
        else{
		List<Student> list=new ArrayList<Student>();
		StudentService studService =new StudentService();
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
			StudentService studService = new StudentService();
			studService.deleteStudent(id);
			List<Student> list=new ArrayList<Student>();
			list=studService.getList();
			request.setAttribute("list",list);
		
			RequestDispatcher rd = request.getRequestDispatcher("View/GetDetails.jsp");
			rd.forward(request, response);
		}
		else{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter(); 
		StudentService studService=new StudentService();
	     Student stud;
	     System.out.println("Inside getContrroller- ");
	     if(request.getParameter("edit")!=null)
	     System.out.println(request.getParameter("edit"));
	     int id=Integer.parseInt(request.getParameter("edit"));
	     stud=studService.getStudent(id);
	     System.out.println(stud.getId());
	     if(stud!=null){
	     System.out.println("Inside getContrroller- name:"+stud.getName());
	     request.setAttribute("rollno", stud.getId());
	     request.setAttribute("name", stud.getName());
	     request.setAttribute("address", stud.getAddress());
	     request.setAttribute("gender", stud.getGender());
	     request.setAttribute("contact", stud.getContact());
	     request.setAttribute("email", stud.getEmail());
	     }

	    RequestDispatcher rd = request.getRequestDispatcher("View/GetStudent.jsp");
	    rd.forward(request, response);	    
	}
	}
}
/*
<%    if(session.getAttribute("login")==null)
    response.sendRedirect("http://localhost:8080/StudentManagement-app/LoginController"); 
%>*/