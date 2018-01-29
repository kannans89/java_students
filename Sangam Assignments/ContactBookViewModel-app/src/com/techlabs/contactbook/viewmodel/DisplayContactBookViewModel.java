
package com.techlabs.contactbook.viewmodel;

import java.util.List;

import com.techlabs.contactbook.model.Person;

public class DisplayContactBookViewModel {
	private List<Person> personList;
	public List<Person> getPersonList() {
		return personList;
	}
	public void setPersonList(List<Person> personList) {
		this.personList = personList;
	}
}
