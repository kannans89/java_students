package com.techlabs.swabhav;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class SwabhavFileReader implements SwbhavIO{

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
		}System.out.println("\n----------------------\n");
		
	}

}
