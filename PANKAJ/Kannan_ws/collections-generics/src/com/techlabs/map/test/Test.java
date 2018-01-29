package com.techlabs.map.test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test {

	public static void main(String[] args) {

		Map<String, String> stateCode = new HashMap<String, String>();

		stateCode.put("MH", "Maharashtra");
		stateCode.put("HR", "Haryana");
		stateCode.put("KN", "Karnataka");
		stateCode.put("GJ", "Gujrat");
		
		Set<String> keys=stateCode.keySet();
		for(String str:keys){
			System.out.println(str);
		}
		
		Collection<String> values=stateCode.values();
		for(String str:values){
			System.out.println(str);
		}
		
		System.out.println(stateCode.entrySet());

	}

}
