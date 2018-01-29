package com.practice.chapter5;

public class Output {
	public void go(){
		int y=7;
		for(int i=1	;i<8;i++){
			y++;
			if(i>4){
				System.out.println(++y +" ");
			}
			if(y>14){
				System.out.println("i = "+i);
				break;
			}
		}

	}

}
