package com.techlabs.immutable;

public class TestImMutable {

	public static void main(String[] args) {

		int[] myarray={1,2,3};
		ImMutable i=new ImMutable(myarray);
	    System.out.println(i);
	    myarray[2]=1;
	    System.out.println(i);
	}

}
