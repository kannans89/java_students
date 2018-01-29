package com.input;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SwabhavFileReader implements Reader {

	private String file;

	public SwabhavFileReader(String file) {
		this.file = file;
	}
	
	

	public void read() throws IOException {
		@SuppressWarnings("resource")
		FileReader reader = new FileReader(file);
		int i;

		while ((i = reader.read())!= -1) {
			System.out.print((char)i);
		}
		
	}



	

}
