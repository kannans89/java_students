package com.techlabs.patterns.creational.singleton.ex1.test;

import com.techlabs.patterns.creational.singleton.ex1.Manager;

public class TestManager {

	public static void main(String[] args) {
		
		Manager boss1 = Manager.getManager();
		boss1.doWork();
		
		Manager boss2 = Manager.getManager();
		boss2.doWork();
		
		System.out.println("Hashcode of boss1 = "+System.identityHashCode(boss1));
		System.out.println("Hashcode of boss2 = "+System.identityHashCode(boss2));
	}

}
