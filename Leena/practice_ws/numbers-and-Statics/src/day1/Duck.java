package day1;

public class Duck {

	private int size;
   private  static int duckCount = 0;

	public Duck(){
		duckCount++;
		System.out.println("DuckCount is :"+duckCount);
	}
	public int getSize(){
		return size;
	}
	
	public void setSize(int size){
		this.size=size;
	}
	
	public int getCount(){
		return duckCount;
	}
	
	/*public static void setCount(int Count){
		duckCount=Count;
	}
*/}
