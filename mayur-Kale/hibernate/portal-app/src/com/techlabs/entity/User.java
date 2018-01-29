package com.techlabs.entity;

public class User {
	private String uid;
	private String password;
	private String role;

	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(String uid, String password, String role) {
		this.uid = uid;
		this.password = password;
		this.role = role;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
}
