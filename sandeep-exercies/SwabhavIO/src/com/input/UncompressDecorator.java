package com.input;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.zip.InflaterInputStream;

public class UncompressDecorator extends SwabhavInputDecorator {

	public UncompressDecorator(Reader io) {
		super(io);
	}

	@Override
	public void read() throws Exception {
		uncompress();
		// io.read();
	}

	public void uncompress() throws Exception {

		// System.out.println("Enter the File name:");
		// Scanner sc = new Scanner(System.in);
		// String path = sc.nextLine();

		FileInputStream fin = new FileInputStream("un.txt");
		InflaterInputStream in = new InflaterInputStream(fin);
		// FileOutputStream fout = new FileOutputStream(path);

		int i;
		while ((i = in.read()) != -1) {
			// fout.write((byte) i);
			System.out.print((char) i);
			// fout.flush();
		}
		fin.close();
		// fout.close();
		in.close();
		System.out.println("\ndocument uncompress.....!!!!!");
	}
}
