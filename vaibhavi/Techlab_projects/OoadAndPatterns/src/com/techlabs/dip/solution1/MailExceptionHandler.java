package com.techlabs.dip.solution1;

public class MailExceptionHandler extends Exception{
	private static final long serialVersionUID = 1L;
	String error;

	public MailExceptionHandler(String error) {
		this.error = error;
	}

	public String getMessage() {
		return "Mailing";
	
	}
	
	public void handleError()
	{
		System.out.println("Mailing...");
	}

}
