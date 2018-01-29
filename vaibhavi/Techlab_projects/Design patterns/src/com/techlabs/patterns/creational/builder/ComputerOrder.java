package com.techlabs.patterns.creational.builder;

public class ComputerOrder {
	
	public ComputerOrder(Builder builder) {
		
		this.ram=builder.ram;
		this.hardDisk=builder.hardDisk;
		this.processor=builder.processor;
	}


	private final String ram;
	private final String hardDisk;
	private final String processor;
	
	
	public static class Builder
	{
		private String ram;
		private String hardDisk;
		private String processor;
		
		public Builder ram(String ram)
		{
			this.ram=ram;
			return this;
		}
		
		public Builder hardDisk(String hardDisk)
		{
			this.hardDisk=hardDisk;
			return this;
		}
		
		public Builder processor(String processor)
		{
			this.processor=processor;
			return this;
		}
		
		public ComputerOrder build()
		{
			return new ComputerOrder(this);
		}
		
		
		
		
	}


	public String getRam() {
		return ram;
	}


	public String getHardDisk() {
		return hardDisk;
	}


	public String getProcessor() {
		return processor;
	}

}
