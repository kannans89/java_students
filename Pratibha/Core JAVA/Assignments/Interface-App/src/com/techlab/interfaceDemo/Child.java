package com.techlab.interfaceDemo;

public class Child extends Parent implements Man {
	public Child(int a) {
		System.out.println("Child condtructor");
	}

	public void laugh() {
		System.out.println("Child is laughing");
	}

	public void play() {
		System.out.println("Child id playing");
	}

	@Override
	public void talk() {
		System.out.println("Child is talking");
	}

	
}
