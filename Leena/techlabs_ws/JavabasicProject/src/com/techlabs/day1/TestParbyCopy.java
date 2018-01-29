package com.techlabs.day1;

public class TestParbyCopy {

	public static void main(String[] args) {
		
		System.out.println("Before calling changeArray(): ");
		displayArray(args);
		changeArrayValue(args);
		System.out.println("After calling changeArray(): ");
		displayArray(args);
			
		
	}

	private static void changeArrayValue(String[] arg) {
		for(int index=0; index<arg.length;index++)
			arg[index]="java";
		System.out.println("inside changeArray(): ");
		displayArray(arg);
		
	}

	public static void displayArray(String[] args){
		for(String arg:args)
			System.out.println(arg);
		
	}
	
}
