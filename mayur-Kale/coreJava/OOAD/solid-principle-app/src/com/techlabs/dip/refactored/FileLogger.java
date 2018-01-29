package com.techlabs.dip.refactored;

public class FileLogger implements ILogger {
	@Override
	public void log(String message) {
		System.out.println("Exception was caught and save into a File:" + message);
	}

}
