package com.techlabs.patterns.creational.builder;

public class ComputerOrder {
	private final String ram;
	private final String harddisk;
	private final String processor;
	private final String motherboard;
	
	private ComputerOrder(Builder builder) {
		this.ram = builder.ram;
		this.harddisk = builder.harddisk;
		this.processor = builder.processor;
		this.motherboard = builder.motherboard;
	}
	
	public String getRam() {
		return ram;
	}

	public String getHarddisk() {
		return harddisk;
	}

	public String getProcessor() {
		return processor;
	}

	public String getMotherboard() {
		return motherboard;
	}


	public static class Builder{
		private String ram;
		private String harddisk;
		private String processor;
		private String motherboard;
		
		public Builder setRam(String ram) {
			this.ram = ram;
			return this;
		}
		public Builder setHarddisk(String harddisk) {
			this.harddisk = harddisk;
			return this;
		}
		public Builder setProcessor(String processor) {
			this.processor = processor;
			return this;
		}
		public Builder setMotherboard(String motherboard) {
			this.motherboard = motherboard;
			return this;
		}
		
		public ComputerOrder build(){
			return new ComputerOrder(this);
		}
		
		
	}

}
