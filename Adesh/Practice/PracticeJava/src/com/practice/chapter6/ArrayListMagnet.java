package com.practice.chapter6;

import java.util.ArrayList;

public class ArrayListMagnet {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 1; i <= 12; i++) {
			list.add(i);
		}

		/*
		 * list.add("2"); list.add("3");
		 */
		prinAL(list);

	}

	private static void prinAL(ArrayList<Integer> al) {
		for (Integer element : al) {
			System.out.print(element + " ");
		}
		//System.out.println("");
	}

}
