package com.practice.chapter1.strategy;

public class ModelDuck extends Duck{
	
	public ModelDuck(){
		quackBehaviour = new Quack();
		flyBehaviour = new FlyNoWay();
		}

	public void display() {
		System.out.println("I am model duck.!");
	}

}
