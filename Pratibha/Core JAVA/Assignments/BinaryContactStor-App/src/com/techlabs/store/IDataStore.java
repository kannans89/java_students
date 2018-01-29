package com.techlabs.store;

import java.util.List;

import com.techlabs.contact.Contact;

public interface IDataStore {
	public void addContacts(Contact contact);

	public List<Contact> retrieveContacts();

	public List<Contact> searchContact(String fName);

	public void deleteContact(long id);

	public void updateContact(Contact newContact);

	public void save();

}
