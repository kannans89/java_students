package com.practice.patterns.creational.builder.ex1.test;

import com.practice.patterns.creational.builder.ex1.Computer;

public class TestComputer {
	public static void main(String args[]){
	
	Computer.ComputerBuilder builder = new Computer.ComputerBuilder();
	builder.setRam("2 GB")
	.setProcessor("Intel")
	.setHdd("WD")
	.setMotherBoard("Intel");
	
	Computer comp = builder.BuildComputer();
	System.out.println("Ram = "+comp.getRam());
	System.out.println("Processor = "+comp.getProcessor());
	System.out.println("HDD = "+comp.getHdd());
	System.out.println("MotherBoard = "+comp.getMotherBoard());
  }
}
