package com.techlabs;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import com.techlabs.model.Contact;

public class BinaryFileReader {
	List<Contact> contacts;
	private String fname;
	private String lname;
	private String address;
	private String mobile;
	private int id;
	private int oldId;
	String fileName = "Contact.csv";

	public BinaryFileReader(List<Contact> contacts) {
		this.contacts=contacts;
	}
	public List<Contact> readFile() {
		try {
			FileReader fileReader = new FileReader("Contact.csv");
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			@SuppressWarnings("resource")
			Scanner bufferedScanner = new Scanner(
					new BufferedReader(fileReader));
			bufferedScanner.nextLine();
			while (bufferedScanner.hasNextLine()) {
				String currentLine = ((Scanner) bufferedScanner).nextLine();
				@SuppressWarnings("resource")
				Scanner lineScanner = new Scanner(currentLine);
				lineScanner.useDelimiter(",");
				id = (int) Integer.parseInt(lineScanner.next());
				fname = lineScanner.next();
				lname = lineScanner.next();
				address = (String) lineScanner.next();
				mobile = (String)(lineScanner.next());
				this.contacts.add(new Contact( fname, lname, address, mobile,id));
			}

			this.oldId = id;
			bufferedReader.close();
			// System.out.println(oldId);
		}

		catch (FileNotFoundException ex) {
			System.out.println("Unable to open file '" + fileName + "'");
		} catch (IOException ex) {
			System.out.println("Error reading file '" + fileName + "'");
		} catch (Exception e) {
			System.out.println();
		}
		return this.contacts;

	}
	public int getOldId(){
		return this.oldId;
	}

}
