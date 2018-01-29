package com.techlabs.dip.solution2;

public class MailExceptionHandler implements IErrorHandler{
	
	public String getMessage() {
		return "Mailing";
	
	}
	
	public void handleError()
	{
		System.out.println("Mailing...");
	}

}
