package com.techlabs.struct.spring.hibernate.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="STUDENTDATA")
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	public void setId(int id) {
		this.id = id;
	}
	private String name;
	private int rollNo;
	public Student() {
	}
	public Student(String name,int rollNo) {
		this.name=name;
		this.rollNo=rollNo;
		System.out.println("student created...!!");
	}
	public int getId() {
		return id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public int getRollNo() {
		return rollNo;
	}
}
