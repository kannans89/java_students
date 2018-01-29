package techlab.com.guitar;

public enum Wood {
	ALDER, INDIAN_ROSEWOOD, BRASILIAN_ROSEWOOD, MAHOGANI, MAPLE, COCOBOLA, CEDAR, ADIRONDACK, 
	SITKA;
	public String toString() {
		switch (this) {
		case ALDER:
			return "Alder";
		case INDIAN_ROSEWOOD:
			return "Indian RoseWood";
		case BRASILIAN_ROSEWOOD:
			return "Brasilian RoseWood";
		case MAHOGANI:
			return "Mahogani";
		case MAPLE:
			return "Maple";
		case COCOBOLA:
			return "Cocobola";
		case CEDAR:
			return "Cedar";
		case ADIRONDACK:
			return "Adirondack";
		case SITKA:
			return "Sitka";
		}
		return "";
	}
}
