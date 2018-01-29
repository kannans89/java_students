package com.techlabs.controller;

import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;
import com.google.gson.Gson;
import com.techlabs.dto.SubTaskDto;
import com.techlabs.dto.TaskDto;
import com.techlabs.dto.UserDto;
import com.techlabs.entity.User;
import com.techlabs.service.TaskService;

@Controller
public class TaskController {

	@Autowired
	TaskService taskService;

	@RequestMapping(value = "/user/authenticate", method = RequestMethod.POST)
	public @ResponseBody Map<String, Boolean> login(@RequestBody UserDto userDto, HttpServletRequest request,
			HttpServletResponse response) {
		Map<String, Boolean> map = new HashMap<String, Boolean>();
		User user = taskService.authenticate(userDto);
		if (user != null) {
			request.getSession().setAttribute("user", user);
			map.put("status", true);
		} else {
			map.put("status", false);
		}
		return map;
	}

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public @ResponseBody Map<String, Boolean> logout(HttpServletRequest request, HttpServletResponse response) {
		Map<String, Boolean> map = new HashMap<String, Boolean>();
		User user = (User) request.getSession().getAttribute("user");
		if (user != null) {
			request.getSession().invalidate();
			map.put("status", true);
		} else {
			map.put("status", false);
		}
		return map;
	}

	@RequestMapping(value = "/signup", method = RequestMethod.POST)
	public @ResponseBody Map<String, Boolean> adduser(@RequestBody String dto, HttpServletRequest request,
			HttpServletResponse response) {
		Map<String, Boolean> map = new HashMap<String, Boolean>();
		User user = (User) request.getSession().getAttribute("user");
		if (user == null) {
			Gson gson = new Gson();
			UserDto userDto = gson.fromJson(dto, UserDto.class);
			taskService.addUser(userDto);
			map.put("status", true);
		} else {
			map.put("status", false);
		}
		return map;
	}

	@RequestMapping(value = "/tasks", method = RequestMethod.GET)
	public @ResponseBody String getTasks(HttpServletRequest request, HttpServletResponse response) {
		String jsonResponse = null;
		User user = (User) request.getSession().getAttribute("user");
		if (user != null) {
			Gson gson = new Gson();
			// jsonResponse =
			// gson.toJson(taskService.getTasks(user.getUserId()));
			jsonResponse = gson.toJson(taskService.getTasks(user.getUsername()));
		}
		return jsonResponse;
	}

	@RequestMapping(value = "/task/{taskId}", method = RequestMethod.GET)
	public @ResponseBody Map<String, Object> getTaskById(@PathVariable("taskId") int taskId, HttpServletRequest request,
			HttpServletResponse response) {
		Map<String, Object> map = new HashMap<String, Object>();
		User user = (User) request.getSession().getAttribute("user");
		if (user != null) {
			/*
			 * Gson gson = new Gson(); String jsonResponse =
			 * gson.toJson(taskService.getTaskById(user.getUsername(), taskId));
			 */
			map.put("status", true);
			map.put("result", taskService.getTaskById(user.getUsername(), taskId));
		} else {
			map.put("status", false);
		}
		// return jsonResponse;
		return map;
	}

	@RequestMapping(value = "task/{taskId}/subtasks", method = RequestMethod.GET)
	public @ResponseBody String getSubTasks(@PathVariable("taskId") int taskId, HttpServletRequest request,
			HttpServletResponse response) {
		String jsonResponse = null;
		User user = (User) request.getSession().getAttribute("user");
		if (user != null) {
			Gson gson = new Gson();
			jsonResponse = gson.toJson(taskService.getSubTasks(user.getUsername(), taskId));
		}
		return jsonResponse;
	}

	@RequestMapping(value = "/task/{taskId}/subtask/{subtaskId}", method = RequestMethod.GET)
	public @ResponseBody Map<String, Object> getSubTaskById(@PathVariable("taskId") int taskId,
			@PathVariable("subtaskId") int subtaskId, HttpServletRequest request, HttpServletResponse response) {
		Map<String, Object> map = new HashMap<String, Object>();
		User user = (User) request.getSession().getAttribute("user");
		if (user != null) {
			map.put("status", true);
			map.put("result", taskService.getSubTaskById(user.getUsername(), taskId, subtaskId));
		} else {
			map.put("status", false);
		}
		return map;
	}

