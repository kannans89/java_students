package com.techlabs.bug;

public class TestBug {

	public static void main(String[] args) {
		
		//ArrayIndexOutOfBoundsException
		//ArithmeticException	
		//NumberFormatException
		//java.util.IllegalFormatConversionException
		
		int numberOne = Integer.parseInt(args[0]);
		
		int numberTwo = Integer.parseInt(args[1]);
		
		int result = numberOne/numberTwo;
		
		System.out.printf("%s / %s = %d%n",numberOne,numberTwo,result);
		main(args);
	
	}

}
