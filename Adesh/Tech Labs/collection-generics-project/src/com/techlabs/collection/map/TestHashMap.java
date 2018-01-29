package com.techlabs.collection.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class TestHashMap {

	public static void main(String[] args) {

		Map<String, String> dictionary = new LinkedHashMap<String, String>();

		dictionary.put("a", "adesh");
		dictionary.put("d", "digambar");
		dictionary.put("p", "pote");
		dictionary.put("s", "adesh");

		for (Map.Entry<String, String> item : dictionary.entrySet()) {
			System.out.print("key is = " + item.getKey());
			System.out.println(", value is = " + item.getValue());
		}
		 System.out.println(dictionary);
	}

}
