package com.techlabs.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tasks")
public class Task {
	@Id
	@GeneratedValue
	@Column(name = "task_id")
	private int taskId;
	@Column(name = "task_name")
	private String name;
	@Column(name = "task_descr")
	private String description;
	@Column(name = "task_status")
	private String status;

	@ManyToOne(fetch = FetchType.EAGER,cascade=CascadeType.PERSIST)
	@JoinColumn(name = "user_name")
	private User owner;

	@OneToMany(mappedBy = "taskOwner",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	private Set<SubTask> subTasks;

	public Task() {

	}

	public Task(String name, String description, String status) {
		this.name = name;
		this.description = description;
		this.status = status;
	}

	public int getTaskId() {
		return taskId;
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

//	public User getOwner() {
//		return owner;
//	}

	public void setOwner(User owner) {
		this.owner = owner;
	}

	public Set<SubTask> getSubTasks() {
		return subTasks;
	}

	public void setSubTasks(Set<SubTask> subTasks) {
		this.subTasks = subTasks;
	}

	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}

}
