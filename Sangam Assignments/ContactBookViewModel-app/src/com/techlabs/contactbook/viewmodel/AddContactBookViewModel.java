package com.techlabs.contactbook.viewmodel;

import com.techlabs.contactbook.model.Person;

public class AddContactBookViewModel {
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
	
}
