package com.techlabs.struct.spring.hibernate.viewmodel;

import java.util.List;

import com.techlabs.struct.spring.hibernate.entities.Student;



public class DisplayViewModel {
	private List<Student> studentList; 
	public DisplayViewModel() {
		System.out.println("view model constructor");
	}
	
	public List<Student> getStudentList() {
		return studentList;
	}
	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}
}
