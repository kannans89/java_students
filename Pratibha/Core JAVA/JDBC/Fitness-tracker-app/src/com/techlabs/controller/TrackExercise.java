package com.techlabs.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.techlabs.service.ValidationService;

/**
 * Servlet implementation class TrackExercise
 */

@WebServlet(name = "TrackExercise", urlPatterns = { "/TrackExercise" })
public class TrackExercise extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public int temp = 0;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public TrackExercise() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		System.out.println("inside TrackControll get");
		HttpSession session = request.getSession();
		session.setAttribute("setgoal", "false");
		System.out.println("user"+session.getAttribute("user"));
		System.out.println(session.getAttribute("time"));
		ValidationService validate = new ValidationService();

		if (session.getAttribute("time") == null) {
			session.setAttribute("time", 0);
			System.out.println(session.getAttribute("time"));

		} 
			boolean isValid = validate.validateGoal((int) (session
					.getAttribute("time")));
			if (isValid) {
				session.setAttribute("excercise", "");
				request.getRequestDispatcher("WEB-INF/veiw/TrackExercise.jsp")
						.forward(request, response);

			} else {
				System.out
						.println("Excersice Goal Time Cannot Be Greater Than "
								+ validate.getLimit());
				session.setAttribute("error",
						"Excersice Goal Time Cannot Be Greater Than "
								+ validate.getLimit());
				response.sendRedirect("http://localhost:8080/Fitness-tracker-app/SetGoal");
			}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		System.out.println("time=" + session.getAttribute("time"));
		int addtime = Integer.parseInt(request.getParameter("addtime"));
		String excercise = request.getParameter("excercise");
		temp = temp + addtime;
		System.out.println("add:" + addtime);
		if (temp == (int) (session.getAttribute("time"))
				|| temp > (int) (session.getAttribute("time"))) {
			session.setAttribute("msg", "Goal is reach. Extercise time:" + temp);
			System.out.println("Goal is reach. Extercise time:" + temp);
			request.getRequestDispatcher("WEB-INF/veiw/TrackExercise.jsp")
					.forward(request, response);
		} else if (temp != (int) session.getAttribute("time")) {
			session.setAttribute("excercise", session.getAttribute("excercise")
					+ "<pre>Extercise type: " + excercise + ".      Time: "
					+ addtime + "minutes<br></pre>");
			session.setAttribute("msg", "Extercise time:" + temp);
			System.out.println("Extercise time:" + temp);
			request.getRequestDispatcher("WEB-INF/veiw/TrackExercise.jsp")
					.forward(request, response);
		} else
			request.getRequestDispatcher("WEB-INF/veiw/TrackExercise.jsp")
					.forward(request, response);

	}

}
