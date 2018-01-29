package com.techlabs.immutable;

public class TestNotQuiteImmutable {

	public static void main(String[] args) {
		
		int[] myNumbers={10,20,30};
		
		//NotQuiteImmutable immutable=new NotQuiteImmutable(myNumbers);
		Immutable arr=new Immutable(myNumbers);
		System.out.println(arr);
		//System.out.println(immutable);
		//System.out.println("Hash Code is : "+System.identityHashCode(immutable));
		
		myNumbers[2]=100;
		System.out.println("After changing the values :"+arr);
		//System.out.println(immutable);
		//System.out.println("hash code is : "+System.identityHashCode(immutable));
		
	}
	
	
}
