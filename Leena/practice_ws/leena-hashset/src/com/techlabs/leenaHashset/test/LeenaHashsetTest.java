package com.techlabs.leenaHashset.test;

import com.techlabs.leenaHashset.LeenaHashset;

public class LeenaHashsetTest {

	public static void main(String[] args) {
		
		LeenaHashset<Integer> leenaSet=new LeenaHashset<Integer>();
		leenaSet.add(5);
		leenaSet.add(5);
		leenaSet.add(2);
		leenaSet.add(3);
		
		System.out.println(leenaSet);
	}

}
