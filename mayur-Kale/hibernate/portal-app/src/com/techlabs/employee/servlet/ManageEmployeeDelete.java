package com.techlabs.employee.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techlabs.entity.User;
import com.techlabs.services.EmployeeService;

/**
 * Servlet implementation class ManageEmployeeDelete
 */
@WebServlet("/ManageEmployeeDelete")
public class ManageEmployeeDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ManageEmployeeDelete() {
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
				response.sendRedirect("ManageEmployeeView");
			else {

				String resultEmpId = request.getParameter("empId").toString();
				if (resultEmpId != null) {
					if (new EmployeeService().deleteEmployeeById(Integer
							.parseInt(resultEmpId))) {
						response.sendRedirect("ManageEmployeeView");
					} else
						response.sendRedirect("ManageEmployeeView");
				}
			}
	}
}
