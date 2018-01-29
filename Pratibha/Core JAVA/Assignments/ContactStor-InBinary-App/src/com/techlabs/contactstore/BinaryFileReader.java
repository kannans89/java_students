package com.techlabs.contactstore;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.LinkedList;
import java.util.List;


public class BinaryFileReader {


	private String filePath = "src\\data\\Contact.ser";
	private List<Contact> objList=new LinkedList<Contact>();

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
