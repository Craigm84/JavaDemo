package oop;

public class App {

	public static void main(String[] args) {
		Cat moggy = new Cat();

		moggy.setName("Tiddles");
		moggy.setBreed("Persian");
		moggy.setAge(12);
		moggy.setColour("Blonde");

		Cat moggy2 = new Cat();

		moggy2.setName("Jess");
		moggy2.setBreed("Post Cat");
		moggy2.setAge(20);
		moggy2.setColour("Black and White");

		Cat moggy3 = new Cat("Stanley", "Domestic Longhair", 14, "White and Brown");
		Cat moggy4 = new Cat("Amber", "Domestic Shorthair");

		moggy2.print();

//		Array of Cats

		Cat[] cats = { moggy, moggy2, moggy3, moggy4 };
		for (Cat cat : cats) { // (for each cat of cats)
			cat.print();
		}

		Dog doggo = new Dog();
		doggo.setName("Harry");
		doggo.setBreed("Jack Russell");
		doggo.setAge(14);
		doggo.setColour("Brown and White");
		doggo.print();

	}

}
