package com.techlabs.contactbook.action;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlabs.contactbook.service.ContactBookService;
import com.techlabs.contactbook.viewmodel.DisplayContactBookViewModel;

@SuppressWarnings("serial")
public class DisplayAction extends ActionSupport implements ModelDriven<DisplayContactBookViewModel>{
	private DisplayContactBookViewModel model;
	@Override
	public String execute() throws Exception
	{
			model.setPersonList(new ContactBookService().getDetalis());
			return "success";
	}
	@Override
	public DisplayContactBookViewModel getModel() {
		model=new DisplayContactBookViewModel();
		return model;
	}
}