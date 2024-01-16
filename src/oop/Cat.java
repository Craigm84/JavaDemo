package oop;

public class Cat {

	private String name;
	private String breed;
	private int age;
	private String colour;

//	the 3 constructors below can be used together

	public Cat(String name, String breed, int age, String colour) {
		setName(name); // this.name = name; use either
		setBreed(breed); // this.breed = breed; use either
		setAge(age); // this.age = age; use either
		setColour(colour); // this.colour = colour; use either

	}

	public Cat(String name, String breed) {
		setName(name); // this.name = name; use either
		setBreed(breed); // this.breed = breed; use either
	}

	public Cat() {

	}

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
