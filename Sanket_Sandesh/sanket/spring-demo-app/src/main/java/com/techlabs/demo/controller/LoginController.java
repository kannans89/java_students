package com.techlabs.demo.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.techlabs.demo.service.LoginService;

@Controller
public class LoginController {

	@Autowired
	private LoginService loginservice;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public void login(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		loginservice.authenticateService();
		loginservice.insert();

		System.out.println("Im inside service controller");
	}

}