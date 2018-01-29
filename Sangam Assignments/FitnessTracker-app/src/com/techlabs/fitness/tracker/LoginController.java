package com.techlabs.fitness.tracker;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.techlabs.fitness.validation.service.LoginService;

@WebServlet("/Login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginController() {
		super();
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		session.setAttribute("AuthenticationError","");
		request.getRequestDispatcher("WEB-INF/view/login.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
			HttpSession session=request.getSession();
			LoginService service=new LoginService();
		try {
			if (service.isAuthoriseUser(request.getParameter("userName"),request.getParameter("password"))) {
				String user=request.getParameter("userName");
				session.setAttribute("CurrentUser",user);
				session.setAttribute("loggedIn",user);
				if(session.getAttribute("currentPage").equals(true))
					response.sendRedirect("http://localhost:8080/FitnessTracker-app/SetGoal");
				else
					response.sendRedirect("http://localhost:8080/FitnessTracker-app/Track");
			}
			else
			{
				session.setAttribute("CurrentUser","");
				session.setAttribute("AuthenticationError","Enter valid user id and password");
				request.getRequestDispatcher("WEB-INF/view/login.jsp").forward(request, response);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
