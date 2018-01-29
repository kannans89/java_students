package com.techlabs.fileHandlers;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.techlabs.contact.Contact;

public class BinaryFileReader {

	private String filePath = "src//data//Contact.ser";
	private List<Contact> objList;

	@SuppressWarnings({ "unchecked", "resource" })
	public List<Contact> deserialize() {
		try {
			ObjectInputStream in = new ObjectInputStream(new FileInputStream(
					filePath));
			objList = (LinkedList<Contact>) in.readObject();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return objList;
	}
}
