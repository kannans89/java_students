package com.techlabs.collection.stack.test;
import java.util.Iterator;
import com.techlabs.collection.stack.GenericStack;

public class TestGenericStack {

	public static void main(String[] args) {
				GenericStack<Integer> stringStack=new GenericStack<Integer>();
				
				stringStack.push(1);
				stringStack.push(2);
				stringStack.push(5);
				stringStack.push(6);
				
				System.out.println("After push : ");
				//printQueuewithfor(stringStack);
				printStackwithforeach(stringStack);
				
				System.out.println();
				System.out.println("===========================");
				
				stringStack.pop();
				
				System.out.println("After pop : ");
				//printStackwithfor(stringQueue);
				printStackwithforeach(stringStack);
				
				
			}
			
			private static void printStackwithfor(GenericStack<Integer> stack){
				for(Iterator<Integer> cursor=stack.iterator(); cursor.hasNext();){
					System.out.print(cursor.next());
					
				}
			}
			
			private static void printStackwithforeach(GenericStack<Integer> stack){
				for(Integer item:stack){
					System.out.print(item);
				}
			}

	}

