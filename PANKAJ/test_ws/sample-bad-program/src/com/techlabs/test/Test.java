package com.techlabs.test;

public class Test {
	
	
	public int add(int a,int b)
	{
		
		return a+b;
	}

	public static void main(String[] args) {

		
	   final Test obj =new Test();
		System.out.println( obj.add(10, 20));
	}
}
