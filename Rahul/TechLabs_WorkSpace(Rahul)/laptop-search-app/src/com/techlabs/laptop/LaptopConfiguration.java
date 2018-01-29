package com.techlabs.laptop;

public class LaptopConfiguration {
	// Instance variables
	private Brand laptopBrand;
	private RamSize laptopRamSize;
	private HardDiskSize laptopHddSize;
	private Processor laptopProcessor;
	private Size laptopSize;
	//Constructor
	public LaptopConfiguration(Brand brand, RamSize ramSize,
			HardDiskSize hddSize, Processor processor, Size size) {
		laptopBrand = brand;
		laptopRamSize = ramSize;
		laptopHddSize = hddSize;
		laptopProcessor = processor;
		laptopSize = size;
	}
	//Methods
	public Brand getlaptopBrand(){
		return laptopBrand;
	}
	public RamSize getlaptopRamSize() {
		return laptopRamSize;
	}
	public HardDiskSize getlaptopHddSize(){
		return laptopHddSize;
	}
	public Processor getlaptopProcessor(){
		return laptopProcessor;
	}
	public Size getlaptopSize(){
		return laptopSize;
	}
	public boolean matches(LaptopConfiguration requiredLaptopConfiguration){
		if(getlaptopBrand() != requiredLaptopConfiguration.getlaptopBrand())
			return false;
		if(getlaptopRamSize() != requiredLaptopConfiguration.getlaptopRamSize())
			return false;
		if(getlaptopHddSize() != requiredLaptopConfiguration.getlaptopHddSize())
			return false;
		if(getlaptopProcessor() != requiredLaptopConfiguration.getlaptopProcessor())
			return false;
		if(getlaptopSize() != requiredLaptopConfiguration.getlaptopSize())
			return false;
		
		return true;
	}
	

}
