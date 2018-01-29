package com.techlabs.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techlabs.service.StudentService;
import com.techlabs.student.Student;

/**
 * Servlet implementation class AddStudentServlet
 */
@WebServlet("/AddStudent")
public class AddStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddStudentServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		StudentService service = new StudentService();

		service.connect();

		service.addStudent(new Student(Integer.parseInt(request
				.getParameter("rollNo")), request.getParameter("name"), Integer
				.parseInt(request.getParameter("age"))));

		service.close();

		request.setAttribute("name", request.getParameter("name"));

		RequestDispatcher dispatcher = request
				.getRequestDispatcher("welcome.jsp");

		dispatcher.forward(request, response);
	}

}
