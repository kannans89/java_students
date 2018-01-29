package com.techlabs;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@SuppressWarnings("serial")
public class LoginController extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("inside get");
        System.out.println("hi"); 
        request.getRequestDispatcher("index.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user=request.getParameter("username");
		String password=request.getParameter("password");
		if(user.isEmpty() || password.isEmpty()){
			   request.setAttribute("message", "Fill Username and password");
			response.sendRedirect("http://localhost:8080/login/");
		return;
		

		}
		LoginService logservice=new LoginService();
		boolean isValidUser=logservice.getAuthentication(user, password);
		//boolean isValidUser=LoginDao.validate(user, password);
		if(isValidUser)
		{	request.setAttribute("user",user);
	        request.getRequestDispatcher("Success.jsp").forward(request, response);
			
			return;
		}
		else	
		{   request.setAttribute("message", "Invalid Username or password");
			response.sendRedirect("http://localhost:8080/login/");
		return;
		}
	}

}
