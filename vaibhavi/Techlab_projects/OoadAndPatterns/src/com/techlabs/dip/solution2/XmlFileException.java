package com.techlabs.dip.solution2;

public class XmlFileException implements IErrorHandler{
	public String getMessage() {
		return "Writing to XML file";
	}
	public void handleError()
	{
		System.out.println("writing to xml...");
	}

}
