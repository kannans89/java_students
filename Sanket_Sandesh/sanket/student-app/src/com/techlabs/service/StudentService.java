package com.techlabs.service;

import java.util.ArrayList;

public class StudentService {

	public static ArrayList<Student> studentList;
	private static StudentService studentService;

	private StudentService() {
		studentList = new ArrayList<Student>();
	}

	public static StudentService getStudentService() {
		if (studentService == null) {
			studentService = new StudentService();
		}
		return studentService;
	}

	public void add(Student student) {
		studentList.add(student);
	}

	public ArrayList<Student> getStudents() {
		return studentList;
	}

	public Student getStudentById(String id) {
		for (Student student : studentList) {
			if (student.id.equals(id)) {
				return student;
			}
		}
		return null;
	}

	public void update(Student student) {
		for (Student student2 : studentList) {
			if (student.id.equals(student2.id)) {
				student2.name = student.name;
				student2.address = student.address;
			}
		}
	}

	public void delete(String id) {
		for (Student student : studentList) {
			if (student.id.equals(id)) {
				studentList.remove(student);
				break;
			}
		}
	}

}
