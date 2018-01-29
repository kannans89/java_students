package com.techlabs.manager;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.techlabs.dao.SubTaskDao;
import com.techlabs.dao.TaskDao;
import com.techlabs.dao.UserDao;
import com.techlabs.entity.SubTask;
import com.techlabs.entity.Task;
import com.techlabs.entity.User;

@Service
public class TaskManager {

	@Autowired
	private UserDao userDao;
	@Autowired
	private TaskDao taskDao;
	@Autowired
	private SubTaskDao subTaskDao;

	@Transactional(readOnly = true)
	public Set<User> getUserList() {
		return userDao.getUserList();
	}

	@Transactional(readOnly = true)
	public boolean isValidUser(String userName, String password) {
		return userDao.isValidUser(userName, password);
	}

	@Transactional(readOnly = true)
	public User getUserById(String userName) {
		return userDao.getUserById(userName);
	}

	@Transactional
	public void changePassword(User editUser) {
		userDao.changePassword(editUser);
	}

	@Transactional(readOnly = true)
	public Set<Task> getTaskList(User owner) {
		return taskDao.getTaskList(owner);
	}

	@Transactional
	public void addTaskToList(User owner, Task task) {
		taskDao.addTaskToList(owner, task);
	}

	@Transactional
	public void deleteTaskById(int taskId) {
		taskDao.deleteTaskById(taskId);
	}

	@Transactional(readOnly = true)
	public Task getTaskById(User owner, int taskId) {
		return taskDao.getTaskById(owner, taskId);
	}

	@Transactional
	public void updateTask(Task updateTask) {
		taskDao.updateTask(updateTask);
	}

	@Transactional(readOnly = true)
	public Set<SubTask> getSubTaskList(Task ownerTask) {
		return subTaskDao.getSubTaskList(ownerTask);
	}

	@Transactional
	public void addSubTaskToList(Task ownerTask, SubTask subTask) {
		subTaskDao.addSubTaskToList(ownerTask, subTask);
	}

	@Transactional
	public void deleteSubTaskById(int subTaskId) {
		subTaskDao.deleteSubTaskById(subTaskId);
	}

	@Transactional(readOnly = true)
	public SubTask getSubTaskById(Task ownerTask, int subTaskId) {
		return subTaskDao.getSubTaskById(ownerTask, subTaskId);
	}

	@Transactional
	public void updateSubTask(SubTask updateSubTask) {
		subTaskDao.updateSubTask(updateSubTask);
	}
}
