package com.techlabs.interfaces;

public class TestInterfaces {

	public void testMan()
	{
		Man man=new Man();
		man.depart();
		man.wish();
		partyHall(man);
		//cinemaHall(man); (Not allowed)
	}
	
	public void testBoy()
	{
		Boy boy=new Boy();
		boy.cry();
		boy.love();
		boy.depart();
		boy.wish();
		cinemaHall(boy);
	}
	
	public void cinemaHall(Iemotions emotion)
	{
		System.out.println("Entering cinema hall");
		emotion.cry();
		emotion.love();
	}
	
	public void partyHall(Imanners manners)
	{
		System.out.println("Entering party hall");
		manners.depart();
		manners.wish();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          TestInterfaces test=new TestInterfaces();
          test.testBoy();
          test.testMan();
	}

}
