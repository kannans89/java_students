package com.techlabs.principles.dip.solution2;

public class EmailErrorLogger implements IErrorLog {

	public void handleError(String msg) {
		System.out.println("email is handling by admin");
		System.out.println("admin = abc12");
		System.out.println("Error :" + msg);
	}
}
