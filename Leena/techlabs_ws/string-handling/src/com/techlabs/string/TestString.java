package com.techlabs.string;

public class TestString {

	public static void main(String[] args) {
		// String literals- String knows its value at compile time
		//testEquality();
		//testStringMutabillity();
		
	
	}
	
	public static void testEquality(){
		String firstName="leena";
		String secondName="leena";
		System.out.println("hashcode of firstname is :"+System.identityHashCode(firstName));
		System.out.println("hashcode of Secondname is :"+System.identityHashCode(secondName));
		
		String thirdname=new String("Rahul");
		String fourthname=new String("Rahul");
		System.out.println("hashcode of thirdname is : "+System.identityHashCode(thirdname));
		System.out.println("hashcode of fourthname is : "+System.identityHashCode(fourthname));
	
		System.out.println("firstname(==secondname"+(firstName==secondName));
		System.out.println("firstName.equals(secondName)"+(firstName.equals(secondName)));
		
		System.out.println("thirdname(==fourthname)"+(thirdname==fourthname));
		System.out.println("thirdname.equals(fourthname)"+(thirdname.equals(fourthname)));
	
	}
	
	public static void testStringMutabillity(){
		String name="Sachin";
		System.out.println(System.identityHashCode(name));
		name+=" Ramesh";
		System.out.println(System.identityHashCode(name));
		name+=" Tendulkar";
		System.out.println(System.identityHashCode(name));
		System.out.println(name);
	}
	
}
