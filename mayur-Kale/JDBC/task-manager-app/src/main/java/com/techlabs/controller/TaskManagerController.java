package com.techlabs.controller;

import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.techlabs.entity.SubTask;
import com.techlabs.entity.Task;
import com.techlabs.entity.User;
import com.techlabs.manager.TaskManager;

@Controller
public class TaskManagerController {
	@Autowired
	TaskManager manager;
	User owner = new User("mayur", "mayur");
	@RequestMapping(value = "/task/allTask", method = RequestMethod.GET)
	public @ResponseBody Set<Task> getTasksList(HttpServletRequest req,
			HttpServletResponse resp) {
//		User owner = (User) req.getSession().getAttribute("owner");
		if (owner != null) {
			return manager.getTaskList(owner);
		}
		return null;
	}

	@RequestMapping(value = "/task/{taskId}", method = RequestMethod.GET)
	public @ResponseBody Task getTaskById(@PathVariable("taskId") int taskId,
			HttpServletRequest req, HttpServletResponse resp) {
//		User owner = (User) req.getSession().getAttribute("owner");
		if (owner != null) {
			return manager.getTaskById(owner, taskId);
		}
		return null;
	}

	@RequestMapping(value = "/task/addTask", method = RequestMethod.POST)
	public @ResponseBody boolean addTask(@RequestBody Task task,
			HttpServletRequest req, HttpServletResponse resp) {
//		User owner = (User) req.getSession().getAttribute("owner");
		if (owner != null) {
			manager.addTaskToList(owner, task);
			return true;
		}
		return false;
	}

	@RequestMapping(value = "/task/{taskId}", method = RequestMethod.DELETE)
	public @ResponseBody boolean deleteTaskById(
			@PathVariable("taskId") int taskId, HttpServletRequest req,
			HttpServletResponse resp) {
//		User owner = (User) req.getSession().getAttribute("owner");
		if (owner != null) {
			manager.deleteTaskById(taskId);
			return true;
		}
		return false;
	}

	@RequestMapping(value = "/task/{taskId}", method = RequestMethod.PUT)
	public @ResponseBody boolean updateTask(@RequestBody Task updateTask,
			@PathVariable("taskId") int taskId, HttpServletRequest req,
			HttpServletResponse resp) {
//		User owner = (User) req.getSession().getAttribute("owner");
		if (owner != null) {
			manager.updateTask(updateTask);
			return true;
		}
		return false;
	}

	@RequestMapping(value = "/task/{taskId}/addSubTask", method = RequestMethod.POST)
	public @ResponseBody boolean addSubTask(@RequestBody SubTask subTask,
			@PathVariable("taskId") int taskId, HttpServletRequest req,
			HttpServletResponse resp) {
//		User owner = (User) req.getSession().getAttribute("owner");
		if (owner != null) {
			manager.addSubTaskToList(manager.getTaskById(owner, taskId),
					subTask);
			return true;
		}
		return false;
	}

	@RequestMapping(value = "/task/{taskId}/all", method = RequestMethod.GET)
	public @ResponseBody Set<SubTask> getSubTaskList(
			@PathVariable("taskId") int taskId, HttpServletRequest req,
			HttpServletResponse resp) {
//		User owner = (User) req.getSession().getAttribute("owner");
		if (owner != null) {
			return manager.getSubTaskList(manager.getTaskById(owner, taskId));
		}
		return null;
	}

	@RequestMapping(value = "/task/{taskId}/{subTaskId}", method = RequestMethod.GET)
	public @ResponseBody SubTask getSubTaskById(
			@PathVariable("taskId") int taskId,
			@PathVariable("subTaskId") int subTaskId, HttpServletRequest req,
			HttpServletResponse resp) {
//		User owner = (User) req.getSession().getAttribute("owner");
		if (owner != null) {
			return manager.getSubTaskById(manager.getTaskById(owner, taskId),
					subTaskId);
		}
		return null;
	}

	@RequestMapping(value = "/task/{taskId}/{subTaskId}", method = RequestMethod.DELETE)
	public @ResponseBody boolean deleteSubTaskById(@PathVariable("taskId") int taskId,
			@PathVariable("subTaskId") int subTaskId, HttpServletRequest req,
			HttpServletResponse resp) {
//		User owner = (User) req.getSession().getAttribute("owner");
		if (owner != null) {
			manager.deleteSubTaskById(subTaskId);
			return true;
		}
		return false;
	}

	@RequestMapping(value = "/task/{taskId}/{subTaskId}", method = RequestMethod.PUT)
	public @ResponseBody boolean updateSubTask(
			@RequestBody SubTask updateSubTask,
			@PathVariable("taskId") int taskId, HttpServletRequest req,
			HttpServletResponse resp) {
//		User owner = (User) req.getSession().getAttribute("owner");
		if (owner != null) {
			manager.updateSubTask(updateSubTask);
			return true;
		}
		return false;
	}

}
