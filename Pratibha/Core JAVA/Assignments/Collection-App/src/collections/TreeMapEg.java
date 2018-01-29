package collections;

import java.util.TreeMap;

public class TreeMapEg {
	public static void main(String a[]) {
		TreeMap<String, String> hm = new TreeMap<String, String>();
		hm.put("first", "FIRST INSERTED");
		hm.put("third", "THIRD INSERTED");
		hm.put("second", "SECOND INSERTED");
		hm.put("second","SECOND INSERTED");
		System.out.println(hm);
		System.out.println("Value of second: " + hm.get("second"));
		System.out.println("Is TreeMap empty? " + hm.isEmpty());
		hm.remove("third");
		System.out.println(hm);
		System.out.println("Size of the TreeMap: " + hm.size());
		TreeMap<String, String> subMap = new TreeMap<String, String>();
		subMap.put("s1", "S1 VALUE");
		subMap.put("s2", "S2 VALUE");
		hm.putAll(subMap);
		System.out.println(hm);
		if (hm.containsValue("first")) {
			System.out.println("The TreeMap contains value first");
		} else {
			System.out.println("The TreeMap does not contains value first");
		}
	
	}
}
