package com.techlabs.immutable;

public final class ImMutable {
	
	final int[] input;
	
	public ImMutable(int[] myarray)
	{
		input=myarray.clone();
	}
@Override	
public String toString() {
		
		StringBuilder builder=new StringBuilder();
		for(int i=0;i<input.length;i++)
		{
			
			builder.append(input[i]);
		 
	}
		return builder.toString();
	}
	
	

}
