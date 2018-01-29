package com.techlabs.action;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlabs.service.StudentService;

@SuppressWarnings("serial")
public class EditAction extends ActionSupport implements ModelDriven<EditVeiwModel> {
	@Autowired
	private StudentService service;
	private EditVeiwModel model;

	public EditAction() {
		
		System.out.println("Edit Action");
	}
@Override
	public String execute() {
		if(model.getEditId()!=0){
			model.setStud(service.getStud(model.getEditId()));
			return "get";
		}
		else{
			System.out.println(model.getId());
			//System.out.println(model.getStud().getId());
		((StudentService) service).editStud(model.getStud());
		return "success";
		}
	}

	@Override
	public EditVeiwModel getModel() {
		model = new EditVeiwModel();
		return model;
	}
}
