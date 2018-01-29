package com.techlabs.action;

import java.util.List;

import com.opensymphony.xwork2.Action;
import com.techlabs.model.Student;
import com.techlabs.service.StudentService;

public class DisplayAction implements Action{
private List<Student> list;
public List<Student> getList() {
	return list;
}
public void setList(List<Student> list) {
	this.list = list;
}
@Override
public String execute() throws Exception {
	System.out.println("DisplayAction is executing");
	list=StudentService.getStudentList();
	for(Student s:list){
		System.out.println(s.getName()+"   "+s.getAge());
	}
	return "success";
}
}
