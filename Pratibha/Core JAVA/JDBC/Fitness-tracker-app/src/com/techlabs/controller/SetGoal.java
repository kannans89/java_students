package com.techlabs.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.techlabs.service.ValidationService;

/**
 * Servlet implementation class SetGoal
 */

@WebServlet(name = "SetGoal", urlPatterns = { "/SetGoal" })
public class SetGoal extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public SetGoal() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		session.setAttribute("setgoal","true");
		System.out.println("inside setGoalControll get");
request.getRequestDispatcher("WEB-INF/veiw/SetGoal.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 HttpSession session = request.getSession();
		 session.setAttribute("msg"," Extercise time:");
		 System.out.println("line 41:"+request.getParameter("time"));
		    int time=(int) Integer.parseInt(request.getParameter("time"));
		    session.setAttribute("time", time);
		    System.out.println(time);
			System.out.println(time);
			ValidationService validate=new ValidationService();
			boolean isValid=validate.validateGoal(time);
			if(isValid)
			response.sendRedirect("http://localhost:8080/Fitness-tracker-app/TrackExercise");
			else{
				System.out.println("Excersice Goal Time Cannot Be Greater Than "+validate.getLimit());
				session.setAttribute("error", "Excersice Goal Time Cannot Be Greater Than "+validate.getLimit());
				response.sendRedirect("http://localhost:8080/Fitness-tracker-app/SetGoal");
	
	}}

}
