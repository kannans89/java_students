package com.techlabs.patterns.creational.builder.test;

import com.techlabs.patterns.creational.builder.ComputerOrder;

public class Test {

	public static void main(String[] args) {

		ComputerOrder.Builder builder = new ComputerOrder.Builder();
		builder.setHarddisk("500 GB").setRam("2 GB").setProcessor("Intel i7")
				.setMotherboard("AsRock A5");

		ComputerOrder order = builder.build();
		System.out.println("Order Details");
		System.out.println("Hard Disk:" + order.getHarddisk() + "\nProcessor:"
				+ order.getProcessor() + "\nMotherboard:"
				+ order.getMotherboard() + "\nRAM:" + order.getRam());
		
		builder.setHarddisk("80GB");
		System.out.println("Hard Disk:" + order.getHarddisk() + "\nProcessor:"
				+ order.getProcessor() + "\nMotherboard:"
				+ order.getMotherboard() + "\nRAM:" + order.getRam());
		
	}
}
