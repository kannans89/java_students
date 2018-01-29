package com.techlabs.string.test;

import com.techlabs.string.Immutable;

public class TestImmutable {

	public static void main(String[] args) {

		int[] inputArray={10,20,30};
		
		Immutable immutableObj=new Immutable(inputArray);
		System.out.println(immutableObj);
		
		inputArray[2]=100;
		System.out.println(immutableObj);
	}

}
