package com.practice.patterns.creational.builder.ex1;

public final class Computer {
	private final String ram;
	private final String processor;
	private final String hdd;
	private final String motherBoard;
	
	private Computer(ComputerBuilder builder){
		this.ram = builder.ram;
		this.processor = builder.processor;
		this.hdd = builder.hdd;
		this.motherBoard = builder.motherBoard;
	}

	public String getRam() {
		return ram;
	}

	public String getProcessor() {
		return processor;
	}

	public String getHdd() {
		return hdd;
	}

	public String getMotherBoard() {
		return motherBoard;
	}
	
	public static class ComputerBuilder{
		private String ram;
		private String processor;
		private String hdd;
		private String motherBoard;
		
		public ComputerBuilder setRam(String ram){
			this.ram = ram;
			return(this);
		}
		
		public ComputerBuilder setProcessor(String processor){
			this.processor = processor;
			return (this);
		}
		
		public ComputerBuilder setHdd(String hdd){
			this.hdd = hdd;
			return (this);
		}
		
		public ComputerBuilder setMotherBoard(String motherBoard){
			this.motherBoard = motherBoard;
			return (this);
		}
		
		public Computer BuildComputer(){
			return new Computer(this);
		}
	}
}
