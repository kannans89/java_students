package com.practice.userdefined.generics;

public class Test {

	public static void main(String[] args) {

		AdeshHashSet<String> adeshSet = new AdeshHashSet<String>();
		adeshSet.add("adesh");
		adeshSet.add("adesh");
		adeshSet.add("leena");
		adeshSet.add("rahul");
		
		System.out.println(adeshSet);

	}

}
