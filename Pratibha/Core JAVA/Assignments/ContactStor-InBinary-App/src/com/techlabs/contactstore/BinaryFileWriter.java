package com.techlabs.contactstore;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.LinkedList;
import java.util.List;

public class BinaryFileWriter {

	private String filePath = "src\\data\\Contact.ser";
	private List<Contact> obj;

	public BinaryFileWriter(List<Contact> contacts) {
		this.obj=contacts;
	}

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
