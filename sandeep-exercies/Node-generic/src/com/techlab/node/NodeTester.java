package com.techlab.node;

public class NodeTester {
	public static void main(String[] args) {

		Student s1 = new Student(1, "sandeep", "gade");
		Student s2 = new Student(2, "akshay", "patil");
		Student s3 = new Student(3, "sanjay", "sharma");
/*
		Node<Student> n1 = new Node<Student>(null, s1);
		Node<Student> n2 = new Node<Student>(n1, s2);
		Node<Student> n3 = new Node<Student>(n2, s3);
		printInfo(n3);
	*/	
		Node<Integer> n4 = new Node<Integer>(null, 1);
		Node<Integer> n5 = new Node<Integer>(n4, 2);
		Node<Integer> n6 = new Node<Integer>(n5, 3);
		printInfo1(n6);
		
		
	}

	public static void printInfo(Node<Student> n) {
		while (n != null) {
			System.out.println(
					n.getData().getBatchNo() + " " + n.getData().getFirstName() + " " + n.getData().getLastName());
			n = n.getNext();
		}
	}
	
	public static void printInfo1(Node<Integer> n) {
		while (n != null) {
			System.out.println(n.getData());
			n = n.getNext();
		}
		
		
	}
}
