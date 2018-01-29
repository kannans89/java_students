package com.techlabs.string.test;

public class TestString {

	public static void main(String[] args) {

		String first = "Pankaj";
		String second = "Pankaj";
		String third = new String("Kannan");
		String fourth = new String("Kannan");

		System.out.println(System.identityHashCode(first));
		System.out.println(System.identityHashCode(second));
		System.out.println("first == second :" + first == second);
		System.out.println("first.equals(second) :" + first.equals(second));

		System.out.println(System.identityHashCode(third));
		System.out.println(System.identityHashCode(fourth));
		System.out.println("third == fourth :" + third == fourth);
		System.out.println("third.equals(fourth) :" + third.equals(fourth));
	}

}
