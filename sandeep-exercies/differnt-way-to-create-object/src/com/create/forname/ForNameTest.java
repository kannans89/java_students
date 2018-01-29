package com.create.forname;


public class ForNameTest {
   public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
	Student c= (Student) Class.forName("com.create.forname.Student").newInstance();
	c.setRollNo(100);
	System.out.println(c.getRollNo());
	
}
}
