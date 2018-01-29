package com.prctice.day1;

class Movie{
	String title;
	String genre;
	int rating;
	
	void playIt(){
		System.out.print("Playing the Movie"+"  "+"Current ");
	}
	
	void display(){
		System.out.print("Movie name is:- "+title+"  "+"Movie genre :- "+genre);
		System.out.println();
	}
}

public class MovieTestDrive {

	public static void main(String[] args) {
		Movie one=new Movie();
		one.title="Gone with the Stock";
		one.genre="Tragic";
		one.rating=-2;
		one.playIt();
		one.display();
		
		Movie two=new Movie();
		two.title="Lost In Cubical Space";
		two.genre="Comedy";
		two.rating=5;
		two.playIt();
		two.display();
		
		Movie three=new Movie();
		three.title="Byte Club";
		three.genre="Tragic But Ultimately uplifting";
		three.rating=127;
		three.display();


	}

	
}
	
	