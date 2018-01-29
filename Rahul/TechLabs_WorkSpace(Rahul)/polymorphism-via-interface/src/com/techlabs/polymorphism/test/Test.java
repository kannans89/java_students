package com.techlabs.polymorphism.test;

import com.techlabs.polymorphism.Boy;
import com.techlabs.polymorphism.IEmotional;
import com.techlabs.polymorphism.IMannerable;
import com.techlabs.polymorphism.Man;

public class Test {

	public static void main(String[] args) {
		// manTest();
		// boyTest();
		testEmotionalArray();

	}

	// Methods
	public static void manTest() {
		Man manObj1 = new Man();
		atPartyHall(manObj1);
		manObj1.play();
	}

	public static void boyTest() {
		Boy boyObj1 = new Boy();
		atPartyHall(boyObj1);
		atMovieHall(boyObj1);

	}

	public static void testEmotionalArray() {
		Boy[] boyArray = new Boy[5];
		boyArray[0] = new Boy();
		boyArray[1] = new Boy();
		boyArray[2] = new Boy();
		boyArray[3] = new Boy();
		boyArray[4] = new Boy();
		
			movieHall(boyArray);
		
		

	}
	public static void movieHall(IEmotional[] objArray){
		for(IEmotional obj : objArray ){
			obj.cry();
			obj.laugh();
		}
		
	}

	public static void atPartyHall(IMannerable object) {
		object.wish();
		object.depart();
	}

	public static void atMovieHall(IEmotional object) {
		object.cry();
		object.laugh();
	}

}
