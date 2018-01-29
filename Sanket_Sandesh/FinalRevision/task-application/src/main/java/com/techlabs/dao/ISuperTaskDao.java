package com.techlabs.dao;

import java.util.List;
import org.springframework.stereotype.Repository;
import com.techlabs.entity.Task;

@Repository
public interface ISuperTaskDao {
	
	public void addTask(int userId, Task task);

	public List<Task> getTasks(int userId);
	
	public Task getTaskById(int userId, int taskId);
	
	public void updateTask(int userId, int taskId);
	
	public void deleteTask(int userId, int taskId);
	
}