package com.techlabs.basics;

public class StringArrayTest {
	public static void main(String[] args) {
		String[] names = { "rahul", "vijay", "siddhesh", "sundar" };
		print(names);
		changeStringArray(names);
		System.out.println("Names After Change are ");
		changeStringArray(names);
		print(names);
	}

	static void print(String[] names){
		for(String name : names){
		System.out.println("The Name is : "+name);
		}
	}
	static void changeStringArray(String[] names){
		
		names = new String[]{"mumbai","chennai","pune","delhi"};
		/*as we are creating new object using "new" so the names will refer to new memory
		location*/
		
	}
}
