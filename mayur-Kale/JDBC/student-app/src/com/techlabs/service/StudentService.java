package com.techlabs.service;

import java.sql.SQLException;
import java.util.List;

import com.techlabs.database.StudentDao;
import com.techlabs.student.Student;

public class StudentService {
	StudentDao studentDao;

	public void connect() {
		try {
			studentDao = new StudentDao();
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (SQLException e) {
			System.out.println(e);
		}
	}

	public void addStudent(Student student) {
		try {
			studentDao.addStudent(student);
		} catch (SQLException e) {
			System.out.println(e);
		}
	}

	public List<Student> getAllStudent() {
		try {
			return studentDao.getStudents();
		} catch (SQLException e) {
			System.out.println(e);
			return null;
		}

	}

	public void close() {
		try {
			studentDao.close();
		} catch (SQLException e) {
			System.out.println(e);
		}
	}
}
