package com.techlabs.controllers;
import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebFilter({"/AddController","/GetStudentController"})
public class LoginFilter implements Filter{

public void init(FilterConfig arg0) throws ServletException {}  
      
public void doFilter(ServletRequest req, ServletResponse resp,  
    FilterChain chain) throws IOException, ServletException { 
	HttpSession session = ((HttpServletRequest) req).getSession();
	System.out.println("user"+session.getAttribute("user"));
    if(session.getAttribute("user")==null){
    	System.out.println("inside if");
    	HttpServletResponse httpResponse = (HttpServletResponse) resp;
    	httpResponse.sendRedirect("http://localhost:8080/Book-Store-App/LoginController");
    }
    else
    chain.doFilter(req, resp); 
} 
    public void destroy() {}  

}
