package com.techlabs.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import com.techlabs.dao.UserDao;
import com.techlabs.dao.TaskDao;
import com.techlabs.dto.SubTaskDto;
import com.techlabs.dto.TaskDto;
import com.techlabs.model.User;
import com.techlabs.model.SubTask;
import com.techlabs.model.Task;

@Service
public class TaskService {
	@Autowired
	private TaskDao taskDao;

	@Autowired
	private UserDao employeeDao;

	List<Task> taskDtos = new ArrayList<Task>();

	@Transactional
	public void addTask(TaskDto taskDto, int userId) throws ParseException {
		User employee = employeeDao.getUser(userId);
		SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy/MM/dd");
		Task task = new Task(taskDto.getTaskname(), dateFormatter.parse(taskDto
				.getStartDate()), dateFormatter.parse(taskDto.getEndDate()),
				employee);
		taskDao.save(task);
	}

	@Transactional
	public void delete(int taskId, User user) {
		Iterator<Task> itr = taskDao.getAllTasks(user).iterator();
		while (itr.hasNext()) {
			Task currentTask = itr.next();
			if (currentTask.getTask_id() == taskId) {
				currentTask.setEmployee(null);
			}
		}

	}

	@Transactional
	public void update(TaskDto taskDto) throws ParseException {
		SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy/MM/dd");
		Task task = taskDao.getTask(taskDto.getTaskno());
		task.setStartDate(dateFormatter.parse((taskDto.getStartDate())));
		task.setEndDate(dateFormatter.parse((taskDto.getEndDate())));
		task.setTask_name(taskDto.getTaskname());
		taskDao.update(task);
	}

	@Transactional
	public List<TaskDto> getTasksByUserId(int userId) {
		List<TaskDto> taskDtoList = new ArrayList<TaskDto>();
		SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy/MM/dd");
		List<Task> tasks = taskDao.getUserTasks(userId);
		for (Task task : tasks) {
			TaskDto taskdto = new TaskDto();
			taskdto.setTaskno(task.getTask_id());
			taskdto.setTaskname(task.getTask_name());
			taskdto.setStartDate(dateFormatter.format(task.getStartDate()));

			if (task.getEndDate() == null) {
				taskdto.setEndDate("0000/00/00");
			} else {
				taskdto.setEndDate(dateFormatter.format(task.getEndDate()));
			}
			taskdto.setSubTaskCount(taskDao.getSubTasks(task).size());
			taskDtoList.add(taskdto);
		}

		return taskDtoList;
	}

	@Transactional
	public TaskDto getTaskById(int taskId) {
		SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy/MM/dd");
		Task task = taskDao.getTask(taskId);
		TaskDto taskDto = new TaskDto();
		taskDto.setTaskno(task.getTask_id());
		taskDto.setTaskname(task.getTask_name());
		taskDto.setStartDate(dateFormatter.format(task.getStartDate()));
		taskDto.setEndDate(dateFormatter.format(task.getEndDate()));
		return taskDto;
	}
}
