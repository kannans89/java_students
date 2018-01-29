package com.techlabs.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.techlabs.dao.UserDao;
import com.techlabs.dto.SubTaskDto;
import com.techlabs.dto.TaskDto;
import com.techlabs.dto.UserDto;
import com.techlabs.entity.SubTask;
import com.techlabs.entity.Task;
import com.techlabs.entity.User;

@Service
public class TaskService {

	@Autowired
	UserDao dao;

	@Transactional
	public User authenticate(UserDto userDto) {
		User user = dao.getUserByUsername(userDto.getUsername());
		if (user != null) {
			if (user.getPassword().equals(userDto.getPassword())) {
				return user;
			}
		} else {
			return null;
		}
		return null;
	}

	@Transactional
	public void addUser(UserDto userDto) {
		dao.addUser(userDto);
	}


	@Transactional
	public List<Task> getTasks(String username) {
		List<Task> taskList = new ArrayList<Task>();
		// User user = dao.getUserById(userId);
		User user = dao.getUserByUsername(username);
		System.out.println("Task Size is " + user.getTasks().size());
		for (Task loopTask : user.getTasks()) {
			Task task = new Task(loopTask.getTaskId(), loopTask.getName(), loopTask.getStartDate(),
					loopTask.getEndDate());
			taskList.add(task);
		}
		return taskList;
	}

	@Transactional(readOnly = true)
	public Task getTaskById(String username, int taskId) {
		// User user = dao.getUserById(userId);
		Task task = null; // new Task();
		User user = dao.getUserByUsername(username);
		for (Task looptask : user.getTasks()) {
			if (looptask.getTaskId() == taskId) {
				try {
					task = looptask;
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		return task;
	}

	@Transactional
	public List<SubTask> getSubTasks(String username, int taskId) {
		List<SubTask> subTaskList = new ArrayList<SubTask>();
		Task task = getTaskById(username, taskId);
		for (SubTask loopSubTask : task.getSubTasks()) {
			SubTask subTask = new SubTask(loopSubTask.getSubTaskId(), loopSubTask.getName(), loopSubTask.getStartDate(),
					loopSubTask.getEndDate());
			subTaskList.add(subTask);
		}
		return subTaskList;
	}

	@Transactional(readOnly = true)
	public SubTask getSubTaskById(String username, int taskId, int subTaskId) {
		SubTask subTask = null;
		Task task = getTaskById(username, taskId);
		for (SubTask loopSubTask : task.getSubTasks()) {
			if (loopSubTask.getSubTaskId() == subTaskId) {
				System.out.println("LoopSubTask is " + loopSubTask);
				subTask = loopSubTask;
			}
		}
		return subTask;
	}

	@Transactional
	public void addTask(String username, TaskDto taskDto) {
		// User user = dao.getUserById(userId);
		User user = dao.getUserByUsername(username);
		Task task = new Task(taskDto.getTaskId(), taskDto.getName(), taskDto.getStartDate(), taskDto.getEndDate());
		task.setOwner(user);
		user.getTasks().add(task);
	}

	@Transactional
	public void addSubTask(String username, int taskId, SubTaskDto subTaskDto) {
		Task task = getTaskById(username, taskId);
		System.out.println("TaskId is " + task.getTaskId());
		SubTask subTask = new SubTask(subTaskDto.getName(), subTaskDto.getStartDate(), subTaskDto.getStartDate());
		subTask.setTaskowner(task);
		task.getSubTasks().add(subTask);
	}

	@Transactional
	public void updateTask(String username, TaskDto taskDto) {
		// User user = dao.getUserById(userId);
		User user = dao.getUserByUsername(username);
		for (Task task : user.getTasks()) {
			if (task.getTaskId() == taskDto.getTaskId()) {
				task.setName(taskDto.getName());
				task.setStartDate(taskDto.getStartDate());
				task.setEndDate(taskDto.getEndDate());
			}
		}
	}

	@Transactional
	public void updateSubTask(String username, int taskId, SubTaskDto subtaskDto) {
		Task task = getTaskById(username, taskId);
		for (SubTask subTask : task.getSubTasks()) {
			if (subTask.getSubTaskId() == subtaskDto.getSubtaskId()) {
				subTask.setName(subtaskDto.getName());
				subTask.setStartDate(subtaskDto.getStartDate());
				subTask.setEndDate(subtaskDto.getEndDate());
			}
		}
	}

	@Transactional
	public void deleteTask(String username, int taskId) {
		// User user = dao.getUserById(userId);
		User user = dao.getUserByUsername(username);
		Task taskToBeRemoved = getTaskById(username, taskId);
		Boolean status = user.getTasks().remove(taskToBeRemoved);
		System.out.println("Status is " + status + "\n\n");

	}

	@Transactional
	public void deleteSubTask(String username, int taskId, int subtaskId) {
		Task task = getTaskById(username, taskId);
		SubTask subTaskToBeRemoved = getSubTaskById(username, taskId, subtaskId);
		Boolean status = task.getSubTasks().remove(subTaskToBeRemoved);
		System.out.println("Status is " + status + "\n\n");
	}

}