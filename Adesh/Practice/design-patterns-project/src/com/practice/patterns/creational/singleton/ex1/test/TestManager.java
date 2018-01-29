package com.practice.patterns.creational.singleton.ex1.test;

import com.practice.patterns.creational.singleton.ex1.Manager;

public class TestManager {

	public static void main(String[] args) {
		Manager boss1 = Manager.getManager();
		boss1.doWork();
		
		Manager boss2 = Manager.getManager();
		boss2.doWork();
		
		Manager boss3 = Manager.getManager();
		
		System.out.println("Hashcode of the boss1 = "+boss1.hashCode());
		System.out.println("Hashcode of the boss2 = "+boss2.hashCode());
		System.out.println("Hashcode of the boss3 = "+boss3.hashCode());
	}

}
