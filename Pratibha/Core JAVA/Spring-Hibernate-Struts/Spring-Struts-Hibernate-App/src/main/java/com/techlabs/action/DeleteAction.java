package com.techlabs.action;


import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlabs.service.StudentService;

@SuppressWarnings("serial")
public class DeleteAction extends ActionSupport implements ModelDriven<DeleteVeiwModel> {
	@Autowired
	private StudentService service;
	private DeleteVeiwModel model;

	public DeleteAction() {
		service = new StudentService();
		System.out.println("Delete Action");
	}
@Override
	public String execute() {
		service.deleteStudent(model.getDeleteId());
	
		return "success";
	}

	@Override
	public DeleteVeiwModel getModel() {
		model = new DeleteVeiwModel();
		return model;
	}
}
