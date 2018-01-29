package com.techlabs.music;

public class TestException1 {
	public static void main(String[] args) {
		
	String test="yes";
	try{
		System.out.println("Start TRY");
		ScaryException.doRisky(test);
		System.out.println("End TRY");
	}
	catch(ScaryException se){
		System.out.println("Scary Exception");
	}
	finally{
		System.out.println("Finalllyyyyyyyyyyyyyyy");
	}
	System.out.println("End of MAIN");
}


}
