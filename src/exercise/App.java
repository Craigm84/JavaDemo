package exercise;

public class App {
	public static void main(String[] args) {
		
		byte byt = 36;
		System.out.println(byt);		
		short sht = 290;
		System.out.println(sht);	
		int in = 1_200_000_000;
		System.out.println(in);		
		long lng = 1_234_567_890_000L;
		System.out.println(lng);		
		
		char c = 'a';
		System.out.println(c);		
		String str = "Hello";
		System.out.println(str);		
		
		float flt = 23.58F;
		System.out.println(flt);		
		double dbl = 23.58;
		System.out.println(dbl);		
		
		boolean bln = true;
		System.out.println(bln);
		
		String two = "Hello" + " " + "Craig";
		System.out.println(two);
		
//		byte byt2 = null;
//		System.out.println(byt2); - returns an error
		
		char add2 = 'j' + 'h';
		System.out.println(add2);
//		returns foreign character because treated as char
		
		System.out.println('j' + 'h');
//		returns number due to language and not defined as char
		
//		int dec = 23.58F;
//		System.out.println(dec); - returns an error
		
	}

}
