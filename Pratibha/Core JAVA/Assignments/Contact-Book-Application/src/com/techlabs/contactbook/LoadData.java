package com.techlabs.contactbook;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LoadData {
	private String FirstName;
	private int id;
	private String LastName;
	private String Address;
	private Number Contact;
	private int oldId;
	private static List<Book> booklist = new ArrayList<Book>();

	private static LoadData loadData=new LoadData();
	private  LoadData() {
		String fileName = "Contact.csv";
		try {
			FileReader fileReader = new FileReader("Contact.csv");
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			@SuppressWarnings("resource")
			Scanner bufferedScanner = new Scanner(
					new BufferedReader(fileReader));
			bufferedScanner.nextLine();
			while (bufferedScanner.hasNextLine()) {
				String currentLine = ((Scanner) bufferedScanner).nextLine();
				// System.out.println(currentLine);
				@SuppressWarnings("resource")
				Scanner lineScanner = new Scanner(currentLine);
				// System.out.println(lineScanner.next());
				lineScanner.useDelimiter(",");
				// System.out.println(lineScanner.next());
				id = (int) Integer.parseInt(lineScanner.next());
				// System.out.println(lineScanner.next());

				FirstName = lineScanner.next();
				// System.out.println(lineScanner.next());

				LastName = lineScanner.next();
				// System.out.println(lineScanner.next());

				Address = lineScanner.next();
				Contact = (Number) Integer.parseInt((lineScanner.next()));
				// System.out.println(id);
				booklist.add(new Book(id, FirstName, LastName, Address, Contact));
				setBooklist(booklist);
			}
			this.oldId=id;
			bufferedReader.close();
			//System.out.println(oldId);
		}

		catch (FileNotFoundException ex) {
			System.out.println("Unable to open file '" + fileName + "'");
		} catch (IOException ex) {
			System.out.println("Error reading file '" + fileName + "'");
		} catch (Exception e) {
			System.out.println();
		}

		
	}

	
	private  void setBooklist(List<Book> booklist2) {
		LoadData.booklist=booklist2;
		
	}


	public static  List<Book> getOldBooks() {
		return LoadData.booklist;
	}
	public int getOldId(){

		return oldId;
	}
	public static LoadData getLoadData(){
		return loadData;
	}
}
