package com.techlabs.composite.test;

import com.techlabs.composite.Circle;
import com.techlabs.composite.Group;
import com.techlabs.composite.Rectangle;
import com.techlabs.composite.Triangle;

public class TestMain {

	public static void main(String[] args) {
		Group root = new Group("Root");
		root.add(new Triangle());
		root.add(new Circle());
		
		Group subGroup = new Group("SubGroup");
		subGroup.add(new Rectangle());
		subGroup.add(new Rectangle());
		
		root.add(subGroup);
		
		root.draw();
	}

}
