package com.prctice.day2;

public class AnimalTestDrive {

	public static void main(String[] args) {
		
		MyAnimalList list=new MyAnimalList();
		Cat c=new Cat();
		Wolf w=new Wolf();
		list.add(c);;
		list.add(w);
		
		/*if(c.equals(w)){
			System.out.println("TRUE");
		}
		else{
			System.out.println("FALSE");
		} */
		
		/*System.out.println("Class of C object is : "+c.getClass());
		System.out.println("Class of C object is : "+w.getClass());*/
		
		/*System.out.println("Hash code of cat object :"+c.hashCode());
		System.out.println("Hash code of Wolf object :"+w.hashCode()); */
		
		System.out.println("using toString for Cat object : "+c.toString());
		System.out.println("using toString for Wolf object : "+w.toString());
	}

}
