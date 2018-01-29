package com.techlabs.string;

public class TestString {

	public static void main(String[] args) {
		testMutation();
		testEquality();
	}

	private static void testEquality() {
		String firstName = "adesh";
		String secondName = "adesh";
		
		String thirdName = new String("pote");
		String fourthName = new String("pote");
		
		System.out.println("hashcode = "+System.identityHashCode(firstName));
		System.out.println("hashcode = "+System.identityHashCode(secondName));
		
		System.out.println("hashcode = "+System.identityHashCode(thirdName));
		System.out.println("hashcode = "+System.identityHashCode(fourthName));
		
		System.out.println("firstName.equals(secondName) = "+firstName.equals(secondName));
		System.out.println("thirdName.equals(fourthName) = "+thirdName.equals(fourthName));
		
		System.out.println("(firstName == secondName) = "+(firstName == secondName));
		System.out.println("(thirdName == fourthName) = "+(thirdName == fourthName));
		
	}

	private static void testMutation() {
		String name = "sachin";
		System.out.println("1st hashcode = " + System.identityHashCode(name));
		name = name + "ramesh";
		System.out.println("2nd hashcode = " + System.identityHashCode(name));
		name = name + "tendulkar";
		System.out.println("3rd hashcode = " + System.identityHashCode(name));
	}

}
