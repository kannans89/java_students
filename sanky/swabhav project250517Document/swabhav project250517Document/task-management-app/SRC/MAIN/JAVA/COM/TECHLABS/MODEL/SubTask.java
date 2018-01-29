package com.techlabs.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "subtask")
public class SubTask {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "subtask_id")
	public int subtask_id;
	@Column(name = "subtask_name")
	private String subtask_name;
	@Column(name = "start_date")
	private Date startDate;
	@Column(name = "end_date")
	private Date endDate;

	@ManyToOne
	@JoinColumn(name = "task_id", nullable = false)
	private Task task;

	public SubTask(String subtask_name, Date startDate, Date endDate, Task task) {
		super();
		this.subtask_name = subtask_name;
		this.startDate = startDate;
		this.endDate = endDate;
		this.task = task;
	}

	public Task getTask() {
		return task;
	}

	public void setTask(Task task) {
		this.task = task;
	}

	public SubTask() {
	}

	@Override
	public String toString() {
		return "SubTask [subtask_id=" + subtask_id + ", subtask_name="
				+ subtask_name + ", startDate=" + startDate + ", endDate="
				+ endDate + ", task=" + task + "]";
	}

	public int getSubtask_id() {
		return subtask_id;
	}

	public void setSubtask_id(int subtask_id) {
		this.subtask_id = subtask_id;
	}

	public String getSubtask_name() {
		return subtask_name;
	}

	public void setSubtask_name(String subtask_name) {
		this.subtask_name = subtask_name;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date date) {
		this.startDate = date;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

}
