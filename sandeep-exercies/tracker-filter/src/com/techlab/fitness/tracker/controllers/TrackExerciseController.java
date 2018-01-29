package com.techlab.fitness.tracker.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class TrackExerciseController
 */
@WebServlet("/trackExercise")
public class TrackExerciseController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public int goalTime = 0;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public TrackExerciseController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		HttpSession session = request.getSession();
		session.setAttribute("page", false);

		session.setAttribute("message", "");
		RequestDispatcher reqDispatcher = request.getRequestDispatcher("/WEB-INF/view/TrackExercise.jsp");
		reqDispatcher.forward(request, response);
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		HttpSession session = request.getSession();

		int newTime = Integer.parseInt(request.getParameter("newTime"));
		goalTime = goalTime + newTime;

		TimeChecker check = new TimeChecker();

		if (check.checkTime(goalTime)) {
			if (goalTime < (int) session.getAttribute("time")) {
				session.setAttribute("message", "Exercise is done for " + goalTime + " minutes.");
			} else {
				session.setAttribute("message", "Goal is achieved...Exercise is done for " + goalTime + " minutes.");
			}
			RequestDispatcher reqDispatcher = request.getRequestDispatcher("/WEB-INF/view/TrackExercise.jsp");
			reqDispatcher.forward(request, response);
		} else {
			session.setAttribute("message", "Cannot exercise for more than 120 minutes");
			RequestDispatcher reqDispatcher = request.getRequestDispatcher("/WEB-INF/view/TrackExercise.jsp");
			reqDispatcher.forward(request, response);
		}

	}

}
