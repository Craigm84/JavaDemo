package oop;

public class Cat {

	private String name;
	private String breed;
	private int age;
	private String colour;

	void sleep() {
		System.out.println("Zzzz");
	}

	void print() {
		System.out.println(name);
		System.out.println(breed);
		System.out.println(age);
		System.out.println(colour);
	}

	public void setAge(int age) {
		if (age >= 0 && age < 30) {
			this.age = age;
		} else {
			System.out.println("Please provide an age between 0 and thirty");
		}
	}

	public int getAge() {
		return this.age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public String getBreed() {
		return this.breed;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getColour() {
		return this.colour;
	}
}
