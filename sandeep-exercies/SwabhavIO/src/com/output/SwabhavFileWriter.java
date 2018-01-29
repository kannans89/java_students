package com.output;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SwabhavFileWriter implements Writer{

	private String file;

	public SwabhavFileWriter(String file) {
		this.file = file;
	}
	
	
	public void write(String s) throws IOException {
		FileWriter writer=new FileWriter(file);
		writer.write(s);
		writer.flush();
		writer.close();
	}


}
