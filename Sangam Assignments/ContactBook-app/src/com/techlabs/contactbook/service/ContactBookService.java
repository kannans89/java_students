package com.techlabs.contactbook.service;

import java.io.IOException;
import java.util.List;

import com.techlabs.contactbook.model.ContactBookRepository;
import com.techlabs.contactbook.model.Person;

public class ContactBookService {
	private ContactBookRepository repos=new ContactBookRepository();
	public void addContact(Person person) throws IOException
	{
		repos.add(person);
	}
	public List<Person> getDetalis() throws Exception
	{
		return repos.retriveDetails();
	}
}
