package com.techlabs.human;

public class Human {
	public Human(int id, String name, int height, int weight) { // Constructor
		humanId = id;
		humanName = name;
		humanHeight = height;
		humanWeight = weight;
	}

	// Methods
	public int getId() {
		return humanId;
	}

	public String getName() {
		return humanName;
	}

	public int getHeight() {
		return humanHeight;
	}

	public int getWeight() {
		return humanWeight;
	}
	public void eatFood(){
		humanWeight+=3;		
	}
	public void play(){
		if(humanWeight>20){
		humanWeight-=5;
		}else
		{
			System.out.println("I am not well cant Play");
		}
	}

	// Instance variables
	private int humanId;
	private String humanName;
	private int humanHeight;
	private int humanWeight;

}
