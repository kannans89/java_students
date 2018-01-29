package com.techlabs.rahulhashset.test;

import com.techlabs.rahulhashset.RahulHashSet;

public class RahulHashSetTest {

	public static void main(String[] args) {
		RahulHashSet<Integer> integerHashSet = new RahulHashSet<Integer>();
		integerHashSet.add(2);
		integerHashSet.add(3);
		integerHashSet.add(2);
		integerHashSet.add(1);
		integerHashSet.add(4);
		integerHashSet.add(2);
		

		
		System.out.println(integerHashSet);
	}

}
