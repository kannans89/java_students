package com.techlabs.action;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlabs.service.StudentService;

@SuppressWarnings("serial")
public class AddAction extends ActionSupport implements ModelDriven<AddVeiwModel> {
	@Autowired
	private StudentService service;
	private AddVeiwModel model;

	public AddAction() {
		service = new StudentService();
		System.out.println("Action");
	}

	public String execute() {
		
		service.addStud(model.getStud());
		return "success";
	}

	@Override
	public AddVeiwModel getModel() {
		model = new AddVeiwModel();
		return model;
	}
}
