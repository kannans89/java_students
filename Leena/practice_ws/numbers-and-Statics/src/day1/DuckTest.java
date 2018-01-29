package day1;


public class DuckTest {

	public static void main(String[] args) {
		
		Duck duckObject1=new Duck();
		Duck duckObject2=new Duck();
		Duck duckObject3=new Duck();
		
		duckObject1.setSize(20);
		Display(duckObject1);
		duckObject2.setSize(30);
		Display(duckObject2);
		duckObject3.setSize(40);
		Display(duckObject3);
	}
	
	public static void Display(Duck duck){
		System.out.println("Current Size is :"+duck.getSize());
		System.out.println("Current Count is :"+duck.getCount());
			}

}
