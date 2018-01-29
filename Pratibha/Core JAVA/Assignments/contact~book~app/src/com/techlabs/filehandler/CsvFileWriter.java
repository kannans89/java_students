package com.techlabs.filehandler;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import com.techlabs.contact.Contact;

public class CsvFileWriter {

	private static final String COMMA_DELIMITER = ",";
	private static final String NEW_LINE_SEPARATOR = "\n";
	private static FileWriter fileWriter = null;
	private static final String FILE_HEADER = "id,firstName,lastName,contact,email";

	public static void writeCsvFile(String fileName) {

		try {
			fileWriter = new FileWriter(fileName);

			fileWriter.append(FILE_HEADER.toString());

			fileWriter.append(NEW_LINE_SEPARATOR);

			for (Contact contact : Contact.getContactList()) {
				doWork(contact);
			}
			System.out.println("CSV file was created successfully !!!");

		} catch (Exception e) {
			System.out.println("Error in CsvFileWriter !!!");
			e.printStackTrace();
		} finally {

		}

	}

	public static void doWork(Contact contact) throws Exception {

		fileWriter.append(String.valueOf(contact.getId()));
		fileWriter.append(COMMA_DELIMITER);
		fileWriter.append(contact.getContact().getFname());
		fileWriter.append(COMMA_DELIMITER);
		fileWriter.append(contact.getContact().getLname());
		fileWriter.append(COMMA_DELIMITER);
		fileWriter.append(String.valueOf(contact.getContact().getContact()));
		fileWriter.append(COMMA_DELIMITER);
		fileWriter.append(contact.getContact().getEmail());
		fileWriter.append(NEW_LINE_SEPARATOR);
		fileWriter.flush();

	}

	public static void exit() {
		try {
			fileWriter.flush();
			fileWriter.close();
		} catch (IOException e) {
			System.out.println("Error while flushing/closing fileWriter !!!");
			e.printStackTrace();
		}

	}
}
