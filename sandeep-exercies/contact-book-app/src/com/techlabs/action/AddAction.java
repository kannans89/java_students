package com.techlabs.action;

import java.io.IOException;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlabs.model.ContactBook;
import com.techlabs.model.ContactBookManager;

public class AddAction extends ActionSupport implements ModelDriven<AddViewModel>, Action {
	private AddViewModel model;

	@Override
	public AddViewModel getModel() {
		model = new AddViewModel();
		return model;
	}

	@Override
	public String execute() {
		try {

			ContactBook book = new ContactBook(model.getFirstName(), model.getLastName(), model.getMobile(),
					model.getEmail());
			System.out.println(book.getContactId());
			new ContactBookManager().addContacts(book);

		} catch (IOException e) {
			e.printStackTrace();
		}

		return "success";

	}

}