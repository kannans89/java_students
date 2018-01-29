package com.techlabs.string.test;

import com.techlabs.string.NotImmutableArray;

public class TestNotImmutable {

	public static void main(String[] args) {

		int[] inputArray={10,20,30};
		NotImmutableArray mutable=new NotImmutableArray(inputArray);
		System.out.println(mutable);
		inputArray[2]=100;
		System.out.println(mutable);
	}

}
