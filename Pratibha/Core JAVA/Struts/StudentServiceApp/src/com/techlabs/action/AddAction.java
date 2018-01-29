package com.techlabs.action;

import com.opensymphony.xwork2.Action;
import com.techlabs.model.Student;
import com.techlabs.service.StudentService;

public class AddAction implements Action {
	private Student student;
public AddAction(){
	System.out.println("AddAction Constructor");
	//System.out.println(student.getRollno());
}
	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String execute() throws Exception {
		System.out.println("AddAction execute method invocing");
		System.out.println(student.getName());
		StudentService ss = new StudentService();
		ss.addStudent(student);
		return "success";

	}

}
