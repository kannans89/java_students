package guitar;


public class GuitarSpec {
	private Builder builder;
	private String model;
	private Type type;
	private Wood backWood;
	private Wood topWood;

	public GuitarSpec(Builder builder, String model, Type type,
			Wood backWood,Wood topWood) {
		this.builder = builder;
		this.type = type;
		this.model = model;
		this.backWood = backWood;
		this.topWood=topWood;
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
	public boolean matches(GuitarSpec otherSpec){
		if (builder!=otherSpec.builder)
			return false;
		if((model!=null)&&(!model.equals("")&&(!model.equals(otherSpec.model))))
			return false;
		if(type!=otherSpec.type)
			return false;
		if(backWood!=otherSpec.backWood)
			return false;
		if(topWood!=otherSpec.topWood)
			return false;
		return true;
			
	}

}
