package com.output;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;
import java.util.zip.DeflaterOutputStream;

public class CompressDecorator extends SwabhavOutputDecorator {

	public CompressDecorator(Writer io) {
		super(io);
	}

	@Override
	public void write(String s) throws Exception {
		io.write(s);
		compress();

	}

	public void compress() throws Exception {

		System.out.println("Enter the File name:");
		Scanner sc = new Scanner(System.in);
		String path = sc.nextLine();
		FileInputStream fin = new FileInputStream((path));
		FileOutputStream fout = new FileOutputStream("un.txt");
		DeflaterOutputStream out = new DeflaterOutputStream(fout);
		
		int i;
		while ((i = fin.read()) != -1) {
			out.write((byte) i);
			out.flush();
		}
		fin.close();
		out.close();
		System.out.println("document compress.....!!!!!");
		
	}
}
