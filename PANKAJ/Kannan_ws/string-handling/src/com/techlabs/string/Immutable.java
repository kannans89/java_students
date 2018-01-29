package com.techlabs.string;

import java.util.Arrays;

public final class Immutable {

	final int[] inputArray;
	
	public Immutable(int[] inputArray) {
		this.inputArray=inputArray.clone();
	}

	@Override
	public String toString() {
		return "Immutable [inputArray=" + Arrays.toString(inputArray) + "]";
	}
	
	
}
