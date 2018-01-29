package com.techlab.boxingUnBoxing;

import java.util.ArrayList;
import java.util.List;

public class Boxing {

	public static void main(String[] args) {
		List<Integer> ints = new ArrayList<Integer>();
		ints.add(new Integer(5));
		ints.add(new Integer(6));
		int i = ints.get(0).intValue();
		System.out.println(i);
	}
}
