package com.techlabs.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {

	public static void main(String[] args) {
		// Map<String,String> stateCode=new HashMap<String,String>();
		//Map<String, String> stateCode = new LinkedHashMap<String, String>();
		
		Map<String,String> stateCode=new TreeMap<String,String>();

		stateCode.put("MH", "Maharashtra");
		stateCode.put("GJ", "Gujarat");
		stateCode.put("KL", "Kerela");
		print(stateCode);

	}

	private static void print(Map<String, String> stateCode) {
		for (Map.Entry<String, String> entry : stateCode.entrySet()) {
			System.out.println(entry.getKey() + "   " + entry.getValue());

		}
	}

}
