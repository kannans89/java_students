package com.techlabs.action;

import com.opensymphony.xwork2.Action;
import com.techlabs.service.StudentService;

public class DeleteAction implements Action{
private int id;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

@Override
public String execute() throws Exception {
System.out.println("id: "+id);
StudentService ss=new StudentService();
ss.deleteStudent(id);
	return "success";
}
}
