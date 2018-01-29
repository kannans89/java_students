package com.techlabs.immutable;

public class TestNotQuiteMutable {

	public static void main(String[] args) {
		
		int[] myNumbers = {10, 20, 30};
		
		//NotQuiteMutable immutable = new NotQuiteMutable(myNumbers);
		
		Immutable immutable = new Immutable(myNumbers);
		System.out.println(immutable);
		
		myNumbers[2] = 100;
		
		System.out.println(immutable);
	}

}
