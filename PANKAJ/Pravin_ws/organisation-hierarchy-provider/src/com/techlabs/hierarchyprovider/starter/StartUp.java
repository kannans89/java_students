package com.techlabs.hierarchyprovider.starter;

import com.techlabs.hierarchyprovider.io.read.ReadingType;

public class StartUp {

	public static void main(String[] args) {

		ApplicationHandlerService app = new ApplicationHandlerService(ReadingType.FILE);
		app.start();
	}
}
