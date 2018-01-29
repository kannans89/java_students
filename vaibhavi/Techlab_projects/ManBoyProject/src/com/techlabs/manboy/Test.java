package com.techlabs.manboy;

public class Test {

	public void testMan()
	{
		Man man=new Man();
		man.eat();
		man.read();
		man.play();
	}
	
	public void testBoy()
	{
		Boy boy=new Boy();
		boy.wish();
		boy.play();
		boy.eat();
		boy.read();
		
	}
	public void testManBoy()
	{
		Man x;
	
		x=new Boy();
		x.play();
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test test=new Test();
		
		//test.testMan();
		//test.testBoy();
		test.testManBoy();

	}
      
}
