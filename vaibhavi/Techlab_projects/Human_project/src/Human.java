
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
	@Override
	public String toString() {
		
		StringBuilder stringbuilder=new StringBuilder();
		stringbuilder.append("Human [name=")
		.append(name)
		.append(" ")
		.append("height=")
		.append(height)
		.append(" ")
		.append("weight=")
		.append(weight)
		.append("]");
		
		return stringbuilder.toString();
		/*return "Human [name=" + name + ", height=" + height + ", weight="
				+ weight + "]";*/  
		
		//string is immutable.It will create new heap everytine when u try to change
	}
}

