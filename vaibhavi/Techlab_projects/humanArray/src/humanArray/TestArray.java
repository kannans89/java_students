package humanArray;

public class TestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Human[] human={new Human("Vaibhavi",5,50), new Human("Ashmita",6,60)};
		printHuman(human);
		
		
	}
	
	public static void printHuman(Human[] h)
	{
		for(Human hu:h)
		{
			System.out.println("Name:" +hu.getName() +"Height:" +hu.getHeight());
			
		}
		
	}

}
