package com.techlabs.immutable;

public class NotImmutable {
	
	private int[] input=new int[3];
	
	public NotImmutable(int[] myarray)
	{
		input=myarray;
	}

	public int[] getArray()
	{
		return input;
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
