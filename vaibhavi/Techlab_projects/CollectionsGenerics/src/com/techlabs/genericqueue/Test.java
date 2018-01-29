package com.techlabs.genericqueue;



public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericQueue<String> myQueue=new GenericQueue<String>();
		myQueue.push("A");
        myQueue.push("B");
        myQueue.push("c");
        myQueue.pull();
        
      for(String items:myQueue)
      {
    	  System.out.println(items);
      }
    
        
      

}
}