	@RequestMapping(value = "/addtask", method = RequestMethod.POST)
	public @ResponseBody Map<String, Boolean> addTask(@RequestBody String taskDto, HttpServletRequest request,
			HttpServletResponse response) {
		Map<String, Boolean> map = new HashMap<String, Boolean>();
		User user = (User) request.getSession().getAttribute("user");
		if (user != null) {
			Gson gson = new Gson();
			System.out.println(taskDto);
			TaskDto dto = gson.fromJson(taskDto, TaskDto.class);
			taskService.addTask(user.getUsername(), dto);
			map.put("status", true);
		} else {
			map.put("status", false);
		}
		return map;
	}

	@RequestMapping(value = "/task/{taskId}/addsubtask", method = RequestMethod.POST)
	public @ResponseBody Map<String, Boolean> addsubTask(@PathVariable("taskId") int taskId,
			@RequestBody String subtaskDto, HttpServletRequest request, HttpServletResponse response) {
		Map<String, Boolean> map = new HashMap<String, Boolean>();
		User user = (User) request.getSession().getAttribute("user");
		if (user != null) {
			Gson gson = new Gson();
			System.out.println(subtaskDto);
			SubTaskDto dto = gson.fromJson(subtaskDto, SubTaskDto.class);
			taskService.addSubTask(user.getUsername(), taskId, dto);
			map.put("status", true);
		} else {
			map.put("status", false);
		}
		return map;
	}

	@RequestMapping(value = "/updatetask/{taskId}", method = RequestMethod.PUT)
	public @ResponseBody Map<String, Boolean> updateTask(@PathVariable("taskId") int taskId,
			@RequestBody TaskDto taskDto, HttpServletRequest request, HttpServletResponse response) {
		Map<String, Boolean> map = new HashMap<String, Boolean>();
		User user = (User) request.getSession().getAttribute("user");
		if (user != null) {
			taskService.updateTask(user.getUsername(), taskDto);
			map.put("status", true);
		} else {
			map.put("status", false);
		}
		return map;
	}

	@RequestMapping(value = "/task/{taskId}/updatesubtask/{subtaskId}", method = RequestMethod.PUT)
	public @ResponseBody Map<String, Boolean> updateSubtask(@PathVariable("taskId") int taskId,
			@RequestBody SubTaskDto subtaskDto, HttpServletRequest request, HttpServletResponse response) {
		Map<String, Boolean> map = new HashMap<String, Boolean>();
		User user = (User) request.getSession().getAttribute("user");
		if (user != null) {
			taskService.updateSubTask(user.getUsername(), taskId, subtaskDto);
			map.put("status", true);
		} else {
			map.put("status", false);
		}
		return map;
	}

	@RequestMapping(value = "/deletetask/{taskId}", method = RequestMethod.DELETE)
	public @ResponseBody Map<String, Boolean> deleteTask(@PathVariable("taskId") int taskId, HttpServletRequest request,
			HttpServletResponse response) {
		Map<String, Boolean> map = new HashMap<String, Boolean>();
		User user = (User) request.getSession().getAttribute("user");
		if (user != null) {
			taskService.deleteTask(user.getUsername(), taskId);
			map.put("status", true);
		} else {
			map.put("status", false);
		}
		return map;
	}

	@RequestMapping(value = "/task/{taskId}/deletesubtask/{subtaskId}", method = RequestMethod.DELETE)
	public @ResponseBody Map<String, Boolean> deleteSubTask(@PathVariable("taskId") int taskId,
			@PathVariable("subtaskId") int subtaskId, HttpServletRequest request, HttpServletResponse response) {
		Map<String, Boolean> map = new HashMap<String, Boolean>();
		User user = (User) request.getSession().getAttribute("user");
		if (user != null) {
			taskService.deleteSubTask(user.getUsername(), taskId, subtaskId);
			map.put("status", true);
		} else {
			map.put("status", false);
		}
		return map;
	}

}