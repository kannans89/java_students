package com.techlabs.immutable;

public class NotQuiteImmutable {

	private int[] noArray;
	

	public NotQuiteImmutable(int[] noArray) {
		this.noArray=noArray;
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
