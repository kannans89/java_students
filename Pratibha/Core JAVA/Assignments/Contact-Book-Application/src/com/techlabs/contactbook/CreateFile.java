package com.techlabs.contactbook;

import java.io.FileWriter;
import java.io.IOException;

public class CreateFile{
	private static CreateFile createFile=new CreateFile();
	
	private CreateFile(){
	}
	public void doOperation() {
		final String NEW_LINE_SEPARATOR = "\n";

		// CSV file header

		final String FILE_HEADER = "ID,FirstName,LastName,Adress,ContactNumber";

		// public static void writeCsvFile(String fileName) {

		// Create new students objects

	
		FileWriter fileWriter = null;

		try {

			fileWriter = new FileWriter("Contact.csv");

			// Write the CSV file header

			fileWriter.append(FILE_HEADER.toString());

			// Add a new line separator after the header

			fileWriter.append(NEW_LINE_SEPARATOR);

			// Write a new student object list to the CSV file
			
				System.out.println("CSV file was created successfully !!!");

			} catch (Exception e) {

				System.out.println("Error in CsvFileWriter !!!");

				e.printStackTrace();

			}
		 finally {

			try {
				fileWriter.flush();
				fileWriter.close();

			} catch (IOException e) {

				System.out
						.println("Error while flushing/closing fileWriter !!!");

				e.printStackTrace();
			}
		}


	}
	public static CreateFile getCreateFile(){
		return createFile;
	}
	

}
