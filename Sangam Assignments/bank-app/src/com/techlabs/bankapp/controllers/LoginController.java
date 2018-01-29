package com.techlabs.bankapp.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.techlabs.bankapp.services.ImageService;
import com.techlabs.bankapp.services.LoginService;

@WebServlet("/Login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public LoginController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		session.setAttribute("AuthenticationError","");
		request.getRequestDispatcher("WEB-INF/view/login.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName=request.getParameter("userName");
		String password=request.getParameter("password");
		HttpSession session = request.getSession();
		if(new LoginService().isAuthoriseUser(userName, password))
		{
			String image=new ImageService().getUserImage(userName);
			session.setAttribute("image", image);
			session.setAttribute("user",userName);
			request.getRequestDispatcher("/WEB-INF/view/home.jsp").forward(request, response);
		}
		else
		{
			session.setAttribute("AuthenticationError","Invalid User name and Password");
			request.getRequestDispatcher("WEB-INF/view/login.jsp").forward(request, response);
		}
	}

}
