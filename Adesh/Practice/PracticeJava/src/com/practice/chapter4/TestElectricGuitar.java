package com.practice.chapter4;

public class TestElectricGuitar {

	public static void main(String[] args) {
		ElectricGuitar eg=new ElectricGuitar();
		eg.setBrand("flora");
		eg.setNumOfPickups(22);
		eg.setRockStarUsesIt(true);
		
		System.out.println("guitar brand name "+eg.getBrand());
		System.out.println("number of pick ups "+eg.getNumOfPickups());
		System.out.println("is rockstar uses it? "+eg.rockStarUsesIt);
	}

}
