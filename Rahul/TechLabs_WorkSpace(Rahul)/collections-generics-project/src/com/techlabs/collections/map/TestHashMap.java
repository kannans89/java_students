package com.techlabs.collections.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class TestHashMap {
	public static void main(String[] args) {
		//Map<String,String> dictionary = new HashMap<String,String>();
		Map<String,String> dictionary = new LinkedHashMap<String, String>();
		dictionary.put("A", "Apple");
		dictionary.put("A", "Adesh");//Update
		dictionary.put("B", "Boy");
		dictionary.put("C", "Cat");
		dictionary.put("D", "Dog");
		System.out.println(dictionary);
		
		for(Map.Entry<String, String> temp : dictionary.entrySet()){
			System.out.println("Key is :- "+temp.getKey());
			System.out.println("Key is :- "+temp.getValue());
		}
	}
}
