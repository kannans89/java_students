package com.techlabs.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techlabs.entity.User;
import com.techlabs.services.UserService;

/**
 * Servlet implementation class ChangePasswordController
 */
@WebServlet("/ChangePassword")
public class ChangePasswordController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ChangePasswordController() {
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
		RequestDispatcher dispatcher = request
				.getRequestDispatcher("changePassword.jsp");
		dispatcher.forward(request, response);

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
			String oldPass = request.getParameter("oldpass");
			String newPass = request.getParameter("newpass");
			if (userLogged.getPassword().equals(oldPass)) {

				userLogged.setPassword(newPass);
				UserService service = new UserService();
				service.changePassword(userLogged);
				request.getSession().setAttribute("userLogged", userLogged);
				request.getSession().removeAttribute("userLogged");
				response.sendRedirect("/portal-app/");
			} else {
				response.sendRedirect("ChangePassword");
			}

		} else {
			response.sendRedirect("/portal-app/");
		}
	}

}
