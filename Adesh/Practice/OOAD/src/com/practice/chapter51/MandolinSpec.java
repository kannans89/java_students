package com.practice.chapter51;

import com.practice.chapter1.Builder;
import com.practice.chapter1.Type;
import com.practice.chapter1.Wood;

public class MandolinSpec extends InstrumentSpec{
	
	private Style style;

	public MandolinSpec(Builder builder, String model, Type type, Wood topWood,
			Wood backWood, Style style) {
		super(builder, model, type, backWood, backWood);
		this.style = style;
	}
	public Style getStyle() {
		return style;
	}

	public boolean matches(MandolinSpec otherSpec) {
		if(!super.matches(otherSpec))
			return false;
		if(!(otherSpec instanceof MandolinSpec))
			return false;
		MandolinSpec spec = (MandolinSpec)otherSpec;
		if (!style.equals(spec.style))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "style = " + style;
	}


}
