package com.techlabs.patterns.creational.builder;

public class Computer {
	// ivars
	private final String ram;
	private final String processor;
	private final String hdd;
	private final String motherboard;

	// Constructor
	private Computer(ComputerBuilder builder) {

		ram = builder.computerRam;
		processor = builder.computerProcessor;
		hdd = builder.computerHdd;
		motherboard = builder.computerMotherboard;
	}

	// Methods
	public String getRam() {
		return ram;
	}

	public String getProcessor() {
		return processor;
	}

	public String getHdd() {
		return hdd;
	}

	public String getMotherboard() {
		return motherboard;
	}

	// InnerClass
	public static class ComputerBuilder {
		// ivars
		private String computerRam;
		private String computerProcessor;
		private String computerHdd;
		private String computerMotherboard;

		// methods
		public ComputerBuilder setRam(String ram) {
			computerRam = ram;
			return this;
		}

		public ComputerBuilder setProcessor(String processor) {
			computerProcessor = processor;
			return this;
		}

		public ComputerBuilder setHdd(String hdd) {
			computerHdd = hdd;
			return this;

		}

		public ComputerBuilder setMotherboard(String motherboard) {
			computerMotherboard = motherboard;
			return this;
		}

		public Computer buildComputer() {
			return new Computer(this);
		}

		}

	@Override
	public String toString() {
		return "Computer [ram=" + ram + ", processor=" + processor + ", hdd="
				+ hdd + ", motherboard=" + motherboard + "]";
	}
	
		

	}

