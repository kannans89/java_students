package com.practice.chapter2;

public class MovieTestDrive {

	public static void main(String[] args) {
		Movie m1=new Movie();
		m1.title="bahubali";
		m1.genre="Action";
		m1.rating=+4;
		m1.playIt();
		
		Movie m2=new Movie();
		m2.title="drishyam";
		m2.genre="suspense";
		m2.rating=+3;
		
		Movie m3=new Movie();
		m3.title="Robin Hood";
		m3.genre="adventure";
		m3.rating=+4;
		m3.playIt();
	}
}

