package com.techlabs.immutable;

public class TestNotQuiteImmutable {

	public static void main(String[] args) {
		
	int[] myNumbers ={10,20,30};
	NotQuiteImmutable immutabletry = new NotQuiteImmutable(myNumbers);
	Immutable immutableObj = new Immutable(myNumbers);
	System.out.println("Before Clone :"+immutabletry);
	System.out.println("After Clone :"+immutableObj);
	myNumbers[2]=100;
	System.out.println("Before clone"+immutabletry);
	System.out.println("After Clone :"+immutableObj);
	
	}

}
