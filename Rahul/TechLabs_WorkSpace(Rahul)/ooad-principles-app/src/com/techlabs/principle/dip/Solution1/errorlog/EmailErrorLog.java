package com.techlabs.principle.dip.Solution1.errorlog;

public class EmailErrorLog {
	public void handleError(String errorMessage){
		System.out.println("Error Occured...Error being Processed");
		System.out.println("Email Error Code");
		System.out.println(errorMessage);
		
	}
}
