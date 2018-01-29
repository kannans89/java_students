package com.practice.chapter51;

import com.practice.chapter1.Builder;
import com.practice.chapter1.Type;
import com.practice.chapter1.Wood;

public abstract class InstrumentSpec {

	private Builder builder;
	private String model;
	private Type type;
	private Wood backWood, topWood;

	public InstrumentSpec(Builder builder, String model, Type type, Wood topWood,
			Wood backWood) {
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.backWood = backWood;
		this.topWood = topWood;
	}

	public Builder getBuilder() {
		return builder;
	}

	public String getModel() {
		return model;
	}

	public Type getType() {
		return type;
	}

	public Wood getBackWood() {
		return backWood;
	}

	public Wood getTopWood() {
		return topWood;
	}

	public boolean matches(InstrumentSpec otherSpec) {
		if (builder != otherSpec.builder)
			return false;
		if ((model != null) && (!model.equals(""))
				&& (!model.equals(otherSpec.model)))
			return false;
		if (type != otherSpec.type)
			return false;
		if (backWood != otherSpec.backWood)
			return false;
		if (topWood != otherSpec.topWood)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "InstrumentSpec [builder=" + builder + ", model=" + model
				+ ", type=" + type + ", backWood=" + backWood + ", topWood="
				+ topWood;
	}

}
