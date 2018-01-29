package testHuman;

import Human.*;

public class TestHuman {

	public static void main(String s[]) {
		Human[] human=new Human[3];
		human[0] = new Human("Pratibha", 22, GenderType.FEMALE);
		human[1] =new Human("Shweta",21,GenderType.FEMALE,5.4f,40f);
		human[2] =new Human("Akshay",21,GenderType.MALE, 5.7f, 54f);
		Human h1=new Human("Indu", 22, GenderType.FEMALE, 5.5f, 50f);
		printInfo(human);
		printInfo(h1);
		h1.play();
		printInfo(h1);
		h1.eat();
		printInfo(h1);
		
		
	}

	public static void printInfo(Human d) {
		System.out.println("Name:" + d.getName());
		System.out.println("Age:" + d.getAge());
		System.out.println("Gender:" + d.getGenderType());
		System.out.println("Height:"+d.getHeight());
		System.out.println("Weight:"+d.getWeight());
		System.out.println();
	}
	public static void printInfo(Human d[]) {
		for(Human person: d){
			printInfo(person);
		}
	}

}
