package com.techlabs.dto;

import com.techlabs.model.Task;

public class SubTaskDto {
	
	private int subTaskno;
	private String subTaskname;
	private String startDate;
	private String endDate;
	private Task task;

	public SubTaskDto() {
	}

	public SubTaskDto(int subTaskno, String subTaskname, String startDate,
			String endDate) {
		super();
		this.subTaskno = subTaskno;
		this.subTaskname = subTaskname;
		this.startDate = startDate;
		this.endDate = endDate;

	}

	public int getSubTaskno() {
		return subTaskno;
	}

	public void setSubTaskno(int subTaskno) {
		this.subTaskno = subTaskno;
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

	@Override
	public String toString() {
		return "SubTaskDto [subTaskno=" + subTaskno + ", subTaskname="
				+ subTaskname + ", startDate=" + startDate + ", endDate="
				+ endDate + ", task=" + task + "]";
	}

	public String getSubTaskname() {
		return subTaskname;
	}

	public void setSubTaskname(String subTaskname) {
		this.subTaskname = subTaskname;
	}

	public Task getTask() {
		return task;
	}

	public void setTask(Task task) {
		this.task = task;
	}

}
