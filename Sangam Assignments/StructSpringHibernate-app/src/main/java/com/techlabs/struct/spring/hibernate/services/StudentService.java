package com.techlabs.struct.spring.hibernate.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techlabs.struct.spring.hibernate.dao.StudentDao;
import com.techlabs.struct.spring.hibernate.entities.Student;

@Service
public class StudentService {
	@Autowired
	private StudentDao studentRepo;

	public StudentService() {
		System.out.println("service object created..");
	}

	public void addStudent(String name, int rollNo) {
		studentRepo.createStudent(name, rollNo);
	}

	public List<Student> getStudentList() {
		return studentRepo.readStudentData();
	}

	public Student getStudent(int id) {
		return studentRepo.getStudent(id);
	}

	public void updateStudentTable(Student student) {
		studentRepo.update(student);
	}

	public void deleteStudent(int id) {
		studentRepo.delete(id);
	}
}
