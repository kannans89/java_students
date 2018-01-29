package com.techlabs.dto;

import java.util.Set;

public class UserDto {
	private String username;
	private String password;
	private String email;
	private Set<TaskDto> tasks;
	
	public UserDto() {
	}
	
	public UserDto(String username, String password, String email) {
		this.username = username;
		this.password = password;
		this.email = email;
		//this.tasks = new HashSet<Task>();
	}
	
	public UserDto(String username, String email){
		this.username = username;
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Set<TaskDto> getTasks() {
		return tasks;
	}

	public void setTasks(Set<TaskDto> tasks) {
		this.tasks = tasks;
	}

}