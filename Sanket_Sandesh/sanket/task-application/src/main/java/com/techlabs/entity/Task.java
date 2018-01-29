package com.techlabs.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "task")
public class Task {
	
	@Id
	@Column(name = "task_id", unique = true, nullable = false)
	private int taskId;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "start_date")
	private Date startDate;
	
	@Column(name = "end_date")
	private Date endDate;
	
	@Column(name = "status", nullable=false, columnDefinition="boolean default true")
	private boolean status=true;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "user_id")
	private User owner;
	
	@OneToMany(mappedBy = "taskowner", cascade=CascadeType.ALL, fetch=FetchType.LAZY, orphanRemoval=true)
	private Set<SubTask> subTasks;
	
	public Task() {
	}
	
	public Task(int taskId, String name, Date startDate, Date endDate) {
		this.taskId = taskId;
		this.name = name;
		this.startDate = startDate;
		this.endDate = endDate;
		this.status = true;
		this.subTasks = new HashSet<SubTask>();
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

	public boolean isStatus() {
		return status;
	}

	public User getOwner() {
		return owner;
	}

	public Set<SubTask> getSubTasks() {
		return subTasks;
	}
	
	//Setter Methods
	public void setTaskId(int taskId) {
		this.taskId = taskId;
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

	public void setStatus(boolean status) {
		this.status = status;
	}

	public void setOwner(User owner) {
		this.owner = owner;
	}

	public void setSubTasks(Set<SubTask> subTasks) {
		this.subTasks = subTasks;
	}
	

}