package com.techlabs.dto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.techlabs.entity.Student;
import com.techlabs.student.dao.StudentDaoImp;

@Service
public class StudentService {
	@Autowired
	private StudentDaoImp daoImp;

	@Transactional(readOnly=true)
	public List<Student> getStudentList() {
		return daoImp.getStudentList();
	}

	@Transactional
	public void addStudentToList(Student student) {
		daoImp.addStudentToList(student);
	}

	@Transactional(readOnly=true)
	public Student getStudentByRollNo(int rollNo) {
		return daoImp.getStudentByRollNo(rollNo);
	}

	@Transactional
	public void updateStudent(int rollNo, Student updateStudent) {
		daoImp.updateStudent(rollNo, updateStudent);
	}

	@Transactional
	public void deleteStudentByRollNo(int rollNo) {
		daoImp.deleteStudentByRollNo(rollNo);
	}

}
