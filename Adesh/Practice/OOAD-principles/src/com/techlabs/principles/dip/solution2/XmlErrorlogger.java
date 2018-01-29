package com.techlabs.principles.dip.solution2;

public class XmlErrorlogger implements IErrorLog{

	public void errorHandler(String msg) {
		System.out.println("Error is handling via XML#");
		System.out.println("admin updating in the database");
		System.out.println(msg);
	}

	
}
