package com.techlabs.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "emp_id")
	public int id;
	@Column(name = "emp_name")
	private String name;
	@Column(name = "username")
	private String username;
	@Column(name = "dept_name")
	private String dept;
	@Column(name = "email")
	private String email;
	// private String address;
	@Column(name = "mobile_no")
	private int mobileNo;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "employee")
	private List<Task> tasks = new ArrayList<Task>();


	public User() {
	}

	public User(String name, String username, String dept, String email,
			int mobileNo) {
		
		this.name = name;
		this.username = username;
		this.dept = dept;
		this.email = email;
		this.mobileNo = mobileNo;
		
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String usernname) {
		this.username = usernname;
	}

	
	public List<Task> getTasks() {
		return tasks;
	}

	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	// public String getAddress() {
	// return address;
	// }
	//
	// public void setAddress(String address) {
	// this.address = address;
	// }

	public int getMobileno() {
		return mobileNo;
	}

	public void setMobileno(int mobileNo) {
		this.mobileNo = mobileNo;
	}

}
