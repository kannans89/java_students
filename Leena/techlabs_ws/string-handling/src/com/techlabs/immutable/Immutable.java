package com.techlabs.immutable;

public final class Immutable {

private final int[] noArray;
	

	public Immutable(int[] pnoArray) {
		this.noArray=pnoArray.clone();
	}
	
	@Override
	public String toString(){
		StringBuilder builder =new StringBuilder();
		for(int array:noArray)
			builder.append(" "+array);
		
		String finalString =builder.toString();
		return finalString;
		
	}
	
}
