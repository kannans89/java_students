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
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.google.gson.Gson;
import com.techlabs.dto.SubTaskDto;
import com.techlabs.dto.TaskDto;
import com.techlabs.model.User;
import com.techlabs.model.SubTask;
import com.techlabs.model.Task;
import com.techlabs.service.SubTaskService;
import com.techlabs.utils.RequestReader;

@Controller
@RequestMapping("/SubTask")
public class SubTaskController {

	@Autowired
	private SubTaskService service;
	@Autowired
	SessionFactory sessionFactory;
	@Autowired
	RequestReader requestReader;

	@RequestMapping(value = "/addSubTask", method = RequestMethod.POST)
	public void addSubtask(HttpServletRequest request,
			HttpServletResponse response, @RequestParam("taskNo") int taskId)
			throws IOException, ParseException {
		String input = requestReader.getBody(request);
		Gson gson = new Gson();
		SubTaskDto subTaskDto = gson.fromJson(input, SubTaskDto.class);
		service.addSubTask(subTaskDto, taskId);
	}

	@RequestMapping(value = "/updateSubTask", method = RequestMethod.PUT)
	public void updateSubtask(HttpServletRequest request,
			HttpServletResponse response) throws IOException, ParseException {
		String input = requestReader.getBody(request);
		Gson gson = new Gson();
		SubTaskDto subTaskDto = gson.fromJson(input, SubTaskDto.class);
		service.update(subTaskDto);
	}

	@RequestMapping(value = "/deleteSubTask", method = RequestMethod.DELETE)
	public void deleteSubtask(HttpServletRequest request,
			HttpServletResponse response,@RequestParam("subTaskno") int subTaskId) throws IOException, ParseException {
		service.delete(subTaskId);
	}

	@RequestMapping(value = "/getSubTasks", method = RequestMethod.GET)
	public @ResponseBody String getSubtasks(@RequestParam("taskNo") int taskId)
			throws IOException {
		Gson gson = new Gson();
		List<SubTaskDto> SubTasks = service.getSubTasksByTaskId(taskId);
		System.out.println(SubTasks);

		return gson.toJson(SubTasks);
	}

	@RequestMapping(value = "/getSubTaskById", method = RequestMethod.GET)
	public @ResponseBody String getSubtaskById(
			@RequestParam("subTaskNo") String subTaskNo) throws IOException {
		Gson gson = new Gson();
		// System.out.println(subtaskId);
		SubTaskDto SubTaskDto = service.getSubTasksById(Integer
				.parseInt(subTaskNo));

		return gson.toJson(SubTaskDto);
	}

}
