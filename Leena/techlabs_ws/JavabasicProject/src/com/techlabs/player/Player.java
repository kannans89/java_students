package com.techlabs.player;

public class Player {
		
	private int id;
	private String name;
	private int age;
	
	public Player(int id, String name,int age){
		this.id=id;
		this.age=age;
		this.name=name;
		
	}
	
	public int getId(){
		return id;
	}
	
	public String getName(){
		return name;
	} 
	
	public int getAge(){
		return age;
	}
	
	public Player findElder(Player other){
		if(this.age>other.age)
			return this;
		
			return other;
		
	}
	@Override
	public String toString(){
		String details="Id of the player is : "+this.id+" "+"Name is: "+this.name+" "+"Age is :"+this.age;
		return details+"  "+ super.toString();
		
	}
}
