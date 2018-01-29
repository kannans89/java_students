package com.techlab.student.action;

import java.util.Map;

import com.opensymphony.xwork2.Action;
import com.techlab.student.model.Student;
import com.techlab.student.service.StudentService;


public class DisplayAction implements Action {
	private Map<Integer,Student> studMap;
	public Map<Integer, Student> getStudMap() {
		return studMap;
	}
	public void setStudMap(Map<Integer, Student> studMap) {
		this.studMap = studMap;
	}
	public DisplayAction() {
			System.out.println("Inside Display Actionconstructor");
	}
		@Override
	public String execute() throws Exception {
		new StudentService();
		studMap = new StudentService().displayStudents();
		return "success";
	}

}
