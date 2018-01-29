package com.techlabs.principles.dip.solution2;

public class XmlErrorLogger implements IErrorLog {

	public void handleError(String msg) {
		System.out.println("failed to the updation with XML.#");
		System.out.println("Updating in the database..");
		System.out.println("Error :" + msg);
	}
}
