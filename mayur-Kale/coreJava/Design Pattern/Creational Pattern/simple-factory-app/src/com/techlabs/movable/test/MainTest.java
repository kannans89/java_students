package com.techlabs.movable.test;

import com.techlabs.factory.MovableFactory;
import com.techlabs.movable.IMovable;
import com.techlabs.movable.MovableType;

public class MainTest {

	public static void main(String[] args) {

		IMovable car = MovableFactory.getInstance(MovableType.CAR);
		car.move();
		
		IMovable bike = MovableFactory.getInstance(MovableType.BIKE);
		bike.move();
		
		
	}

}
