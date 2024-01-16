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

//		moggy2.sleep();
//		moggy2.print();

//		Array of Cats

		Cat[] cats = { moggy, moggy2 };
		for (Cat cat : cats) { // (for each cat of cats)
			cat.print();
		}

	}

}
