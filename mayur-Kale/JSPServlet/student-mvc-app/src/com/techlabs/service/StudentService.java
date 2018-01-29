package com.techlabs.service;

import java.util.ArrayList;
import java.util.List;

import com.techlabs.student.Student;

public class StudentService {

	private List<Student> studentList;

	public StudentService() {

		studentList = new ArrayList<Student>();
		studentList.add(new Student(1, "Mayur", 21));
		studentList.add(new Student(2, "Vikram", 21));
		studentList.add(new Student(3, "Kannan", 21));
	}

	public List<Student> getStudentList() {
		return studentList;
	}

}
