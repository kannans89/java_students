package com.techlabs.patterns.creational.builder.ex1;

public class Computer {

	private final String ram;
	private final String processor;
	private final String hardDiskDrive;
	private final String motherBoard;
	
	private Computer(ComputerBuilder builder){
		this.ram=builder.ram;
		this.processor=builder.processor;
		this.hardDiskDrive=builder.hardDiskDrive;
		this.motherBoard=builder.motherBoard;
	}
	
	public String getRam(){
		return ram;
	}
	
	public String getProcessor(){
		return processor;
	}
	
	public String getHDD(){
		return hardDiskDrive;
	}
	
	public String getMotherBoard(){
		return motherBoard;
	}
	
	public static class ComputerBuilder{
		private String ram;
		private String processor;
		private String hardDiskDrive;
		private String motherBoard;
		
		public ComputerBuilder setRam(String ram){
			this.ram=ram;
			return(this);
		}
		
		public ComputerBuilder setProcessor(String processor){
			this.processor=processor;
			return(this);
		}
		
		public ComputerBuilder setHDD(String hdd){
			this.hardDiskDrive=hdd;
			return(this);
		}
		
		public ComputerBuilder setMotherBoard(String motherBoard){
			this.motherBoard=motherBoard;
			return(this);
		}
		
		public Computer buildComputer(){
			return new Computer(this);
		}
		
	}
	
	@Override
	public String toString(){
		return "Hii, you have "+this.getProcessor()+" Core Processor with "+this.getRam()+" Ram having "+this.getHDD()+" Drive & "+this.getMotherBoard()+" motherBoard";
	}
	
}
