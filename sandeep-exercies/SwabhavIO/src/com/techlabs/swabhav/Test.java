package com.techlabs.swabhav;

import java.io.IOException;

public class Test {
	public static void main(String[] args) throws IOException {
		SwbhavIO reader = new SwabhavFileReader("input.txt");
		reader.read();
		
		ReaderDecorator reader1=new DecryptDecorator(new SwabhavFileReader("input.txt"));
		reader1.read();
		
		ReaderDecorator reader2=new UncompressDecorator(new SwabhavFileReader("input.txt"));
		reader2.read();
		
		ReaderDecorator reader3=new CacheDecorator(new SwabhavFileReader("input.txt"));
		reader3.read();
	}
}
