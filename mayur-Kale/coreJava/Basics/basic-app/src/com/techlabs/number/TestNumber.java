package com.techlabs.number;

public class TestNumber {
	
	public static void main(String [] arStrings) {
		
		testNumberMutation();
		
	}

	private static void testNumberMutation() {

		int salary =1000;
		mutateNumber(salary);
		System.out.println("Salary after mututaion is "+ salary);
	}

	private static void mutateNumber(int salary) {
		
		salary = 0;
	
	}

}
