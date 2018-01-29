package com.techlabs.movable.test;

import com.techlabs.movable.Bike;
import com.techlabs.movable.Car;
import com.techlabs.movable.IMovable;
import com.techlabs.movable.Truck;

public class MovableTest {

	public static void main(String[] args) {
		Car car = new Car();
		Bike bike = new Bike();
		Truck truck = new Truck();
		IMovable[] obj = { car, bike, truck };
		atTheRoad(obj);
	}

	private static void atTheRoad(IMovable[] objects) {

		for (IMovable object : objects)
			object.move();
	}

}
