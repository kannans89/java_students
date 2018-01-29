package com.prctice.day1;

class DogClass{
	int size;
	String Name;
	
	void bark(){
		if(size>60){
			System.out.println("Woof! Woof!");
		}
		else if(size>14){
			System.out.println("Ruff! Ruff!");
		}
		else{
			System.out.println("Yip! yip!");
		}
	}
	
}

public class DogtestDrive {

	public static void main(String[] args) {
		DogClass one=new DogClass();
		one.size=70;
		DogClass two=new DogClass();
		two.size=8;
		DogClass three=new DogClass();
		three.size=35;
		
		
		one.bark();
		two.bark();
		three.bark();
	}

}
