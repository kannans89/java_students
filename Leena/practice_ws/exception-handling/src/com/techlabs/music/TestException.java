package com.techlabs.music;

public class TestException {

	public static void main(String[] args) {
		
		String test="no";
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
