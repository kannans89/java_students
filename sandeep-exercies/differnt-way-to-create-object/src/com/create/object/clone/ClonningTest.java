package com.create.object.clone;


public class ClonningTest {
   public static void main(String[] args) throws CloneNotSupportedException {
	Worker w=new Worker("sandeep",89);
	Worker w1 =(Worker)w.clone();
	System.out.println(w.hashCode());
	System.out.println(w1.hashCode());
}
}
