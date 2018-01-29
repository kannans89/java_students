package com.techlabs.struct.spring.hibernate.actions;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlabs.struct.spring.hibernate.services.StudentService;
import com.techlabs.struct.spring.hibernate.viewmodel.EditStudentViewModel;

@SuppressWarnings("serial")
public class EditAction extends ActionSupport implements
		ModelDriven<EditStudentViewModel> {
	private EditStudentViewModel editModel;
	@Autowired
	private StudentService editService;

	@Override
	public String execute() {
		if (editModel.isPostBack()) {
			editService.updateStudentTable(editModel.getStudent());
			return "success";
		} else {
			editModel
					.setStudent(editService.getStudent(editModel.getEditData()));
			return "get";
		}
	}

	@Override
	public EditStudentViewModel getModel() {
		editModel = new EditStudentViewModel();
		return editModel;
	}
}
