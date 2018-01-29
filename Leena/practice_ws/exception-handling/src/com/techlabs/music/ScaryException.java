package com.techlabs.music;

public class ScaryException extends Exception {
	static void doRisky(String test) throws ScaryException{
		System.out.println("Start Risky");
		if("yes".equals(test)){
			throw new ScaryException();
		}
		System.out.println("End Risky");
		return;
	}

}
