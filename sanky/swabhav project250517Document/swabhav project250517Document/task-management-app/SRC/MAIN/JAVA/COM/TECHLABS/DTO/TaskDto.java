package com.techlabs.dto;

import com.techlabs.model.User;

public class TaskDto {
	private int taskNo;
	private String taskName;
	private String startDate;
	private String endDate;
	private User employee;
	private int subTaskCount;

	public int getSubTaskCount() {
		return subTaskCount;
	}

	public void setSubTaskCount(int subTaskCount) {
		this.subTaskCount = subTaskCount;
	}

	public TaskDto(String taskName, String startDate, String endDate) {
		super();
		this.taskName = taskName;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public TaskDto() {
	}

	public int getTaskno() {
		return taskNo;
	}

	public void setTaskno(int taskNo) {
		this.taskNo = taskNo;
	}

	public String getTaskname() {
		return taskName;
	}

	public void setTaskname(String taskName) {
		this.taskName = taskName;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public User getEmployee() {
		return employee;
	}

	public void setEmployee(User employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "TaskDto [taskno=" + taskNo + ", taskname=" + taskName
				+ ", startDate=" + startDate + ", endDate=" + endDate
				+ ", employee=" + employee + ", subtask=" + "]";
	}

}
