package com.practice.chapter16;

import java.util.HashMap;

public class TestMap {

	public static void main(String[] args) {
		HashMap<String, Integer> scores = new HashMap<String, Integer>();

		scores.put("adesh", 343);
		scores.put("rahul", 123);
		scores.put("leena", 234);

		System.out.println(scores);
		System.out.println(scores.get("adesh"));
	}

}
