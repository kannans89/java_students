package com.techlabs.guitarShopping.encapsulation;

import com.techlabs.guitarShopping.Guitar;
import com.techlabs.guitarShopping.enumration.Builder;
import com.techlabs.guitarShopping.enumration.Type;
import com.techlabs.guitarShopping.enumration.Wood;

public class GuitarSpec {
	
	private Builder builder;
	private String model;
	private Type type;
	private Wood backWood;
	private Wood topWood;
	private int numStrings;
	
	public GuitarSpec(Builder builder, String model, Type type,int numStrings, Wood backWood, Wood topWood){
		this.builder=builder;
		this.model=model;
		this.type=type;
		this.numStrings=numStrings;
		this.backWood=backWood;
		this.topWood=topWood;
		
	}
	
	public Builder getBuilder(){
		return builder;
	}
	
	public String getModel(){
		return model;
	}
	
	public Type getType(){
		return type;
	}
	
	public Wood getBackWood(){
		return backWood;
	}
	
	public Wood getTopWood() {
		return topWood;
	}

	public int getNumStrings(){
		return numStrings;
	}

	
	public boolean matches(GuitarSpec otherSpec){
		Builder builder=otherSpec.getBuilder();
		if((builder!=null)&&(!builder.equals(""))&&(!builder.equals(otherSpec.getBuilder())))
			return false;
			
			
			String model=otherSpec.getModel().toLowerCase();
		if((model!=null)&&(!model.equals(""))&&(!model.equals(otherSpec.getModel().toLowerCase())))
			return false;
			
			Type type=otherSpec.getType();
		if((type!=null)&&(!type.equals(""))&&(!type.equals(otherSpec.getType())))
				return false;
		Wood backWood=otherSpec.getBackWood();
		if((backWood!=null)&&(!backWood.equals(""))&&(!backWood.equals(otherSpec.getBackWood())))
				return false;
		Wood topWood=otherSpec.getTopWood();
		if((topWood!=null)&&(!topWood.equals(""))&&(!topWood.equals(otherSpec.getTopWood())))
         return false;
		return true;
		//matchingGuitars.add(guitar)	; 
		//return guitar;	 
	}

	
		
}
