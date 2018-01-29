package com.techlab.interfaceDemo;

public abstract class Parent implements Man {
	public Parent() {
		System.out.println("Parent constructor");
	}

	@Override
	public void eat() {
		System.out.println("Man is eating");
	}

	@Override
	public void walk() {
		System.out.println("Man is walking");
	}

	@Override
	public void play() {
		System.out.println("Man is playing");
	}

	public void live(){
		System.out.println("Parent is alive");
	}
	public abstract void talk();

}
