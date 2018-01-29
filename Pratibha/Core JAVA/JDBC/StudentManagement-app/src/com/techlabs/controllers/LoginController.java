package com.techlabs.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.techlabs.services.LoginService;

/**
 * Servlet implementation class LoginControll
 */
@WebServlet(name = "LoginController", urlPatterns = { "/LoginController" })
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("inside loginControll get");
		request.getRequestDispatcher("View/Login.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("inside logincontroll");
		String user=request.getParameter("user");
		String password=request.getParameter("password");
		LoginService logservice=new LoginService();
		LoginService logservice1=new LoginService();
		
		System.out.println(logservice.dao.hashCode());
		System.out.println(logservice1.dao.hashCode());

		boolean isValidUser=logservice.getAuthentication(user, password);
		if(isValidUser){
			System.out.println("you are valid user");
			HttpSession session = request.getSession();
	        session.setAttribute("user", user);		
	        session.setAttribute("id", "hi");		
	        System.out.println(session.getAttribute("id"));
	        response.sendRedirect("http://localhost:8080/StudentManagement-app/NevigationController");
			
			return;
		}
		else	{
			System.out.println("You are ivalid user");
			request.setAttribute("message", "Invalid Username or password");
			response.sendRedirect("http://localhost:8080/StudentManagement-app/LoginController");
		return;
		}
	}

}
