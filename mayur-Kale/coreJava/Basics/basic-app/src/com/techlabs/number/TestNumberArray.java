package com.techlabs.number;

public class TestNumberArray {
	
	public static void  main(String [] arStrings) {
		
		testNumberArrayyMutation();
	}

	private static void testNumberArrayyMutation() {
		
		int [] salarylist = {1000,
							 2000,
							 3000
							};
		
		mutateNumberArray(salarylist);
		
		for (int sal : salarylist) {
			System.out.println(sal);
		}
		
	
	}

	private static void mutateNumberArray(int[] salarylist) {

		for (int index = 0; index < salarylist.length; index++) {
			salarylist[index]=0;
		}
		
	}
	
	}


