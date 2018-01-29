package com.practice.chapter1.puzzle;

public class King extends Character{

	public King(){
	    weapon = new KnifeBehaviour();
	}
	
	public void useWeapon(){
		weapon.useWeapon();
	}

	public void fight() {
		System.out.println("king is fighting");
	}

}
