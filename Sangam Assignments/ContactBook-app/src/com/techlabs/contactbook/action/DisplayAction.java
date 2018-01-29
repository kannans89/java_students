package com.techlabs.contactbook.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.techlabs.contactbook.model.Person;
import com.techlabs.contactbook.service.ContactBookService;

@SuppressWarnings("serial")
public class DisplayAction extends ActionSupport{
	private boolean postback=false;
	private List<Person> personList;
	public List<Person> getPersonList() {
		return personList;
	}
	public void setPersonList(List<Person> personList) {
		this.personList = personList;
	}
	public boolean isPostback() {
		return postback;
	}
	public void setPostback(boolean postback) {
		this.postback = postback;
	}
	@Override
	public String execute() throws Exception
	{
			personList=new ContactBookService().getDetalis();
			return "success";
	}
}
