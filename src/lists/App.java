package lists;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		ArrayList<String> words = new ArrayList<>();
		words.add("Hello");
		words.add("World");
		words.add("!");

		System.out.println(words);

//		words.remove("!");
//		words.remove(1);
//		System.out.println(words);

		for (int i = 0; i < words.size(); i++) {
			System.out.println("I: " + i + " Word: " + words.get(i));
		}

		ArrayList<Integer> nums = new ArrayList<>();
		for (int i = 1; i <= 20; i++) {
			nums.add(i * 2);
		}
		System.out.println(nums);

		for (Integer num : nums) {
			System.out.println("Num: " + num);
		}
	}
}
