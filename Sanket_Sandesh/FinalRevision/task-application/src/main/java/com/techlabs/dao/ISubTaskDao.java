package com.techlabs.dao;

import java.util.List;
import org.springframework.stereotype.Repository;
import com.techlabs.entity.SubTask;
import com.techlabs.entity.Task;

@Repository
public interface ISubTaskDao {
	
	public void addSubTask(Task taskId, SubTask subTask);
	
	public List<SubTask> getSubTasks(int userID, int taskId);
	
	public SubTask getSubTaskById(int userId, int taskId, int subTaskId);
	
	public void updateSubTask(int subTaskId);
	
	public void deleteSubTask(int subTaskId);
	
}