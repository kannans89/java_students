package com.practice.chapter4;

public class XCopy {

	public static void main(String[] args) {
		int orig=42;
		XCopy c=new XCopy();
		
		int y=c.go(orig);
		System.out.println("orig "+orig+", y "+y);
	}
	
	int go(int arg){
		arg=arg * 2;
		return arg;
	}
}
