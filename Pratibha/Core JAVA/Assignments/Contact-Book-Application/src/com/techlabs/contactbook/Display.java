package com.techlabs.contactbook;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Display {
	private static Display diplay=new Display();

	public void doOperation() {
		String fileName = "Contact.csv";
		try {
			FileReader fileReader = new FileReader("Contact.csv");
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			String line;
			while ((line = bufferedReader.readLine()) != null) {
				System.out.print(line);
				System.out.println();
			}

			bufferedReader.close();
		}

		catch (FileNotFoundException ex) {
			System.out.println("Unable to open file '" + fileName + "'");
		} catch (IOException ex) {
			System.out.println("Error reading file '" + fileName + "'");
		}
	}
	public static Display getDisplay(){
		return diplay;
	}

}
