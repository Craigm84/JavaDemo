package array;

public class Fizzbuzz {
	
	public static void main(String[] args) {
		for (int i = 1; i <= 20; i++) {
			System.out.println(fizzBuzz(i));
		}
	}
	
	public static String fizzBuzz (int num) {
			if (num % 3 == 0 && num % 5 == 0) {
				return "fizzbuzz";
			} else if (num % 3 == 0) {
				return "fizz";
			} else if (num % 5 == 0 && num % 5 == 0) {
				return "buzz";
			} else {
				return "" + num;
			}
		}
		

}
