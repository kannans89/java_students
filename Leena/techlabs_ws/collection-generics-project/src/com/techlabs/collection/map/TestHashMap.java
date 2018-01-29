package com.techlabs.collection.map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class TestHashMap {

	public static void main(String[] args) {
		
		//Map<String,String> dictionary=new HashMap<String,String>();
		
		Map<String,String> dictionary=new LinkedHashMap<String,String>();
		
		dictionary.put("A", "Apple");
		dictionary.put("A","Aadesh");
		dictionary.put("B","Ball");
		dictionary.put("C","Cat");
		dictionary.put("D","Doll");
		
		/*System.out.println("Set of dictionary : ");
		System.out.println(dictionary);*/
		
		for(Map.Entry<String, String> temp:dictionary.entrySet()){
			System.out.print("Key : "+temp.getKey());
			System.out.print("  Value is :"+temp.getValue());
			System.out.println(" ");
			
		}
		
		
	}

}
