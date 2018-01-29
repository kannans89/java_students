package com.practice.chapter51;

import com.practice.chapter1.Builder;
import com.practice.chapter1.Type;
import com.practice.chapter1.Wood;

public class GuitarSpec extends InstrumentSpec{
	
	private int numStrings;

	public GuitarSpec(Builder builder, String model, Type type, Wood topWood,
			Wood backWood,int numStrings) {
		super(builder, model, type, backWood, backWood);
		this.numStrings = numStrings;
	}
	public int getNumStrings() {
		return numStrings;
	}

	public boolean matches(InstrumentSpec otherSpec) {
		if(!super.matches(otherSpec))
			return false;
		if(!(otherSpec instanceof GuitarSpec))
			return false;
		GuitarSpec spec = (GuitarSpec)otherSpec;
		if (numStrings != spec.numStrings)
			return false;
		return true;
	}

}
