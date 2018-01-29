package com.techlabs.struct.spring.hibernate.actions;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlabs.struct.spring.hibernate.services.StudentService;
import com.techlabs.struct.spring.hibernate.viewmodel.DisplayViewModel;

public class DisplayAction extends ActionSupport implements ModelDriven<DisplayViewModel>{
	private DisplayViewModel model;
	@Autowired
	private StudentService studentService;
	public DisplayAction() {
		System.out.println("Action class constructor");
	}
	public String execute()
	{
		model.setStudentList(studentService.getStudentList());
		return "success";
	}
	@Override
	public DisplayViewModel getModel() {
		model=new DisplayViewModel();
		return model;
	}

}
