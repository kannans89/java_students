package com.techlabs.string;

public class TestStringCompare {

	public static void main(String[] args) {

		String firstName="Vaibhavi";
		String secondName="Vaibhavi";
		String thirdName=new String("Pankaj");
		String fourthName=new String("Pankaj");
		System.out.println(System.identityHashCode(firstName));
		System.out.println(System.identityHashCode(secondName));
		System.out.println(System.identityHashCode(thirdName));
		System.out.println(System.identityHashCode(fourthName));
		
		
		if(firstName==secondName)
		{
			System.out.println("firstName==secondName returns true");
		}
		if(firstName.equals(secondName))
		{
			System.out.println("firstName.equals(secondName) returns true");
		}
		if(thirdName==fourthName)
		{
			System.out.println("thirdName==fourthName returns false");
		}
		if(thirdName.equals(fourthName))
		{
			System.out.println("thirdName.equals(fourthName) returns true");
		}
		
	}

}
