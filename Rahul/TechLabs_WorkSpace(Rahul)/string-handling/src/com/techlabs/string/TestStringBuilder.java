package com.techlabs.string;

public class TestStringBuilder {
	public static void main(String[] args) {
		StringBuilder name = new StringBuilder();
		System.out.println("name :" +System.identityHashCode(name) );
		
		name.append("Hellow ");
		System.out.println("name :" +System.identityHashCode(name) );
		name.append("Sachin ");
		System.out.println("name :" +System.identityHashCode(name) );
		name.append("Ramesh ");
		System.out.println(name);
		System.out.println("name :" +System.identityHashCode(name) );
		name.append("Tendulkar");
		System.out.println("name :" +System.identityHashCode(name) );
		String finalName = name.toString();
		System.out.println("Final name :"+System.identityHashCode(finalName));
		System.out.println(finalName);
		finalName = finalName + "hi";
		System.out.println("Append hi to finalName:-"+finalName);
		System.out.println("Final name:"+System.identityHashCode(finalName));
		name.append(" I can still append");
		String final2Name= name.toString();
		System.out.println("Final Name 2: "+System.identityHashCode(final2Name));
		System.out.println(final2Name);
		
		
		
	}

}
