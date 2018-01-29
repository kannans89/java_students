package day1;

public class Player {
	
	static int playerCount=1;
	private String name;
	public Player(String n){
		name=n;
		playerCount++;
	}
	public String getName() {
		return this.name;
	}
	
	
}
