package com.techlabs.dto;

import java.util.Date;
import java.util.Set;

public class TaskDto {
	private int taskId;
	private String name;
	private Date startDate;
	private Date endDate;
	private UserDto userDto;
	private Set<SubTaskDto> subTasks;

	public TaskDto() {
	}

	public TaskDto(int taskId, String name, Date startDate, Date endDate) {
		this.taskId = taskId;
		this.name = name;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public int getTaskId() {
		return taskId;
	}

	public String getName() {
		return name;
	}

	public Date getStartDate() {
		return startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public UserDto getUserDto() {
		return userDto;
	}

	public Set<SubTaskDto> getSubTasks() {
		return subTasks;
	}

}