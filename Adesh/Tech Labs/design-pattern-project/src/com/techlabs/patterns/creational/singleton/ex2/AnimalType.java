package com.techlabs.patterns.creational.singleton.ex2;

public enum AnimalType {
	
	LION(true), TIGER(true), CAT(false), DOG(false), FISH(true);
	
    private boolean isCarnivorous = false;
	
	private AnimalType(boolean isCarnivorous){
		this.isCarnivorous = isCarnivorous;
	}
	
	public boolean checkCarnivorous(){
		return this.isCarnivorous;
	}
	
	/*public boolean isCarnivorous(AnimalType type){
		if(type.equals(LION)){
			return true;
		}else if(type.equals(CAT)){
			return true;
		}else if(type.equals(TIGER)){
			return false;
		}else if(type.equals(DOG)){
			return false;
		}
		return false;
	}*/

}


