package com.techlabs.action;

import java.util.ArrayList;
import java.util.List;

import com.techlabs.model.Contact;

public class CustomerVeiwModel {
	Contact cont;
	List<Contact> list ;

	public CustomerVeiwModel() {
		cont = new Contact();
		list= new ArrayList<Contact>();
	}

	public Contact getCont() {
		return cont;
	}

	public void setCont(Contact cont) {
		this.cont = cont;
	}

	public List<Contact> getList() {
		return list;
	}

	public void setList(List<Contact> list) {
		this.list = list;
	}

}
