package com.practice.chapter4;

public class ClockTestDrive {

	public static void main(String[] args) {
		Clock c=new Clock();
		
		c.setTime("12:34");
		String tod=c.getTime();
		System.out.println("Time is => "+tod);
	}

}
