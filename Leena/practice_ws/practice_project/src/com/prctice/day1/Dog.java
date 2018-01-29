package com.prctice.day1;

public class Dog {
	String name;  //doubt
	public static void main(String[] args) {
		/* Making object of the class */
		Dog dog1=new Dog();
		dog1.bark();
		dog1.name="Bart";
		
		/* Now making Array */
		Dog[] myDogs=new Dog[3];
		myDogs[0]=new Dog();
		myDogs[1]=new Dog();
		myDogs[2]=dog1;
		
		/* Accessing the Class using Array*/
		myDogs[0].name="Fred";
		myDogs[1].name="Marge";
		System.out.print("Last Dog's Name Is : ");
		System.out.println(myDogs[2].name);
	
		int x=0;
		while(x<myDogs.length){
			myDogs[x].bark();
			x=x+1;
		}
		
	}

	public void bark(){
		System.out.println(name+" says Ruff!!");
	}
	public void eat(){}
	public void chaseCat() {}
}
