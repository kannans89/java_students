package com.techlab.student.action;

import com.opensymphony.xwork2.Action;
import com.techlab.student.model.Student;
import com.techlab.student.service.StudentService;

public class DeleteStudentAction implements Action{
	private int rollNo;
	private Student  student;
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = new Student();
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
		System.out.println("delete this "+rollNo);
	}
	@Override
	public String execute() throws Exception {
		new StudentService().deleteStudent(rollNo);
		return "success";
	}

}
