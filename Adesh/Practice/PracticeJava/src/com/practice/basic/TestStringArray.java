package com.practice.basic;

public class TestStringArray {
	public static void print(String text){
		System.out.println(text);

	}
	public static void print(String[] text){
		for(int i=0;i<text.length;i++){
			print(text[i]);
		   }
		}

	public static void main(String[] args) {
		String[] names = {"adesh","kannan","aditi"};
		print("size of the Array is "+args.length);
		print(names);
	}
}
