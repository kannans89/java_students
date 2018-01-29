package com.techlabs.model;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ContactBookManager {
	private static List<ContactBook> contacts;

	static {
		System.out.println("static block");
		ObjectInputStream in;
		try {
			in = new ObjectInputStream(new FileInputStream("Dadata.ser"));
			@SuppressWarnings("unchecked")
			ArrayList<ContactBook> cont = (ArrayList<ContactBook>) in.readObject();
			contacts = cont;
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public ContactBookManager() {

	}

	public void addContacts(ContactBook contactBook) throws IOException {
		ObjectOutputStream out;
		FileOutputStream fout;

		contacts.add(contactBook);
		fout = new FileOutputStream("Dadata.ser");
		out = new ObjectOutputStream(fout);
		out.writeObject(contacts);
		out.close();
	}

	@SuppressWarnings("unchecked")
	public ArrayList<ContactBook> getContacts() throws Exception {
		ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("Dadata.ser"));
		ArrayList<ContactBook> contacts = (ArrayList<ContactBook>) inputStream.readObject();
		inputStream.close();
		return contacts;

	}

	public ContactBook searchById(String id) {
		for (ContactBook item : contacts) {
			if (item.getContactId().equals(id)) {
				return item;
			}
		}
		return null;
	}

	public ContactBook searchByName(String first, String last) {
		for (ContactBook item : contacts) {
			if (item.getFirstName().equals(first) && item.getLastName().equals(last)) {
				return item;
			}
		}
		return null;
	}

	// C:\\Users\\sandeep\\Desktop\\TechLabs\\struts\\contact-book-app\\DataDump\\Dadata.ser

}