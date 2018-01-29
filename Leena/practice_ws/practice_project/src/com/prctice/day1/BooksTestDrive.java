package com.prctice.day1;

class Books{
	String title;
	String Author;
}

public class BooksTestDrive {

	public static void main(String[] args) {
		Books[] myBooks=new Books[3];
		int index=0;
		myBooks[0]=new Books();
		myBooks[1]=new Books();
		myBooks[2]=new Books();
		myBooks[0].title="the Grapes of Java ";
		myBooks[1].title="The java Gatsby ";
		myBooks[2].title="The Java Cookbook ";
		myBooks[0].Author=" Mr.Bo";
		myBooks[1].Author=" Mr.Sue";
		myBooks[2].Author=" Mr.Ian";
		
		while(index<3){
			System.out.print(myBooks[index].title);
			System.out.print(" By ");
			System.out.println(myBooks[index].Author);
			index=index+1;
			
		}
		
		
		
	}

}
