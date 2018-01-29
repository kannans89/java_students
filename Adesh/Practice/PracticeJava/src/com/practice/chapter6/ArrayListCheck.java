package com.practice.chapter6;

import java.util.ArrayList;

public class ArrayListCheck {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		a.add(0, "adesh");
		a.add(1, "pote");
		printAl(a);
		if (a.contains("adesh")) {
			a.add("hiii");
		}
		printAl(a);
		if (a.indexOf("hiii") != 3) {
			a.add(":)");
		}
		printAl(a);

	}

	private static void printAl(ArrayList<String> al) {
		for (String element : al) {
			System.out.print(element + " ");
		}
		System.out.println(" ");
	}

}
