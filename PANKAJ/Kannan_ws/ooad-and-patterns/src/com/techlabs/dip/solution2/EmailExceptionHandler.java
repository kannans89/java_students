package com.techlabs.dip.solution2;

public class EmailExceptionHandler implements IExceptionHandler {

	@Override
	public void handleError(String msg) {
		System.out.println("Email printing in progress");
		System.out.println(msg);

	}

}
