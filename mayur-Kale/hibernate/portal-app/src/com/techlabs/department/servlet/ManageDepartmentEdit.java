package com.techlabs.department.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techlabs.entity.Department;
import com.techlabs.entity.User;
import com.techlabs.services.DepartmentService;

/**
 * Servlet implementation class ManageDepartmentEdit
 */
@WebServlet("/ManageDepartmentEdit")
public class ManageDepartmentEdit extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ManageDepartmentEdit() {
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
		// TODO Auto-generated method stub
		User userLogged = (User) request.getSession()
				.getAttribute("userLogged");
			if (!userLogged.getRole().equals("admin"))
				response.sendRedirect("ManageDepartmentView");
			else {
				Department department = new DepartmentService()
						.getDepartmentById(Integer.parseInt(request
								.getParameter("deptId").toString()));
				request.setAttribute("editDept", department);
				request.setAttribute("deptId", request.getParameter("deptId"));
				RequestDispatcher dispatcher = request
						.getRequestDispatcher("editDepartment.jsp");
				dispatcher.forward(request, response);
			}

	}

}
