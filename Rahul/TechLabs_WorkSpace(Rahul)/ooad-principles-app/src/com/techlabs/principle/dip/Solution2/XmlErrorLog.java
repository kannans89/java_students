package com.techlabs.principle.dip.Solution2;

public class XmlErrorLog implements IErrorLog {

	@Override
	public void handleError(String errorMessage) {
		System.out.println("Error Recorded...Processing Error");
		System.out.println("XML error hande code");
		System.out.println(errorMessage);
		
	}

}
