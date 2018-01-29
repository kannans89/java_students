package com.techlabs.string;

public class TestStringBuilder {

	public static void main(String[] args) {
		StringBuilder name = new StringBuilder();
		
		System.out.println("hashcode = "+System.identityHashCode(name));
		name.append("Adesh ");
		System.out.println("hashcode = "+System.identityHashCode(name));
		name.append("Digambar ");
		System.out.println("hashcode = "+System.identityHashCode(name));
		name.append("Pote");
		System.out.println("name = "+name.toString());
	}

}
