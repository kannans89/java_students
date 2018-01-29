package com.techlabs.struct.spring.hibernate.actions;

import org.springframework.beans.factory.annotation.Autowired;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlabs.struct.spring.hibernate.services.StudentService;
import com.techlabs.struct.spring.hibernate.viewmodel.DeleteViewModel;

@SuppressWarnings("serial")
public class DeleteAction extends ActionSupport implements
		ModelDriven<DeleteViewModel> {
	private DeleteViewModel deleteModel;
	@Autowired
	private StudentService deleteService;

	@Override
	public String execute() {
		deleteService.deleteStudent(deleteModel.getDeleteData());
		return "success";
	}

	@Override
	public DeleteViewModel getModel() {
		deleteModel = new DeleteViewModel();
		return deleteModel;
	}
}