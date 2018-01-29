package com.techlabs.action;


import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlabs.service.StudentService;

@SuppressWarnings("serial")
public class DisplayAction extends ActionSupport implements ModelDriven<DisplayVeiwModel> {
	@Autowired
	private StudentService service;
	private DisplayVeiwModel model;

	public DisplayAction() {
		service = new StudentService();
		System.out.println("Action");
	}

	public String execute() {
		model.setList(service.getList());
	
		return "success";
	}

	@Override
	public DisplayVeiwModel getModel() {
		model = new DisplayVeiwModel();
		return model;
	}
}
