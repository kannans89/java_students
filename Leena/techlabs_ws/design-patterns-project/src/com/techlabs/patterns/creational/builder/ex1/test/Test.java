package com.techlabs.patterns.creational.builder.ex1.test;

import com.techlabs.patterns.creational.builder.ex1.Computer;

public class Test {

	public static void main(String[] args) {
		
		Computer.ComputerBuilder builder=new Computer.ComputerBuilder();
		builder.setRam("4GB")
		.setProcessor("INTEL")
		.setMotherBoard("INTEL")
		.setHDD("1TB");
		Computer computer1=builder.buildComputer();
		
		System.out.println(computer1);
		
	}

}
