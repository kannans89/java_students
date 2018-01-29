package com.techlabs.controller;
import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebFilter({"/SetGoal","/TrackExercise"})
public class LoginFilter implements Filter{

private static String url = "";
public void init(FilterConfig arg0) throws ServletException {}  
      
public void doFilter(ServletRequest req, ServletResponse resp,  
    FilterChain chain) throws IOException, ServletException { 
	if (req instanceof HttpServletRequest) {
		 url = ((HttpServletRequest)req).getRequestURL().toString();
		 String queryString = ((HttpServletRequest)req).getQueryString();
		 System.out.println("filter url"+url);
		}
	HttpSession session = ((HttpServletRequest) req).getSession();
	session.setAttribute("url",url);
	
	System.out.println("user"+session.getAttribute("user"));
    if(session.getAttribute("user")==null){
    	System.out.println("inside if");
    	HttpServletResponse httpResponse = (HttpServletResponse) resp;
    	RequestDispatcher rd=req.getRequestDispatcher("/LoginController");
    	rd.forward(req, resp);
    	//httpResponse.sendRedirect("http://localhost:8080/Fitness-tracker-app/LoginController");
    }
    else
    chain.doFilter(req, resp); 
} 
    public void destroy() {}  

}
