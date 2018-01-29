package com.techlabs.factory;

import com.techlabs.movable.Bike;
import com.techlabs.movable.Car;
import com.techlabs.movable.Cycle;
import com.techlabs.movable.IMovable;
import com.techlabs.movable.MovableType;
import com.techlabs.movable.Truck;

public class MovableFactory {

	private static IMovable movable;
	private static MovableFactory factory;

	private MovableFactory() {

	}

	public static IMovable getInstance(MovableType type) {

		if (factory == null)
			factory = new MovableFactory();
		
		if (type == MovableType.BIKE)
			movable = new Bike();
		if (type == MovableType.TRUCK)
			movable = new Truck();
		if (type == MovableType.CAR)
			movable = new Car();
		if (type == MovableType.CYCLE)
			movable = new Cycle();

		return movable;
	}

}
