package com.techlabs.department.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techlabs.entity.User;
import com.techlabs.services.DepartmentService;

/**
 * Servlet implementation class ManageDepartmentDelete
 */
@WebServlet("/ManageDepartmentDelete")
public class ManageDepartmentDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ManageDepartmentDelete() {
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
				String resultDeptId = request.getParameter("deptId").toString();
				if (resultDeptId != null) {
					if (new DepartmentService().deleteDepartmentById(Integer
							.parseInt(resultDeptId))) {
						response.sendRedirect("ManageDepartmentView");
					} else
						response.sendRedirect("ManageDepartmentView");
				}
			}
		} 

}
