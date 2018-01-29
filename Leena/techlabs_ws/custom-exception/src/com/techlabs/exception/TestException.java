package com.techlabs.exception;

public class TestException {

	public static void main(String[] args) {
		try{
		int firstNumber=Integer.parseInt(args[0]);
		int secondNumber=Integer.parseInt(args[1]);
		int answer=(firstNumber/secondNumber);
		System.out.println("Answer is :"+answer);
		}catch(Exception ex){
			System.out.println(ex.getMessage()/*+ "  error...please enter valid values."*/);
		}
		
		//main() calling the recursive function
		//main(args);
	}

}
