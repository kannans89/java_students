package com.techlabs.patterns.behavioral.template.ex2;

public class GlassHouse extends HouseTemplate{
	
	@Override
	public void buildPillars(){
		System.out.println("Building Pillars with Glass coating");
	}
	
	@Override
	public void buildWalls(){
		System.out.println("Building Glass Walls");
	}

}
