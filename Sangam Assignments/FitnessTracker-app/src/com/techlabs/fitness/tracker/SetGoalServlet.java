package com.techlabs.fitness.tracker;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SetGoal")
public class SetGoalServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
        public SetGoalServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		session.setAttribute("currentPage",true);
		request.getRequestDispatcher("/WEB-INF/view/SetGoal.jsp").forward(request,response);
		}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		int goalMinitues=Integer.parseInt(request.getParameter("minitues"));
		session.setAttribute("Goal",goalMinitues);
		response.sendRedirect("http://localhost:8080/FitnessTracker-app/Track");
	}

}
