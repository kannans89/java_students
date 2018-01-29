package com.techlabs.bankapp.services;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class DownloadPassbookService {

	public void downloadPassbook(List<PassbookDto> passBook,String name)throws IOException{
		String bookName=name+"Passbook.csv";
		FileWriter writer = new FileWriter("C:\\Users\\hp\\Downloads\\"+bookName);
	        
	        writer.append("Transaction Id");
	        writer.append(',');
	        writer.append("mount");
	        writer.append(',');
	        writer.append("Transaction Type");
	        writer.append(',');
	        writer.append("Date");
	        writer.append('\n');
	        for(PassbookDto pass:passBook){
	        	writer.append(pass.getTransId());
	        	writer.append(',');
		        writer.append(Double.toString(pass.getAmount()));
		        writer.append(',');
		        writer.append(pass.getTransactionType());
		        writer.append(',');
		        writer.append(pass.getTransactionDate());
		        writer.append('\n');
	        }
	        writer.close();
	 	}
}
