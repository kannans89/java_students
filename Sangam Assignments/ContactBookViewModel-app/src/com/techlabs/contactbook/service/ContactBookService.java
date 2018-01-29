package com.techlabs.contactbook.service;

import java.util.List;

import com.techlabs.contactbook.model.ContactBookRepository;
import com.techlabs.contactbook.model.Person;

public class ContactBookService {
	private ContactBookRepository repos=new ContactBookRepository();
	public void addContact(Person person) throws Exception
	{
		repos.add(person);
	}
	public List<Person> getDetalis() throws Exception
	{
		return repos.retriveDetails();
	}
}
