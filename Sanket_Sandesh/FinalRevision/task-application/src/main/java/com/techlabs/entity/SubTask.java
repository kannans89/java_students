package com.techlabs.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
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
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "subtask_id")
	private int subtaskId;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "start_date")
	private Date startDate;
	
	@Column(name  = "end_date")
	private Date endDate;
	
	
	
	@ManyToOne
	@JoinColumn(name = "task_id")
	private Task taskowner;
	
	public SubTask(){
	}
	
	public SubTask(String name, Date startDate, Date endDate) {
		this.name = name;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	
	public SubTask(int subtaskId, String name, Date startDate, Date endDate) {
		this.subtaskId = subtaskId;
		this.name = name;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public int getSubTaskId() {
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

	public Task getTaskowner() {
		return taskowner;
	}

	//setter methods
	public void setSubtaskId(int subtaskId) {
		this.subtaskId = subtaskId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public void setTaskowner(Task taskowner) {
		this.taskowner = taskowner;
	}
	
}