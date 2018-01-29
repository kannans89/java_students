package com.techlabs.patterns.singleton;

public class ChocolateBoiler {
	
	private boolean empty;
	private boolean boiled;
	private static ChocolateBoiler uniqueObject;
	
	private ChocolateBoiler(){
		empty=true;
		boiled=false;
	}
	
	public static synchronized ChocolateBoiler getInstance(){
		if(uniqueObject==null){
			uniqueObject=new ChocolateBoiler();
		}
		return uniqueObject;
	}
	
	public boolean isEmpty(){
		return empty;
	}
	
	public boolean isBoiled(){
		return boiled;
	}
	
	public void drain(){
		if(!isEmpty()&&isBoiled()){
			//code to drain
			System.out.println("Boiler Drained");
			empty=true;
		}
	}
	
	public void fill(){
		if(isEmpty()){
			// code to fill the boiler
			System.out.println("Boiler filled");
			empty=false;
			boiled=false;
		}
	}
	
	public void boil(){
		if(!isEmpty()&&!isBoiled()){
			//code to boil
			System.out.println("Boiling started..\n finished");
			boiled=true;
		}
	}

}
