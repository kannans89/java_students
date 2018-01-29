package com.techlabs.contactbook;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DeleteContact {

	public void delete(String str) {
		
		File inputFile = new File("Contact.csv");
		File tempFile = new File("temp.csv");
		String currentLine;

	BufferedWriter writer = null ;
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(inputFile));
		try {
			writer = new BufferedWriter(new FileWriter(tempFile));
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			while ((currentLine = reader.readLine()) != null) {
					if (!currentLine.contains(str)) {
					writer.write(currentLine + System.getProperty("line.separator"));
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		finally{
			inputFile.deleteOnExit();
		//inputFile.renameTo(new File("Contact.csv"));
			try {
				reader.close();
				writer.close();
				if(tempFile.renameTo(inputFile))
					System.out.println("Renaming successfully done");
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		
	}}
}
