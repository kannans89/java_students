package com.techlab.student.action;

import com.opensymphony.xwork2.Action;
import com.techlab.student.model.Student;
import com.techlab.student.service.StudentService;

public class EditStudentAction implements Action {
	private int rollNo;
	private Student student;
	private boolean postBack=false;
public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	
	public boolean isPostBack() {
		return postBack;
	}
	public void setPostBack(boolean postBack) {
		this.postBack = postBack;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
		System.out.println("roll no="+rollNo);
	}
	@Override
	public String execute() throws Exception {
		if(postBack)
		{
			System.out.println("post call");
			new StudentService().addStudent(student);
			return "success";
		}
		else
		{
			System.out.println("get Call");
			student=new StudentService().getStudent(rollNo);
			return "edit";
		}
	}
}
