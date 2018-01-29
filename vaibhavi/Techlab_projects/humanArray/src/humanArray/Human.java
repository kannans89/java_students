package humanArray;

public class Human {

	private String name;
	private int height;
	private int weight;
	
	public Human(String n, int h,int w)
	{
		name=n;
		height=h;
		weight=w;
	}
	public String getName()
	{
		return name;
	}
	public int getHeight()
	{
		return height;
	}
	public int getWeight()
	{
		return weight;
	}
	public void play()
	{
		weight=weight-1;
	}
	public void eat()
	{
		weight=weight+1;
	}
}

