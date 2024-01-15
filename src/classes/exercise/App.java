package classes.exercise;

public class App {

	public static void main(String[] args) {

		Person info = new Person();
		info.name = "Craig";
		info.age = 39;
		info.Gender = "Male";
		info.Team = "Everton";

		Person info2 = new Person();
		info2.name = "Anna";
		info2.age = 30;
		info2.Gender = "Female";
		info2.Team = "Man Utd";

		Person info3 = new Person();
		info3.name = "Adele";
		info3.age = 25;
		info3.Gender = "Female";
		info3.Team = "Barcelona";

		Person info4 = new Person();
		info4.name = "Mike";
		info4.age = 35;
		info4.Gender = "Male";
		info4.Team = "Leeds";

		info.intro();
		info2.intro();
		info3.intro();
		info4.intro();
	}
}
