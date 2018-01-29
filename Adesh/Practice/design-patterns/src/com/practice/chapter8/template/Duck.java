package com.practice.chapter8.template;

public class Duck implements Comparable<Duck>{

	private String name;
	private int weight;;
	
	public Duck(String name, int weight){
		this.name = name;
		this.weight = weight;
	}
	
	public String toString(){
		return name+" weighs "+weight;
	}
	
	public int compareTo(Duck object) {
		if(this.weight < object.weight){
			return -1;
		}else if(this.weight == object.weight){
			return 0;
		}else {
			return 1;
		}
	}
}
