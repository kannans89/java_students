
public class Rectangle {

	int width;
	int height;
	
	public Rectangle(int width,int height) 
	
	{
		this.height=height;
		this.width=width;
		if(height<0 || width <0)
		{
			throw new InvalidDimensionException("Invalid height and width", this);
		}
		
	}
	public  int getWidth()
	{
		return width;
	}
	public  int getHeight()
	{
		return height;
	}
	
	public void getArea()
	{
		System.out.println("Area is"+ width*height);
	}
}
