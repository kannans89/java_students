package com.techlabs.day1;

public class TestArgsWithInt {

	public static void main(String[] args) {
		
		System.out.println("Before calling changeArray(): ");
		int[] intArray={10,20,30,40,50};
		displayIntArray(intArray);
		changeArrayValue(intArray);
		System.out.println("After calling changeArray(): ");
		displayIntArray(intArray);
		}
	
	private static void changeArrayValue(int[] intArray) {
		for(int index=0; index<intArray.length;index++)
			intArray[index]=0;
		System.out.println("inside changeArray(): ");
		displayIntArray(intArray);
		
	}
	
	public static void displayIntArray(int[] intArray){
		for(int arg:intArray){
			System.out.println(arg);
		}
	}


}
