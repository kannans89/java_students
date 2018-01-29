package com.techlabs.user.test;

public class TestMain {
	public static void main(String[] args) {
		// no age
		StringBuilder builder = new StringBuilder();
		String result = builder.append(1).append(true)
				.append("Hii").toString();
		System.out.println("Output:"+result);
	}
}
