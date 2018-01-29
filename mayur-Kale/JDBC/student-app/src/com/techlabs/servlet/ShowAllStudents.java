package com.techlabs.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techlabs.service.StudentService;
import com.techlabs.student.Student;

/**
 * Servlet implementation class ShowAllStudents
 */
@WebServlet("/ShowAllStudents")
public class ShowAllStudents extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ShowAllStudents() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		StudentService service = new StudentService();
		service.connect();
		
		List<Student> studentList = service.getAllStudent();
		
		service.close();
		
		request.setAttribute("studentList", studentList);
		
		RequestDispatcher dispatcher = request
				.getRequestDispatcher("students.jsp");
		dispatcher.forward(request, response);

	}

}
