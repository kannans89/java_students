package com.techlabs.string;

public class TestStringBuilder {

	public static void main(String[] args) {
		StringBuilder name = new StringBuilder();

		System.out.println("hashcode = " + System.identityHashCode(name));
		name.append("hello");
		System.out.println("hashcode = " + System.identityHashCode(name));
		name.append(" sachin");
		System.out.println("hashcode = " + System.identityHashCode(name));
		name.append(" ramesh");
		System.out.println("hashcode = " + System.identityHashCode(name));
		name.append(" tendulkar");
		System.out.println("hashcode = " + System.identityHashCode(name));
		String fullName = name.toString();
		System.out.println("hashcode = " + System.identityHashCode(fullName)
				+ " " + fullName);

		fullName = fullName + " test full name";
		System.out.println("hashcode = " + System.identityHashCode(fullName)
				+ " " + fullName);

	}

}
