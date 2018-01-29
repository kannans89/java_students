package com.techlabs.employee.servlet;

import java.io.IOException;
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
 * Servlet implementation class ManageEmployeeAdd
 */
@WebServlet("/ManageEmployeeAdd")
public class ManageEmployeeAdd extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ManageEmployeeAdd() {
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
		User userLogged = (User) request.getSession()
				.getAttribute("userLogged");
		if (!userLogged.getRole().equals("admin"))
			response.sendRedirect("ManageEmployeeView");
		else {

			List<Department> deptList = new DepartmentService().getDeptList();
			request.setAttribute("deptList", deptList);
			RequestDispatcher dispatcher = request
					.getRequestDispatcher("addEmployee.jsp");
			dispatcher.forward(request, response);
		}
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
		if (userLogged != null) {
			if (!userLogged.getRole().equals("admin"))
				response.sendRedirect("ManageEmployeeView");
			else {

				EmployeeService service = new EmployeeService();
				boolean result = service.addEmployee(new Employee(Integer
						.parseInt(request.getParameter("empid")), request
						.getParameter("empname")

				, Integer.parseInt(request.getParameter("empDeptNo"))));
				if (result)
					response.sendRedirect("ManageEmployeeView");
			}
		} else
			response.sendRedirect("/portal-app/");
	}

}
