package com.techlabs.fitness.tracker;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.techlabs.fitness.validation.service.ValidationService;

@WebServlet("/Track")
public class TrackExerciseServlet extends HttpServlet {
	private int trackMin=0;
	private static final long serialVersionUID = 1L;
    public TrackExerciseServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		session.setAttribute("currentPage",false);
		session.setAttribute("trackMin",0);
			request.getRequestDispatcher("/WEB-INF/view/TrackExercise.jsp").forward(request,response);
		}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		ValidationService service=new ValidationService();
		int goal=(int)session.getAttribute("Goal");
		session.setAttribute("error","");
		int min=Integer.parseInt(request.getParameter("trackMinitues"));
		if(service.validateGoal(min))
		{
			trackMin=trackMin+min;
			session.setAttribute("trackMin",trackMin);
			session.setAttribute("reachGoal","");
			if(trackMin>=goal)
			{
				session.setAttribute("reachGoal","Goal achieved..!!");
				trackMin=0;
				request.getRequestDispatcher("/WEB-INF/view/TrackExercise.jsp").forward(request,response);
			}
			else
			{
				session.setAttribute("reachGoal","");
				request.getRequestDispatcher("/WEB-INF/view/TrackExercise.jsp").forward(request,response);
			}
		
		}
		else
		{
			session.setAttribute("error", "Minutes should not be geater than "+service.getLimit()+" less than 0");
			request.getRequestDispatcher("/WEB-INF/view/TrackExercise.jsp").forward(request,response);
		}
	}
}
