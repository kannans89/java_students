package com.techlabs.contactbook;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class SearchContact {

	public void search(String str) {
		FileReader fileReader2;
		try {
			fileReader2 = new FileReader("Contact.csv");
		BufferedReader bufferedReader2 = new BufferedReader(fileReader2);
		String line;
		try {
			while ((line = bufferedReader2.readLine()) != null) {
				if (line.contains(str)) {
					System.out.println(line);
				
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
