package com.techlabs.store;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Properties;

import com.techlabs.contact.Contact;
import com.techlabs.fileHandlers.BinaryFileReader;
import com.techlabs.fileHandlers.BinaryFileWriter;

public class BinaryDataStore implements IDataStore{

	private List<Contact> contactList = new LinkedList<Contact>();

	public BinaryDataStore() {
		initialize();
	}

	public void initialize() {
		File file = new File("src//data//Contact.ser");
		if (file.exists()) {
			BinaryFileReader reader = new BinaryFileReader();
			contactList = reader.deserialize();
		}
	}

	@Override
	public void addContacts(Contact contact) {
		contact.setId(createID());
		contactList.add(contact);
		save();
	}

	@Override
	public List<Contact> retrieveContacts() {
		return contactList;
	}

	@Override
	public List<Contact> searchContact(String fName) {
		List<Contact> searchContactList = new LinkedList<Contact>();
		for (Contact contact : contactList) {
			if (contact.getFName().equalsIgnoreCase(fName)) {
				searchContactList.add(contact);
			}
		}
		return searchContactList;
	}
	
	@Override
	public void deleteContact(long id) {
		for (Contact contact : contactList) {
			if (contact.getId() == id) {
				contactList.remove(contact);
			}
		}
		save();
	}

	@Override
	public void updateContact(Contact newContact) {
		for (Contact contact : contactList) {
			if (contact.getId() == newContact.getId()) {
				contact.setFName(newContact.getFName());
				contact.setLName(newContact.getLName());
				contact.setEmailId(newContact.getEmailId());
				contact.setPhoneNo(newContact.getPhoneNo());
			}
		}
		save();
	}

	@Override
	public void save() {
		BinaryFileWriter writer = new BinaryFileWriter();
		writer.serialize(contactList);
	}

	protected static int idCounter;

	static {
		idCounter = getIdCounter();
	}

	public static synchronized int createID() {
		setCounter(++idCounter);
		return idCounter;
	}

	public static int getIdCounter() {

		Properties properties = new Properties();
		FileReader reader = null;
		int counter = 0;
		try {
			reader = new FileReader("src//data//idInfo.properties");
			properties.load(reader);
			counter = Integer.parseInt(properties.getProperty("Counter"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return counter;
	}

	public static void setCounter(int counter) {

		Properties properties = new Properties();
		FileWriter writer = null;
		try {
			writer = new FileWriter("src//data//idInfo.properties");
			properties.setProperty("Counter", String.valueOf(counter));
			properties.store(writer, null);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
