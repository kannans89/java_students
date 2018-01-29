package com.techlabs.student.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.techlabs.entity.Student;
@Repository
public interface StudentDao {
	public List<Student> getStudentList();
	public void addStudentToList(Student student);
	public Student getStudentByRollNo(int rollNo);
	public void updateStudent(int rollNo,Student updateStudent);
	public void deleteStudentByRollNo(int rollNo);
		
}
