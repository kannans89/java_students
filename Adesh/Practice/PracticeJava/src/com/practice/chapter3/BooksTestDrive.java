package com.practice.chapter3;

public class BooksTestDrive {

	public static void main(String[] args) {
		Books mb=new Books();
		Books[] myBook=new Books[3];
		
		myBook[0]=new Books();
		myBook[1]=new Books();
		myBook[2]=mb;
		
		myBook[0].title="heads first java";
		myBook[1].title="the grapes of java";
		myBook[2].title="the java gatsby";
		
		myBook[0].author="kathy";
		myBook[1].author="matin";
		myBook[2].author="bob";
		
		int x=0;
		while(x<3){
			System.out.print(myBook[x].title);
			System.out.print(" by ");
			System.out.println(myBook[x].author);
			x=x+1;
		}
	}
}

class Books{
	String title;
	String author;
}
