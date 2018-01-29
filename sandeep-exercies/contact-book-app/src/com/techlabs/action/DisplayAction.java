package com.techlabs.action;

import java.util.ArrayList;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlabs.model.ContactBook;
import com.techlabs.model.ContactBookManager;

public class DisplayAction extends ActionSupport implements ModelDriven<DisplayViewModel>,Action {

	private DisplayViewModel viewModel;

	public DisplayAction() {
		System.out.println("in showaction");
	}

	@Override
	public String execute() {
		try {
			ArrayList<ContactBook> book = new ContactBookManager().getContacts();
			System.out.println(book.size());
			viewModel.setBooks(book);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "success";
	}

	@Override
	public DisplayViewModel getModel() {
		viewModel=new DisplayViewModel();
		return viewModel;
	}
	
	
	

}
