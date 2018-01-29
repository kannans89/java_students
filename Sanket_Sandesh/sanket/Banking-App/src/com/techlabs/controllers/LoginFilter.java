package com.techlabs.controllers;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.techlabs.controllers.services.LoginService;

@WebFilter("/*")
public class LoginFilter implements Filter {

	private static final Set<String> ALLOWED_PATHS = Collections
			.unmodifiableSet(new HashSet<String>(Arrays.asList("/login",
					"/register")));
	private String ALLOWED_REGEX = ".*[css|jpg|png|gif|js]";

	public LoginFilter() {
	}

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {

		HttpServletRequest req = (HttpServletRequest) request;

		String appName = req.getContextPath();
		String completePath = req.getHeader("referer");
		String currentURL = req.getRequestURL().toString();

		if (completePath == null)
			completePath = "/" + appName + "/";
		String url = currentURL.split(appName)[1];
		if (url == null)
			url = "";

		HttpSession session = req.getSession();

		boolean isLoggedIn = (boolean) LoginService.getLoginService()
				.isLoggedIn(session);
		boolean isAllowed = ALLOWED_PATHS.contains(url);

		if (url.matches(ALLOWED_REGEX))
			isAllowed = true;

		if (isLoggedIn || isAllowed) {
			chain.doFilter(request, response);
		}

		else {
			RequestDispatcher requestDispatcher = request
					.getRequestDispatcher("/login");
			requestDispatcher.forward(request, response);
		}

	}

	public void init(FilterConfig fConfig) throws ServletException {
	}

}
