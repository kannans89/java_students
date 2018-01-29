package com.prctice.day2;

public class ElectricGuitar {
	
	private String brand;
	private int numOfPickups;
	private String rockStarUsesIt;
	
	public ElectricGuitar(String brand,int numOfPickups,String rockStarUsesIt){
		this.brand=brand;
		this.numOfPickups=numOfPickups;
		this.rockStarUsesIt=rockStarUsesIt;
	}
	
	public String getBrand(){
		return brand;
	}
	
	public int getNumOfpickups(){
		return numOfPickups;
	}
	
	public String getrockStarUsesIt(){
		return rockStarUsesIt;
	}
	
	public String setrockStarUsesIt(String rockStarUsesIt ){
		this.rockStarUsesIt=rockStarUsesIt;
		return rockStarUsesIt;
	}
	
}
