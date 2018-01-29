package com.techlabs.swbhavio;

import com.input.DecryptDecorator;
import com.input.SwabhavFileReader;
import com.input.SwabhavInputDecorator;
import com.input.UncompressDecorator;
import com.output.CompressDecorator;
import com.output.EncryptDecorator;
import com.output.SwabhavFileWriter;
import com.output.SwabhavOutputDecorator;

public class Test {
	public static void main(String[] args) throws Exception {
		SwabhavOutputDecorator writer1=new EncryptDecorator(new SwabhavFileWriter("encrptFile.txt"));
		writer1.write("My Name is Sandeep");
		
		SwabhavInputDecorator reader1=new DecryptDecorator(new SwabhavFileReader("encrptFile.txt"));
		reader1.read();
		
		
		SwabhavOutputDecorator writer2=new CompressDecorator(new SwabhavFileWriter("in.txt"));
		writer2.write("My Name is Sandeep");
		
		SwabhavInputDecorator reader2=new UncompressDecorator(new SwabhavFileReader("in.txt"));
		reader2.read();
		
	}
}
