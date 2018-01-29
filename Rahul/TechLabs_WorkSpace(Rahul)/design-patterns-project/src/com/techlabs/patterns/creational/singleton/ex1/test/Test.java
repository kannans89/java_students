package com.techlabs.patterns.creational.singleton.ex1.test;

import com.techlabs.patterns.creational.singleton.ex1.Manager;

public class Test {

	public static void main(String[] args) {
		Manager boss1 = Manager.getManager();
		boss1.doWork();
		Manager boss2 = Manager.getManager();
		boss2.doWork();
		
		System.out.println(System.identityHashCode(boss1));
		System.out.println(System.identityHashCode(boss2));
	}

}
