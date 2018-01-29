package com.techlabs.beer.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.techlabs.beer.model.BeerExpert;
@WebServlet("/beer")
public class BeerSelect extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public BeerSelect() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String c=request.getParameter("color");
		BeerExpert beer=new BeerExpert();
		List<String> result=beer.getBrands(c);
		request.setAttribute("styles",result);
		request.getRequestDispatcher("/WEB-INF/view/result.jsp").forward(request, response);
	}
}