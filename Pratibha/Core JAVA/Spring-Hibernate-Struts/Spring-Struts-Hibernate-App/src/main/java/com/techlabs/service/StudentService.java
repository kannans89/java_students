package com.techlabs.service;

import java.util.List;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techlabs.dao.StudentDao;
import com.techlabs.model.Student;

@Service
public class StudentService {
	@Autowired
	private StudentDao dao;

	public StudentService() {
		System.out.println("Student Service Created");
	}

	public List<Student> getList() {
		return dao.get();
	}

	public void addStud(Student student) {
		dao.addStudent(student);
		
	}

	public void deleteStudent(int id) {
		dao.deleteStud(id);
		
	}

	public Student getStud(int id) {
		Student student = dao.getStudent(id);
		return student;
	}

	public void editStud(Student stud) {
	dao.editStudent(stud);
		
	}
}
