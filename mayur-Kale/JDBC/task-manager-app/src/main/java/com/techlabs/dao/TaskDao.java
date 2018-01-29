package com.techlabs.dao;

import java.util.Set;

import org.springframework.stereotype.Repository;

import com.techlabs.entity.Task;
import com.techlabs.entity.User;

@Repository
public interface TaskDao {

	public Set<Task> getTaskList(User owner);

	public void addTaskToList(User owner,Task task);

	public void deleteTaskById(int taskId);

	public Task getTaskById(User owner, int taskId);

	public void updateTask(Task updateTask);
}
