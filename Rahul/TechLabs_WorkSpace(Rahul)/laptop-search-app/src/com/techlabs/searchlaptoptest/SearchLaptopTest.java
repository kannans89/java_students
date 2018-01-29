package com.techlabs.searchlaptoptest;

import java.util.List;

import com.techlabs.laptop.Brand;
import com.techlabs.laptop.HardDiskSize;
import com.techlabs.laptop.Laptop;
import com.techlabs.laptop.LaptopConfiguration;
import com.techlabs.laptop.Processor;
import com.techlabs.laptop.RamSize;
import com.techlabs.laptop.Size;
import com.techlabs.store.Store;

public class SearchLaptopTest {

	public static void main(String[] args) {

		Store storeobject = new Store();
		setupStore(storeobject);
		LaptopConfiguration whatCustomerWants = new LaptopConfiguration(
				Brand.SAMGSUNG, RamSize.FOUR_GB, HardDiskSize.FiveHundred_GB,
				Processor.INTEL_i3, Size.SMALL);
		
		List<Laptop> suggessions = storeobject.searchLaptop(whatCustomerWants);
		if(!suggessions.isEmpty()){
		System.out.println(" Dear Customer Following are some Suggetion for You :-- ");
		for(Laptop currentlaptop : suggessions){
			System.out.println("Serial Number :"+currentlaptop.getlaptopSerialNumber());
			System.out.println("Model Number :"+currentlaptop.getlaptopModelNumber());
			System.out.println("Brand :"+(currentlaptop.getLaptopConfiguration()).getlaptopBrand());
			System.out.println("Size :"+(currentlaptop.getLaptopConfiguration()).getlaptopSize());
			System.out.println("Price :"+currentlaptop.getlaptopPrice());
			System.out.println("=====================================================================");
			System.out.println("");

		}
		}else
		{
			System.out.println("Sorry No Such Laptop's are available for Now");
		}

	}

	public static void setupStore(Store storeobject) {

		storeobject.addLaptop(1001, "A001", 35000, Brand.HP, RamSize.TWO_GB,
				HardDiskSize.TWOFIFTY_GB, Processor.AMD_X1, Size.MEDIUM);

		storeobject.addLaptop(1002, "X252", 49000, Brand.SONY, RamSize.FOUR_GB,
				HardDiskSize.FiveHundred_GB, Processor.INTEL_i5, Size.MEDIUM);

		storeobject.addLaptop(1003, "X253", 51000, Brand.SONY, RamSize.FOUR_GB,
				HardDiskSize.FiveHundred_GB, Processor.INTEL_i5, Size.MEDIUM);

		storeobject.addLaptop(1004, "Z752", 31000, Brand.SONY, RamSize.ONE_GB,
				HardDiskSize.FiveHundred_GB, Processor.INTEL_i5, Size.MEDIUM);

		storeobject.addLaptop(1005, "Z755", 31800, Brand.SONY, RamSize.ONE_GB,
				HardDiskSize.FiveHundred_GB, Processor.AMD_A8, Size.MEDIUM);

		storeobject.addLaptop(1006, "X252", 49000, Brand.SONY,
				RamSize.EIGHT_GB, HardDiskSize.TWO_TB, Processor.INTEL_i5,
				Size.BIG);

		storeobject.addLaptop(1007, "D1", 24000, Brand.ACER, RamSize.TWO_GB,
				HardDiskSize.ONE_TB, Processor.INTEL_ATOM, Size.SMALL);

		storeobject.addLaptop(1008, "XA500", 31000, Brand.DELL,
				RamSize.FOUR_GB, HardDiskSize.FiveHundred_GB,
				Processor.INTEL_i3, Size.SMALL);

		storeobject.addLaptop(1009, "XA501", 38000, Brand.DELL,
				RamSize.FOUR_GB, HardDiskSize.FiveHundred_GB,
				Processor.INTEL_i3, Size.SMALL);

		storeobject.addLaptop(1010, "XA771", 41000, Brand.DELL,
				RamSize.FOUR_GB, HardDiskSize.FiveHundred_GB,
				Processor.INTEL_i3, Size.SMALL);

		storeobject.addLaptop(1011, "XA800", 28000, Brand.DELL,
				RamSize.FOUR_GB, HardDiskSize.FiveHundred_GB,
				Processor.INTEL_i3, Size.SMALL);

		storeobject.addLaptop(1012, "AD811", 36880, Brand.LENOVO,
				RamSize.FOUR_GB, HardDiskSize.TWO_TB,
				Processor.INTEL_CORE_2_DUO, Size.BIG);

		storeobject.addLaptop(1013, "K001", 92811, Brand.MACBOOK,
				RamSize.SIXTEEN_GB, HardDiskSize.TWO_TB, Processor.AMD_i7,
				Size.MEDIUM);

		storeobject.addLaptop(1014, "J982", 15000, Brand.ASUS, RamSize.ONE_GB,
				HardDiskSize.FiveHundred_GB, Processor.INTEL_ATOM, Size.SMALL);

	}

}
