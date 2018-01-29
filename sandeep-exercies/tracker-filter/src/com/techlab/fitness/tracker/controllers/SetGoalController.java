package com.techlab.fitness.tracker.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/setGoal")
public class SetGoalController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public SetGoalController() {
		super();
		// TODO Auto-generated constructor stub
	}


	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		session.setAttribute("page", true);
//		if (session.getAttribute("validUser")== null) {
//			response.sendRedirect("LoginController");
//		} else {
			session.setAttribute("errorMsg", "");
			RequestDispatcher reqDispatcher = request.getRequestDispatcher("/WEB-INF/view/SetGoal.jsp");
			reqDispatcher.forward(request, response);
			return;
//		}
	}


	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		HttpSession session = request.getSession();
		int time = Integer.parseInt(request.getParameter("time"));
		TimeChecker check = new TimeChecker();
		if (check.checkTime(time)) {
			session.setAttribute("time", time);
			response.sendRedirect("trackExercise");
		} else {
			session.setAttribute("errorMsg",
					"Cannot set time for more than 120 minutes");
			RequestDispatcher reqDispatcher = request
					.getRequestDispatcher("/WEB-INF/view/SetGoal.jsp");
			reqDispatcher.forward(request, response);
		}
	}

}
