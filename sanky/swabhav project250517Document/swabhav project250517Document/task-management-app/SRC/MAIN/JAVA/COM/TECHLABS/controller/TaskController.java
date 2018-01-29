package com.techlabs.controller;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.techlabs.dto.SubTaskDto;
import com.techlabs.dto.TaskDto;
import com.techlabs.model.User;
import com.techlabs.model.Task;
import com.techlabs.service.UserService;
import com.techlabs.service.TaskService;
import com.techlabs.utils.RequestReader;

@RestController
@RequestMapping("/Task")
public class TaskController {

	@Autowired
	private TaskService service;
	@Autowired
	private UserService userService;
	@Autowired
	RequestReader requestReader;

	@RequestMapping(value = "/addTask", method = RequestMethod.POST)
	public void addTask(HttpServletRequest request, HttpServletResponse response)
			throws ParseException, IOException {
		String input = requestReader.getBody(request);
		Gson gson = new Gson();
		TaskDto taskDto = gson.fromJson(input, TaskDto.class);
		HttpSession session = request.getSession(false);
		String username = (String) session.getAttribute("User");
		User user = userService.getUser(username);
		int userId = user.getId();
		service.addTask(taskDto, userId);
	}

	@RequestMapping(value = "/getUserTasks", method = RequestMethod.GET)
	public @ResponseBody String getUserTasks(HttpServletRequest request,
			HttpServletResponse response) {
		HttpSession session = request.getSession(false);
		String username = (String) session.getAttribute("User");
		User user = userService.getUser(username);
		System.out.println(user);
		int userId = user.getId();
		List<TaskDto> tasks = service.getTasksByUserId(userId);
		Gson gson = new Gson();
		return gson.toJson(tasks);
	}

	@RequestMapping(value = "/updateTask", method = RequestMethod.PUT)
	public void updateTask(HttpServletRequest request,
			HttpServletResponse response) throws IOException, ParseException {
		String input = requestReader.getBody(request);
		Gson gson = new Gson();
		TaskDto taskDto = gson.fromJson(input, TaskDto.class);
		service.update(taskDto);
		

	}

	@RequestMapping(value = "/deleteTask", method = RequestMethod.DELETE)
	public void deleteTask(HttpServletRequest request,
			HttpServletResponse response, @RequestParam("taskNo") int taskId)
			throws IOException {
		HttpSession session = request.getSession(false);
		User user = userService.getUser((String) session
				.getAttribute("User"));
		service.delete(taskId, user);
	}

	@RequestMapping(value = "/getTaskById", method = RequestMethod.GET)
	public @ResponseBody String getUserTasksById(
			@RequestParam("taskNo") String taskNo) throws IOException {
		Gson gson = new Gson();
		
		TaskDto taskDto = service.getTaskById(Integer.parseInt(taskNo));

		return gson.toJson(taskDto);
	}

}
