package com.techlabs.principle.dip.Solution2;

public class EmailErrorLog implements IErrorLog{

	@Override
	public void handleError(String errorMessage) {
		System.out.println("Error Occured...Error being Processed");
		System.out.println("Email Error Code");
		System.out.println(errorMessage);
		
	}

}
