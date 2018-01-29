package com.techlabs.employee.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techlabs.entity.Department;
import com.techlabs.entity.Employee;
import com.techlabs.entity.User;
import com.techlabs.services.DepartmentService;
import com.techlabs.services.EmployeeService;

/**
 * Servlet implementation class ManageEmployeeEdit
 */
@WebServlet("/ManageEmployeeEdit")
public class ManageEmployeeEdit extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ManageEmployeeEdit() {
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
				Employee employee = new EmployeeService()
						.getEmployeeById(Integer.parseInt(request.getParameter(
								"empId").toString()));
				List<Department> deptList = new ArrayList<Department>();
				deptList = new DepartmentService().getDeptList();
				request.setAttribute("editEmp", employee);
				request.setAttribute("deptList", deptList);
				request.setAttribute("empId", request.getParameter("empId"));
				RequestDispatcher dispatcher = request
						.getRequestDispatcher("editEmployee.jsp");
				dispatcher.forward(request, response);
			}
	}

}
