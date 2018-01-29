package com.techlabs.string;

public class TestString {

	public static void main(String[] args) {
		testMutation();
		testEquality();
	}

	private static void testMutation() {
		String name = "sachin";

		System.out.println("hashcode  = " + System.identityHashCode(name) + " "
				+ name);

		name = name + " ramesh";

		System.out.println("again hashcode = " + System.identityHashCode(name)
				+ " " + name);

		name = name + " tendulkar";

		System.out.println("new hashcode = " + System.identityHashCode(name)
				+ " " + name);

	}

	private static void testEquality() {
		String firstName = "leena";
		String secondName = "leena";

		String thirdName = new String("rahul");
		String fourthName = new String("rahul");

		System.out.println("hashcode of first name = "
				+ System.identityHashCode(firstName));
		System.out.println("hashcode of second name = "
				+ System.identityHashCode(secondName));

		System.out.println("hashcode of third name = "
				+ System.identityHashCode(thirdName));
		System.out.println("hashcode of fourth name = "
				+ System.identityHashCode(fourthName));

		// same content.
		System.out.println("firstname.equals(secondName)\n"
				+ (firstName.equals(secondName)));
		System.out.println("firstname == secondName\n"
				+ (firstName == secondName));

		// different objects. same content
		System.out.println("thirdName.equals(fourthName)\n"
				+ (thirdName.equals(fourthName)));
		System.out.println("thirdName == fourthName\n"
				+ (thirdName == fourthName));

	}

}
