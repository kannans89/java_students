package com.techlabs.controllers;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Logger {
	private File file;
	private OutputStream outputStream;

	public Logger() {
		file = new File("logs");
		try {
			outputStream = new FileOutputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void log(String data) {
		byte[] dataInByte = data.getBytes();
		try {
			outputStream.write(dataInByte);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
