package array;

public class Array {

	public static void main(String[] args) {
		

//		create array length
		int num = 0;
		int[] nums = new int[10];

		// prints location in array
		System.out.println("9: " + nums[9]);

//		add to array		
		nums[3] = 17;

//		print out all array		
		for (int i = 0; i < nums.length; i++) {
			System.out.println("I: " + i + " = NUM: " + nums[i]);
		}

		String[] words = { "Jordan", "Cameron", "Andrew", "Piers", "Jenny" };
		for (int i = 0; i < words.length; i++) {
			System.out.println("I: " + i + " = WORD: " + words[i]);
		}

//		EXERCISE

		int[] numbs = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		for (int i = 0; i < numbs.length; i++) {
			System.out.println("I: " + i + " = NUMBS " + numbs[i]);
		}

//		array x 10
		int[] numbs2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		for (int i = 0; i < numbs2.length; i++) {
			numbs2[i] *= 10;
			System.out.println("Array x 10:" + numbs2[i]);}

		}	
		
}
