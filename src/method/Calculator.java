package method;

public class Calculator {
	
	
	public static double plus (double a, double b) {
		return (a + b);
	}
	public static double minus (double a, double b) {
		return (a - b);
	}
	public static double divide (double a, double b) {
		return (a / b);
	}
	public static double mult (double a, double b) {
		return (a * b);
	}
	
	public static void main(String[] args) {
		System.out.println(plus (10, 5));
		System.out.println(minus (10, 5));
		System.out.println(divide (10, 5));
		System.out.println(mult (10, 5));			
		
		System.out.println(plus (1, 2) * (mult(2, 2)));		
	}
			
}