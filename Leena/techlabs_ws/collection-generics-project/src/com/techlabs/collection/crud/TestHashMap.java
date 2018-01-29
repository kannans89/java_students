package com.techlabs.collection.crud;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TestHashMap {

	public static void main(String[] args) {

		Map<String, String> dictionary = new HashMap<String, String>();
		
		
		
		createMap(dictionary);
		displayhashMap(dictionary);
		// readMap(dictionary);
		// deleteMap(dictionary);
		 updateMap(dictionary);

	}

	public static void createMap(Map<String, String> map) {
		Scanner scr = new Scanner(System.in);
		System.out.println("How many keys u want??");
		int no = scr.nextInt();
		for (int index = 0; index < no; index++) {
			System.out.println("Enter key for index[" + index + "]");
			String newKey = scr.next();
			System.out.println("Enter value for index[" + index + "]");
			String newValue = scr.next();
			map.put(newKey, newValue);
		}
		System.out.println("New hashMap is creted");
		// displayhashMap(map);
	}

	

	public static void readMap(Map<String, String> map) {
		// createMap(map);
		System.out.println("Reading data from map ");
		displayhashMap(map);
	}

	public static void deleteMap(Map<String, String> map) {
		System.out.println("This is deleting Operation :");
		Scanner scr = new Scanner(System.in);
		System.out.println("Which key u want to delete??");
		String key = scr.next();
		map.remove(key);
		System.out.println(key + " Key is deleted with its Value ");
		displayhashMap(map);
	}

	public static void updateMap(Map<String, String> map) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Which key you want to update");
		String key = scr.next();

		boolean isIn = map.containsKey(key);
		
		if (isIn == true) {
			System.out.println(key + " is already present in the Current Map");
			System.out.println("Do u want to replace it?? Press Yes(1) or No(0)");
			int ans = scr.nextInt();
			if (ans == 1) {
				System.out.println("Enter key which u want to add");
				String newkey = scr.next();
				System.out.println("Enter value for new key :");
				String newValue = scr.next();
				map.remove(key);
				map.put(newkey, newValue);
				
				System.out.println("HashMap is Successfully updated");
				displayhashMap(map);
			} else {
				System.out.println(" No updation done");
				displayhashMap(map);
			}
		} else {
			System.out.println(key + " is not present in the Current Map");
			System.out.println("Do u want to add it?? Press Yes(1) or No(0)");
			int ans = scr.nextInt();
			if (ans == 1) {
				System.out.println("Enter key which u want to add");
				String newkey = scr.next();
				System.out.println("Enter value for new key :");
				String newValue = scr.next();
				map.put(newkey, newValue);
				System.out.println("HashMap is Successfully updated");
				displayhashMap(map);
			}
		}
	}
	
	public static void displayhashMap(Map<String, String> map) {
		for (Map.Entry<String, String> temp : map.entrySet()) {
			System.out.print("Key : " + temp.getKey());
			System.out.print("  Value is :" + temp.getValue());
			System.out.println(" ");

		}
	}

}
