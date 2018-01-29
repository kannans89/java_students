package com.techlabs.struct.spring.hibernate.actions;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlabs.struct.spring.hibernate.services.StudentService;
import com.techlabs.struct.spring.hibernate.viewmodel.AddStudentViewModel;

@SuppressWarnings("serial")
public class AddAction extends ActionSupport implements ModelDriven<AddStudentViewModel>{
	private AddStudentViewModel addModel;
	@Autowired
	private StudentService studentService;
@Override
public String execute()
{
	if(addModel.isPostBack())
	{
		studentService.addStudent(addModel.getName(), addModel.getRollNo());
		System.out.println("Added successfully");
	}
	return "success";
}
@Override
public AddStudentViewModel getModel() {
	addModel=new AddStudentViewModel();
	return addModel;
}
}
