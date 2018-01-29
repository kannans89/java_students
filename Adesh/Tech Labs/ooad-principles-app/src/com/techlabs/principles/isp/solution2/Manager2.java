package com.techlabs.principles.isp.solution2;

public class Manager2 implements IFeedable, IWorkable{

		public void eat() {
			System.out.println("Manager is eating");
		}

		public void work() {
			System.out.println("Manager is working");
		}

	}
