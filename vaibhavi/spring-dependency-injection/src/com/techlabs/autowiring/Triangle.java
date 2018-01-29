package com.techlabs.autowiring;

public class Triangle {

	private Point pointA;
	private Point pointB;
	private Point pointC;
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
	
	public void draw()
	{
		String result=String.format("A(%d,%d) B(%d,%d) C(%d,%d)",pointA.getX(),pointA.getY(),pointB.getX(),pointB.getY(),pointC.getX(),pointC.getY());
		System.out.println(result);
	}
	
}
