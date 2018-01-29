package com.practice.chapter6;

import java.util.ArrayList;

public class OddNoChecker {

	public void printOddList(ArrayList<Integer> list) {
		System.out.println("");
		System.out.println("Odd nos Array => ");

		for (int index = 0; index < list.size(); index++) {
			if (list.get(index) % 2 != 0) {
				System.out.print(list.get(index) +" ");
			}
		}
	}

}
