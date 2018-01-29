package com.techlabs;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import com.techlabs.model.Contact;

public class CSVFileWriter {
	public CSVFileWriter(List<Contact> contacts) {
	}

	public void fileWriter(List<Contact> contacts) {

		try {

			FileWriter fileWriter = new FileWriter("Contact.csv");
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			bufferedWriter.write("ID"+","+"First Name"+","+"Last Name"+
			"Address"+"Mobile Number");
			
			for (Contact c : contacts) {
				bufferedWriter.newLine();
				bufferedWriter.write(String.valueOf(c.getId()));
				bufferedWriter.write(",");
				bufferedWriter.write(c.getFirstName());
				bufferedWriter.write(",");
				bufferedWriter.write(c.getLastName());
				bufferedWriter.write(",");
				bufferedWriter.write(c.getAddress());
				bufferedWriter.write(",");
				bufferedWriter.write(String.valueOf(c.getMobile()));
			}

System.out.println("firle is written");
			bufferedWriter.close();

		} catch (IOException e2) {

			System.out.println("Error while flushing/"
					+ "closing fileWriter !!!");
			e2.printStackTrace();
		}
	}
}
