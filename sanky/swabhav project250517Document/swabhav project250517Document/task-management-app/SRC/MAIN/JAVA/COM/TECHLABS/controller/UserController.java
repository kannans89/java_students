package com.techlabs.controller;

import java.io.IOException;
import java.util.*;

import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;
import javax.mail.Session;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
import com.techlabs.dto.UserDto;
import com.techlabs.dto.UserLoginDto;
import com.techlabs.dto.TaskDto;
import com.techlabs.model.User;
import com.techlabs.model.UserLogin;
import com.techlabs.model.SubTask;
import com.techlabs.model.Task;
import com.techlabs.service.UserLoginService;
import com.techlabs.service.UserService;
import com.techlabs.service.TaskService;
import com.techlabs.utils.RequestReader;

@RestController
@RequestMapping(value = "/User")
public class UserController {

	@Autowired
	private UserService service;
	@Autowired
	private UserLoginService loginService;
	@Autowired
	RequestReader requestReader;

	@RequestMapping(value = "/addUser", method = RequestMethod.POST)
	public void addUser(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		String input = requestReader.getBody(request);
		Gson gson = new Gson();
		UserDto userDto = gson.fromJson(input, UserDto.class);
		service.addUser(userDto);

	}

	@RequestMapping(value = "/updateUser", method = RequestMethod.PUT)
	public void updateUser(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		String input = requestReader.getBody(request);
		Gson gson = new Gson();
		UserDto userDto = gson.fromJson(input, UserDto.class);

		service.update(userDto);

	}

	@RequestMapping(value = "/getUser", method = RequestMethod.GET)
	public @ResponseBody String getUsers(HttpServletRequest request,
			HttpServletResponse response) throws IOException {
		String input = requestReader.getBody(request);
		Gson gson = new Gson();

		List<User> userList = service.getUsers();

		return gson.toJson(userList);

	}

	@RequestMapping(value = "/getUserByMail", method = RequestMethod.GET)
	public @ResponseBody String getUser(HttpServletRequest request,
			HttpServletResponse response, @RequestParam("mail") String mail)
			throws IOException {
		Map<String, Object> responseMap = new HashMap<String, Object>();
		Gson gson = new Gson();
		UserDto userDto = service.getUserByMail(mail);
		if (userDto != null) {
			responseMap.put("success", true);
			responseMap.put("successMessage", "user present");
			UserLoginDto dto = new UserLoginDto();
			dto.setUsername(userDto.getUserName());
			
			UserLogin userLogin = loginService.checkUsername(dto);
			service.sendMail(userDto.getMail(), userDto.getUserName(),
					userLogin.getPassword());
			return gson.toJson(responseMap);
		}else {
			responseMap.put("success", false);
			responseMap.put("errorMessage", "user not Found");
			return gson.toJson(responseMap);

		}

	}
}
