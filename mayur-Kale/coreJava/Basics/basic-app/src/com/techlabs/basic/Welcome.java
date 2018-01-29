package com.techlabs.basic;

public class Welcome {
	
	public static void main(String [] arguments){
		
		System.out.println("Welcome to Java");
		printFooter();

		System.out.println("Printed using Traditonal for loop");
		for(int index=0;index<arguments.length;index++){
			System.out.println(arguments[index]);
		}
		
		printFooter();
		
		System.out.println("Printed usig foreach loop");
		for(String arg : arguments){
			System.out.println(arg);
		}
		
		printFooter();

	}
	
	public static void printFooter() {
		System.out.println("============================");
		
	}

}
