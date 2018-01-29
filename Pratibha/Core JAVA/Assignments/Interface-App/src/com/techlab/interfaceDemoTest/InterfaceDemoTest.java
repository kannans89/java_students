package com.techlab.interfaceDemoTest;

import com.techlab.interfaceDemo.*;

public class InterfaceDemoTest {

	public static void main(String[] args) {
		Man man=new Child(1);
		man.eat();
		man.laugh();
		man.play();
		man.walk();
		man.live();
		((Child) man).talk();
	}

}
