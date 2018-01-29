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
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String gender = request.getParameter("gender");
		String address = request.getParameter("address");
		String contact = request.getParameter("contact");
		int id = Integer.parseInt(request.getParameter("rollno"));
		System.out.println("inside EditContrill post" + id);

		if (name.isEmpty() || email.isEmpty() || address.isEmpty()
				|| contact.isEmpty()||gender.isEmpty()||request.getParameter("rollno").isEmpty()) {
			RequestDispatcher rd = request
					.getRequestDispatcher("View/GetStudent.jsp");
			out.println("<font color=red>Please fill all the fields</font>");
			rd.include(request, response);
		} else {
			StudentService studService = new StudentService();
			Student student = new Student();
			student.setName(name);
			student.setEmail(email);
			student.setGender(gender);
			student.setAddress(address);
			student.setContact(contact);
			student.setId(id);
			studService.editStudent(student);
			List<Student> list = new ArrayList<Student>();
			list = studService.getList();
			request.setAttribute("list", list);

			RequestDispatcher rd = request
					.getRequestDispatcher("View/GetDetails.jsp");
			rd.forward(request, response);

		}

	}
}
