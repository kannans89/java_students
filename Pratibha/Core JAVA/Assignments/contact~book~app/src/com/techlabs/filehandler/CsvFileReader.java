package com.techlabs.filehandler;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


import com.techlabs.addcontact.AddContact;
import com.techlabs.contact.Contact;

public class CsvFileReader {
	private static final String COMMA_DELIMITER = ",";
	
	//Student attributes index
	private static final int CONTACT_ID_IDX = 0;
	private static final int FNAME_IDX = 1;
	private static final int LNAME_IDX = 2;
	private static final int CONTACT_ID = 3; 
	private static final int EMAIL_ID = 4;
	
	public static void readCsvFile(String fileName) {

		BufferedReader fileReader = null;
     
        try {
        	
        	//Create a new list of student to be filled by CSV file data        	
            String line = "";
            
            //Create the file reader
            fileReader = new BufferedReader(new FileReader(fileName));
            
            //Read the CSV file header to skip it
            fileReader.readLine();
            
            //Read the file line by line starting from the second line
            while ((line = fileReader.readLine()) != null) {
                //Get all tokens available in line
                String[] tokens = line.split(COMMA_DELIMITER);
                if (tokens.length > 0) {
                	//Create a new student object and fill his  data
					AddContact con = new AddContact( tokens[FNAME_IDX], tokens[LNAME_IDX], Long.parseLong(tokens[CONTACT_ID]), tokens[EMAIL_ID]);
					Contact contact=new Contact(Long.valueOf(tokens[CONTACT_ID_IDX]),con);
				}
            }
            
           
        } 
        catch (Exception e) {
        	System.out.println("Error in CsvFileReader !!!");
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
            	System.out.println("Error while closing fileReader !!!");
                e.printStackTrace();
            }
        }

	}

}
