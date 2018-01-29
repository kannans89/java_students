package com.techlabs.string;

public class TestStringBuilder {
	
	public static void main(String[] args) {
		StringBuilder name=new StringBuilder();
		
		System.out.println("Hash code of name is : "+System.identityHashCode(name));
		
		name.append("Hii,");
		System.out.println("Hash code of name is : "+System.identityHashCode(name));
		name.append(" Sachin");
		System.out.println("Hash code of name is : "+System.identityHashCode(name));
		name.append(" Ramesh");
		System.out.println("Hash code of name is : "+System.identityHashCode(name));
		name.append(" Tendulkar");
		System.out.println("Hash code of name is : "+System.identityHashCode(name));
		
		String finalName=name.toString();	
//after calling toString() the StringBuilder will make the new immutable object and pass it
// original mutable object like name is remain same
		System.out.println("final name :"+name);
		System.out.println("Hash code of finalName is :"+System.identityHashCode(finalName));
		
		name.append(" Hows you???");
		String lastName=name.toString();
		System.out.println("last name :"+name);
		System.out.println("Hash code of lastName is :"+System.identityHashCode(lastName));
		
	}

}
