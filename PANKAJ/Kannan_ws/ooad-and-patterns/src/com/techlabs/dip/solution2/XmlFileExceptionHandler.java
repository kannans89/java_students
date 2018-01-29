package com.techlabs.dip.solution2;

public class XmlFileExceptionHandler implements IExceptionHandler {

	@Override
	public void handleError(String msg) {
			System.out.println("Writing to xml file");
			System.out.println(msg);
		}
	}

