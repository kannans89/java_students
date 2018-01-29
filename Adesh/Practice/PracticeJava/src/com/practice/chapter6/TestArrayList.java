package com.practice.chapter6;

import java.util.ArrayList;

public class TestArrayList {

	public static void main(String[] args) {
		ArrayList<String> myList = new ArrayList<String>();
		String a = new String("adesh");
		myList.add(a);
		String b = new String("pote");
		myList.add(b);
		System.out.println("size of the array = " + myList.size());
		System.out.println("first name is = " + a);
		System.out.println("last name is = " + b);

	}

}
