package com.practice.chapter1.puzzle;

public class Test {

	public static void main(String[] args) {
		
		Character king = new King();
		king.fight();
		king.setWeapon(new SwordBehaviour());
		king.fight();
	}

}
