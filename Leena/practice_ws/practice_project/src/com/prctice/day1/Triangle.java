package com.prctice.day1;

public class Triangle {

	double Area;
	int Height;
	int length;
	
	public static void main(String[] args) {
		
		int index=1;
		Triangle[] ta=new Triangle[5];
		while(index<5){
			ta[index]=new Triangle();
			ta[index].Height=(index+1)*2;
			ta[index].length=index+4;
			ta[index].setArea();
			System.out.print("Triangle"+index+", Area");
			System.out.println("= "+ta[index].Area);
			index=index+1;
		}
		int y=index;
		index=27;
		Triangle t5=ta[2];
		ta[2].Area=343;
		System.out.print("y="+y);
		
		//System.out.println(", t5 Height="+t5.Height);
		//System.out.println(", t5 Length="+t5.length);
		System.out.println(", t5 Area="+t5.Area);
	}
	void setArea(){
		Area=(Height*length)/2;
	}

}
