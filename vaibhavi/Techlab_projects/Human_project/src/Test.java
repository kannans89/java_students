
public class Test {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	     testTostring();
		Human human2=new Human("pankaj",6,60);
     	printHuman(human2);
	    printHuman(new Human("Ashmita",5,55));
		
	}
   public static void printHuman(Human h)
   {
	   System.out.println("Name and height is" + h.getName()+ h.getHeight());
   }
   public static void testTostring()
	{
		Human human1=new Human("vaibhavi",5,50);
		System.out.println(human1);
		
	}
}

