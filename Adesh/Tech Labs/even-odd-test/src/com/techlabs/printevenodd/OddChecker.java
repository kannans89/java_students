package com.techlabs.printevenodd;

public class OddChecker {
	public void printOddNo(int[] nos) {
		for (int index = 0; index < nos.length; index++) {
			if (nos[index] % 2 != 0) {
				System.out.print(nos[index] + " ");
			}
		}
	}

}
