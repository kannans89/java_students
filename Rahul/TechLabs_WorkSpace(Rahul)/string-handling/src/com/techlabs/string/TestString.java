package com.techlabs.string;

public class TestString {
	public static void main(String[] args) {
		// testEquality();
		//testStringMutation();

	}

	public static void testEquality() {
		String firstName = "leena";
		String secondName = "leena";
		System.out.println("hash code of 1st name :"
				+ System.identityHashCode(firstName));
		System.out.println("hash code of 2nd name :"
				+ System.identityHashCode(secondName));

		String thirdName = new String("rahul");
		String fourthName = new String("rahul");
		System.out.println("hash code of 3rd name :"
				+ System.identityHashCode(thirdName));
		System.out.println("hash code of 4th name :"
				+ System.identityHashCode(fourthName));

		System.out.println("firstName == lastName :"
				+ (firstName == secondName));
		System.out.println("firstName.equals(secondName) :"
				+ firstName.equals(secondName));

		System.out.println("thirdName == fourthName :"
				+ (thirdName == fourthName));
		System.out.println("thirdName.equals(fourthName) :"
				+ thirdName.equals(fourthName));

	}

	public static void testStringMutation() {
		String name = "sachin";

		System.out.println("name :" + System.identityHashCode(name));
		name = name + " ramesh";
		System.out.println("name :" + System.identityHashCode(name));
		name = name + " tendulkar";
		String name1 = "sachin";
		System.out.println("name :" + System.identityHashCode(name));
		System.out.println("name1:" + System.identityHashCode(name1));

	}

}
