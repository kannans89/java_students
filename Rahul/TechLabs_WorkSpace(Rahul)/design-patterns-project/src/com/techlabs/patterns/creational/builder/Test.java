package com.techlabs.patterns.creational.builder;

public class Test {

	public static void main(String[] args) {
		Computer.ComputerBuilder builder = new Computer.ComputerBuilder();
		builder.setRam("Transend")
		        .setProcessor("intel")
		        .setHdd("Kingston")
				.setMotherboard("intel");
		
		Computer system1 = builder.buildComputer();
		System.out.println(system1);

		builder.setRam("Kingston");
		builder.setHdd("Segate");
		builder.setMotherboard("Nvedia");
		builder.setProcessor("AMD");
		Computer system2 = builder.buildComputer();
		System.out.println(system2);

	}

}
