package com.techlabs.dto;

import java.util.Date;

public class SubTaskDto {
	private int subtaskId;
	private String name;
	private Date startDate;
	private Date endDate;
	private TaskDto taskDto;

	public SubTaskDto() {
	}

	public SubTaskDto(int subTaskId, String name, Date startDate, Date endDate) {
		this.subtaskId = subTaskId;
		this.name = name;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public int getSubtaskId() {
		return subtaskId;
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

	public TaskDto getTaskDto() {
		return taskDto;
	}

}