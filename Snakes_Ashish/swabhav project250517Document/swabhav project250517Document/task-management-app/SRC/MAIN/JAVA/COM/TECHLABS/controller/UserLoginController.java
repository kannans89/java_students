package com.techlabs.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.techlabs.dto.UserLoginDto;
import com.techlabs.dto.TaskDto;
import com.techlabs.model.UserLogin;
import com.techlabs.service.UserLoginService;
import com.techlabs.utils.RequestReader;

@RestController
@RequestMapping("/UserLogin")
public class UserLoginController {

	@Autowired
	private UserLoginService service;
	@Autowired
	RequestReader requestReader;
	@Autowired
	SessionFactory sessionFactory;

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public void registerUser(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		String input = requestReader.getBody(request);
		Gson gson = new Gson();
		UserLoginDto userLoginDto = gson.fromJson(input, UserLoginDto.class);
		service.addUser(userLoginDto);

	}

	@RequestMapping(value = "/updateUser", method = RequestMethod.PUT)
	public void updatePassword(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		String input = requestReader.getBody(request);
		Gson gson = new Gson();
		UserLoginDto userLoginDto = gson.fromJson(input, UserLoginDto.class);
		service.updatePassword(userLoginDto);

	}

	@RequestMapping(value = "/validate", method = RequestMethod.POST)
	public @ResponseBody String isUserValid(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		String input = requestReader.getBody(request);
		Gson gson = new Gson();
		UserLoginDto userLoginDto = gson.fromJson(input, UserLoginDto.class);
		HttpSession session = request.getSession();
		Map<String, Object> responseMap = new HashMap<String, Object>();
		UserLogin user = service.authenticateUser(userLoginDto);
		if (user != null) {
			System.out.println(user.getUsername());
			session.setAttribute("User", user.getUsername());
			responseMap.put("success", true);
			responseMap.put("successMessage", "Login Successfull");
			return gson.toJson(responseMap);
		} else {
			responseMap.put("success", false);
			responseMap.put("errorMessage", "Login failed!!! user not Found");
			return gson.toJson(responseMap);
		}

	}

	@RequestMapping(value = "/getLoginDetail", method = RequestMethod.GET)
	public @ResponseBody String getLoginDetail(HttpServletRequest request,
			HttpServletResponse response,
			@RequestParam("username") String username) throws IOException {

		UserLoginDto userLoginDto = new UserLoginDto();
		userLoginDto.setUsername(username);
		UserLogin user = service.checkUsername(userLoginDto);
		Gson gson = new Gson();
		Map<String, Object> responseMap = new HashMap<String, Object>();
		if (user != null) {
			responseMap.put("success", true);
			responseMap.put("successMessage", "username present");
			return gson.toJson(responseMap);
		} else {
			responseMap.put("success", false);
			responseMap.put("errorMessage", "user not Found");
			return gson.toJson(responseMap);

		}
	}
	@RequestMapping(value = "/validatePassword", method = RequestMethod.GET)
	public @ResponseBody String validatePassword(HttpServletRequest request,
			HttpServletResponse response,
			@RequestParam("password") String password) throws IOException {
		HttpSession session = request.getSession();
		UserLoginDto userLoginDto = new UserLoginDto();
		userLoginDto.setUsername((String)session.getAttribute("User"));
		userLoginDto.setPassword(password);
		UserLogin user = service.authenticateUser(userLoginDto);
		Gson gson = new Gson();
		Map<String, Object> responseMap = new HashMap<String, Object>();
		if (user != null) {
			responseMap.put("success", true);
			responseMap.put("successMessage", "username present");
			return gson.toJson(responseMap);
		} else {
			responseMap.put("success", false);
			responseMap.put("errorMessage", "user not Found");
			return gson.toJson(responseMap);

		}
	}

}