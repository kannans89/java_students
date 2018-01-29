package com.techlabs.patterns.creational.builder;

public class Test {

	public static void main(String[] args) {

		ComputerOrder.Builder builder=new ComputerOrder.Builder();
		builder.ram("256 Mb ").hardDisk("2 GB ").processor("Intel");
		ComputerOrder order1=builder.build();
		System.out.println(order1.getRam() + order1.getHardDisk() + order1.getProcessor());
		builder.ram("500 mb");
		System.out.println(order1.getRam());
		
		
	}

}
