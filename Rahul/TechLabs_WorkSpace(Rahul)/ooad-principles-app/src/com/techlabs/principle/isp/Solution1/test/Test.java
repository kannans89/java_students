package com.techlabs.principle.isp.Solution1.test;

import com.techlabs.principle.isp.Solution1.IWorker;
import com.techlabs.principle.isp.Solution1.Manager;
import com.techlabs.principle.isp.Solution1.Programmer;
import com.techlabs.principle.isp.Solution1.Robot;

public class Test {

	public static void main(String[] args) {
		IWorker programmer = new Programmer();
		IWorker manager = new Manager();
		IWorker robot = new Robot();
		atCafeteria(programmer);
		atCafeteria(manager);
		atCafeteria(robot);
		atWorkPlace(programmer);
		atWorkPlace(robot);
		atWorkPlace(manager);
		
	}
	public static void atCafeteria(IWorker currectWorker){
		try{
		currectWorker.eat();
		}
		catch(Exception ex){
			System.out.println(ex.getMessage());
		}
	}
	public static void atWorkPlace(IWorker currectWorker){
		currectWorker.work();
		
	}
	

}
