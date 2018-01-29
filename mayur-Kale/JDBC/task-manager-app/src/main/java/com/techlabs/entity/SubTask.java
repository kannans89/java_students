package com.techlabs.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "sub_tasks")
public class SubTask {
	@Id
	@GeneratedValue
	@Column(name = "subtask_id")
	private int subTaskId;

	@Column(name = "subtask_name")
	private String name;
	@Column(name = "subtask_descr")
	private String description;
	@Column(name = "subtask_status")
	private String status;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "task_id")
	private Task taskOwner;

	public SubTask() {

	}

	public SubTask(String name, String description, String status) {
		super();
		this.name = name;
		this.description = description;
		this.status = status;
	}

	public void setSubTaskId(int subTaskId) {
		this.subTaskId = subTaskId;
	}

	public void setTaskOwner(Task taskOwner) {
		this.taskOwner = taskOwner;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getSubTaskId() {
		return subTaskId;
	}

	// public Task getTaskOwner() {
	// return taskOwner;
	// }

}
