package com.prctice.day1;

class Echo {
	int count = 0;

	void hello() {
		System.out.println("Hellloooooo.....");
	}
}

public class EchoTestDrive {

	public static void main(String[] args) {
		Echo e1 = new Echo();
		Echo e2=new Echo();
		int x=0;
		while(x<4){
			e1.hello();
			e1.count=e1.count+1;
			
			if(x==3){
				e2.count=e2.count+1;
			}
			
			if(x>0){
				e2.count=e2.count+e1.count;
			}
			x=x+1;
		}
		
		System.out.println("Count of e1 Is : "+e1.count);
		System.out.println("Count of e2 is : "+e2.count);
	}

}
