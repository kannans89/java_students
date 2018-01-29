package com.techlabs.map;

import java.util.HashMap;
import java.util.Map;

public class TestMap {

	public static void main(String[] args) {

		Map<String,String> stateCode=new HashMap<String,String>();
		stateCode.put("Gj", "Gujarat");
		stateCode.put("MH", "Maharastra");
		stateCode.put("HR", "Hariyana");
		stateCode.put("TN", "Tamilnadu");
		
		for(Map.Entry<String,String> entry: stateCode.entrySet())
		{
		System.out.println(entry.getKey());
		System.out.println(entry.getValue());
		}
		
	}

}
