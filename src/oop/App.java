package oop;

public class App {
	
	public static void main(String[] args) {
		Cat moggy = new Cat();
		
		moggy.name = "Tiddles";
		moggy.Breed = "Persian";
		moggy.age = 12;
		moggy.color = "Blonde";
		
		System.out.println(moggy.name);
		System.out.println(moggy.Breed);
		System.out.println(moggy.age);
		System.out.println(moggy.color);
	
		Cat moggy2 = new Cat ();
		
		moggy2.name = "Jess";
		moggy2.Breed = "Post Cat";
		moggy2.age = 60;
		moggy2.color = "Black and White";
		
		System.out.println(moggy2.name);
		System.out.println(moggy2.Breed);
		System.out.println(moggy2.age);
		System.out.println(moggy2.color);
		
		moggy2.sleep();
		moggy2.print();
		
//		Array of Cats
		
		Cat[] cats = {moggy, moggy2};
		for (Cat cat : cats) { //(for each cat of cats)
			cat.print();
		}
		
	}
	
}
