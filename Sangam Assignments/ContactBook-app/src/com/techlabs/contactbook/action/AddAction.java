package com.techlabs.contactbook.action;
import java.io.IOException;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.techlabs.contactbook.model.Person;
import com.techlabs.contactbook.service.ContactBookService;

@SuppressWarnings("serial")
public class AddAction extends ActionSupport{
	private boolean postBack=false;
	private Person person;
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public boolean isPostBack() {
		return postBack;
	}
	public void setPostBack(boolean postBack) {
		this.postBack = postBack;
	}
	@Override
	public String execute() throws IOException
	{
		if(postBack)
		{
			new ContactBookService().addContact(person);
			return "success";
		}
		else
		{
			return "firstTime";
		}	
	}
}
