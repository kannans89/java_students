package com.practice.basic;

public class TestForEach {
	public static void print(String text){
		System.out.print(text);
	}
	
	public static void print(int numArray){
		System.out.print(numArray);
	}
	
	public static void TestIntArray(){
		int[] nos={1,2,3,4,5};
		for(int x:nos){
			print(x+" ");
		}
		System.out.println(); 
	}
	
	public static void TestStringArray(){
		String[] names={"i","love","java"};
		for(String y:names){
			print(y+" ");
		}
	}

	public static void main(String[] args) {
		TestIntArray();
		TestStringArray();
	}

}
