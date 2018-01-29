package com.techlabs.service;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.techlabs.model.Transaction;

/**
 * @author ashraf
 * 
 */
public class CsvFileWriter {
	
	//Delimiter used in CSV file
	private static final String COMMA_DELIMITER = ",";
	private static final String NEW_LINE_SEPARATOR = "\n";
	
	//CSV file header
	private static final String FILE_HEADER = "Transaction ID,Transaction Type,Amount,Date";

	public void writeCsvFile(List<Transaction> tlist) {
		
		//Create a new list of student objects
		List <Transaction> translist = new ArrayList<Transaction>();
		translist=tlist;
		FileWriter fileWriter = null;
				System.out.println(translist.get(1).getAmount());
		try {
			fileWriter = new FileWriter("C:\\Users\\Dell\\Downloads\\log.csv");
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

			//Write the CSV file header
			bufferedWriter.write(FILE_HEADER.toString());
			
			//Add a new line separator after the header
			bufferedWriter.newLine();

			
			//Write a new student object list to the CSV file
			for (Transaction trans : translist) {
				bufferedWriter.write(String.valueOf(trans.getTransid()));
				bufferedWriter.write(COMMA_DELIMITER);
				bufferedWriter.write(trans.getType());
				bufferedWriter.write(COMMA_DELIMITER);
				String amount=""+trans.getAmount();
				bufferedWriter.write(amount);
				bufferedWriter.write(COMMA_DELIMITER);
				String date=""+trans.getDate();
				bufferedWriter.write(date);
				bufferedWriter.write(COMMA_DELIMITER);
				bufferedWriter.newLine();

			}
			bufferedWriter.flush();
			bufferedWriter.close();
			System.out.println("CSV file was created successfully !!!");
			
		} catch (Exception e) {
			System.out.println("Error in CsvFileWriter !!!");
			e.printStackTrace();
		} finally {
			
		}
	}
}