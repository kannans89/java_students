package com.techlabs.patterns.behavioral.template.ex2;

public abstract class HouseTemplate {
	
	public final void buildHouse(){
		buildFoundation();
        buildPillars();
        buildWalls();
        buildWindows();
        System.out.println("House is built.");
        System.out.println("-------------------------------------------------------");
	}
	
	
	private void buildFoundation(){
		System.out.println("Building foundation with cement,iron rods and sand");
	}
	
    protected abstract void buildPillars();
    protected abstract void buildWalls();
     
     private void buildWindows(){
    	 System.out.println("Building Windows");
    	 }

}
