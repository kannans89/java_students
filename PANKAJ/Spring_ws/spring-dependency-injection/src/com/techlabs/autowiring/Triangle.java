package com.techlabs.autowiring;

public class Triangle {
	Point pointA;
	Point pointB;
	Point pointC;

	public Triangle() {
		System.out.println("In Triangle constructor");
	}

	public void draw() {
		String result = String.format("A(%d,%d)  B(%d,%d)  C(%d,%d)",
				pointA.getX(), pointA.getY(), pointB.getX(), pointB.getY(),
				pointC.getX(), pointC.getY());
		System.out.println(result);
	}

	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

}
