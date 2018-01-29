package com.techlabs.fileHandlers;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.techlabs.contact.Contact;

public class BinaryFileWriter {

	private String filePath = "src//data//Contact.ser";
	private List<Contact> obj = new LinkedList<Contact>();

	public void serialize(List<Contact> contactList) {
		for (Contact contact : contactList) {
			obj.add(contact);
		}
		try {
			FileOutputStream fileOut = new FileOutputStream(filePath);
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(obj);
			out.close();
			fileOut.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
