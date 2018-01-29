package com.techlabs.patterns.creational.singleton.ex1.test;

import com.techlabs.patterns.creational.singleton.ex1.Manager;

public class Test {

	public static void main(String[] args) {
		
		Manager boss1=Manager.getmanager();
		Manager boss2=Manager.getmanager();
		
		System.out.println("Hash Code of boss1 :"+System.identityHashCode(boss1));
		System.out.println("Hash Code of boss2 :"+System.identityHashCode(boss2));
		
		boss1.doWork();
		boss2.doWork();
	}

}
