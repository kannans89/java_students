package com.techlabs.dip.solution1;

public class XmlFileException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String error;

	public XmlFileException(String error) {
		this.error = error;
	}

	public String getMessage() {
		return "Writing to XML file";
	}
	public void handleError()
	{
		System.out.println("writing to xml...");
	}


}
