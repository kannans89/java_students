package com.practice.chapter1;

public class PhraseOMatic {

	public static void main(String[] args) {
		//make three sets of words to choose from.
		String setOne[]={"portable","can do it","dedication","24/7"};
		String setTwo[]={"mindspace","aurionpro","practice","desireness"};
		String setThree[]={"things to do","15 august","love","strategy"};
		
		//length of the sets.
		int oneLength=setOne.length;
		int twoLength=setTwo.length;
		int threeLength=setThree.length;
		
		//generate three random nos.
		int rand1=(int)(Math.random() * oneLength);
		int rand2=(int)(Math.random() * twoLength);
		int rand3=(int)(Math.random() * threeLength);
		
		//now build a phrase.
		String phrase=setOne[rand1]+" "+setTwo[rand2]+" "+setThree[rand3];
		
		//print out the phrase.
		System.out.println("what we need is "+phrase);
	}

}
