package com.techlabs.patterns.creational.builder.ex1.test;

import com.techlabs.patterns.creational.builder.ex1.Computer;

public class TestComputer {

	public static void main(String[] args) {
		Computer.ComputerBuilder builder = new Computer.ComputerBuilder();
		builder.setRam("1 GB")
		.setProcessor("Intel Core")
		.setHdd("WD")
		.setHdd("SATA")
		.setMotherBoard("Intel");
		
		Computer comp = builder.buildComputer();
		System.out.println("Ram = "+comp.getRam());
		System.out.println("processor = "+comp.getProcessor());
		System.out.println("Hard Disk = "+comp.getHdd());
		System.out.println("MotherBoard = "+comp.getMotherBoard());
		System.out.println("hashcode = "+System.identityHashCode(comp));
	}

}
