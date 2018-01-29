package com.techlabs.string;

import java.util.Arrays;

public class NotImmutableArray {
	int [] inputArray;
	
	public NotImmutableArray(int[] inputArray){
		this.inputArray=inputArray;
	}

	@Override
	public String toString() {
		return "NotImmutable [inputArray=" + Arrays.toString(inputArray) + "]";
	}
	

}
