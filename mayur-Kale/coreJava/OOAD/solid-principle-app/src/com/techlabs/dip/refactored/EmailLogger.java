package com.techlabs.dip.refactored;

public class EmailLogger implements ILogger {
	@Override
	public void log(String message) {
		System.out.println("Exception was caught and forwaded to your email:" + message);
	}

}
