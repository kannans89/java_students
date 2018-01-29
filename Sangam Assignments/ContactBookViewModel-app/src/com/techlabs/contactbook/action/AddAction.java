package com.techlabs.contactbook.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlabs.contactbook.service.ContactBookService;
import com.techlabs.contactbook.viewmodel.AddContactBookViewModel;

@SuppressWarnings("serial")
public class AddAction extends ActionSupport implements ModelDriven<AddContactBookViewModel>{
	private AddContactBookViewModel model;
	@Override
	public String execute() throws Exception
	{
		if(model.isPostBack())
		{
			new ContactBookService().addContact(model.getPerson());
			return "success";
		}
		else
		{
			return "firstTime";
		}
		
	}
	@Override
	public AddContactBookViewModel getModel() {
		model=new AddContactBookViewModel();
		return model;
	}
}
