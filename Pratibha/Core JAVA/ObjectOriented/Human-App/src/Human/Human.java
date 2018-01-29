package Human;

public class Human {
	private String name;
	private int age;
	private GenderType gender;
	private float height;
	private float weight;

	public Human(String name, int age, GenderType gender) {
		this(name, age, gender, 0.0f, 0.0f);
	}

	public Human(String name, int age, GenderType gender, float height,
			float weight) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.height = height;
		this.weight = weight;
	}

	public String getName() {
		return name;

	}

	public int getAge() {
		return age;
	}

	public GenderType getGenderType() {
		return gender;
	}

	public float getHeight() {
		return height;
	}

	public float getWeight() {
		return weight;
	}

	public float play() {
		this.height = this.height + .5f;
		System.out.println(this.name + " has played");
		return height;
	}

	public float eat() {
		System.out.println(this.name + " has eat food");
		this.weight = this.weight + 1;
		return weight;
	}
}
