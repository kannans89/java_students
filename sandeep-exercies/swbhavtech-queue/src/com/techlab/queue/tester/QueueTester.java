package com.techlab.queue.tester;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import com.techlab.queue.stack.SwabhavStack;
import com.techlab.queue.student.Student;
import com.techlab.queue.swabhav.SwabhavQueue;

public class QueueTester implements Runnable{

	public static void main(String[] args) {
		SwabhavQueue<Integer> q = new SwabhavQueue<Integer>();

		System.out.println("adding element:");
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		printInfo(q);

		System.out.println("size: " + q.size());

		System.out.println("dequeue element: " + q.dequeue());

		System.out.println("clear element:");
		q.clear();
		printInfo(q);

		Student s1 = new Student(1, "sandeep", "gade");
		Student s2 = new Student(2, "akshay", "patil");
		Student s3 = new Student(3, "sanjay", "sharma");

		SwabhavQueue<Student> q1 = new SwabhavQueue<Student>();
		System.out.println("adding element:");
		q1.enqueue(s1);
		q1.enqueue(s2);
		q1.enqueue(s3);
		printDetails(q1);

		System.out.println("size: " + q1.size());

		System.out.println("dequeue element: ");
		q1.dequeue();
		printDetails(q1);

		System.out.println("clear element:");
		q1.clear();
		printDetails(q1);
		
		SwabhavStack<Student> stack= new SwabhavStack<Student>();
		stack.push( s1);
		stack.push(s2);
		stack.push( s3);
		printDetails(stack);
		stack.peek();
		printDetails(stack);
		stack.pop();
		printDetails(stack);
		
		Runnable r= (Runnable) new Student(0, null, null);
		
		Thread t = new Thread(r);
		t.start();
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(3);
		Collections.sort(a);
		

	}

	public static void printInfo(SwabhavQueue<Integer> q) {
		for (int i : q) {
			System.out.println(i);
		}
		System.out.println();
	}

	public static void printDetails(SwabhavQueue<Student> l) {
		for (Student i : l) {
			System.out.println(i.getBatchNo() + " " + i.getFirstName() + " " + i.getLastName());
		}
		System.out.println();
	}
	
	public static void printDetails(SwabhavStack<Student> l) {

		for (Student i : l) {
			System.out.println(i.getBatchNo() + " " + i.getFirstName() + " " + i.getLastName());

		}
		System.out.println();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}