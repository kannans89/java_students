package com.practice.chapter4;

public class Sample {

	public static void main(String[] args) {
		GoodDog d=new GoodDog();
		GoodDog []one=new GoodDog[3];
		
		one[0]=new GoodDog();
		one[1]=new GoodDog();
		one[2]=d;
		
		one[0].setSize(45);
		int x=one[0].getSize();
		one[1].setSize(33);
		int y=one[1].getSize();
		one[2].setSize(12);
		int z=one[2].getSize();
		
		System.out.println("one index size "+x);
		System.out.println("second index size is "+y);
		System.out.println("third index size is "+z);
		
	}

}
