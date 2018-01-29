package com.techlabs.polymorphism.test;
import com.techlabs.polymorphism.Boy;
import com.techlabs.polymorphism.IEmotionable;
import com.techlabs.polymorphism.IMannerable;
import com.techlabs.polymorphism.Man;

public class Test {

	public static void main(String[] args) {
	//System.out.println("Output of Man Object : ");
    //testMan();
    //System.out.println("=========================================================");
    //System.out.println("Output of Boy Object : ");
	//testBoy();
		System.out.println("Output of Overloading Function :");
		testEmotionaleArray();
	}

	
	public static void testMan(){
		Man manObj=new Man();
		manObj.wish();
		manObj.depart();
		manObj.play();
		System.out.println("After calling Interface : ");
		atPlayHall(manObj);
	}
	
	public static void testBoy(){
		Boy boyObj=new Boy();
		boyObj.cry();
		boyObj.depart();
		boyObj.wish();
		boyObj.eat();
		boyObj.laugh();
		System.out.println();
		System.out.println("After calling Interface : ");
		System.out.println("Output of MovieHall :");
		atMovieHall(boyObj);
		System.out.println("---------------");
		System.out.println("Output of PlayHall :");
		atPlayHall(boyObj);
	}
	
	public static void atPlayHall(IMannerable obj){
		obj.depart();
		obj.wish();
	}
	
	public static void atMovieHall(IEmotionable obj){
		obj.cry();
		obj.laugh();
	}
	
	public static void testEmotionaleArray(){
		IEmotionable[] emotionableArrayObj;
		
		emotionableArrayObj=new IEmotionable[2];
		emotionableArrayObj[0]=new Boy();
		emotionableArrayObj[1]=new Boy();
		atMovieHall(emotionableArrayObj);
			} 
	
	public static void atMovieHall(IEmotionable[] emotionableObj){
		for(IEmotionable obj:emotionableObj){
			obj.cry();
			obj.laugh();
			System.out.println("=================");
		}

	}
}
