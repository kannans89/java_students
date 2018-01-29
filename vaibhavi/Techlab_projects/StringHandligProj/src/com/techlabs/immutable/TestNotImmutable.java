package com.techlabs.immutable;

public class TestNotImmutable {
	
	
	public static void main(String[] args) {
		int[] myarray={1,2,3};
		NotImmutable i=new NotImmutable(myarray);
	    System.out.println(i);
	    myarray[2]=1;
	    System.out.println(i);
		
	}
	
	
}
