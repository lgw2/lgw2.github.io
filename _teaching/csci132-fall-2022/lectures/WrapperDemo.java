package day12;

public class WrapperDemo {
	
	public static void main(String[] args) {
		// wrapper class demo
		
		int a = 8;
		// wrong:
//		Integer a = new Integer(12);
		Integer b = 12;
		int c = b;		// automatic unboxing
		int d = a + b;	// automatic unboxing
		b = 3 * a;		// automatic boxing
		
		// using wrapper class methods
		
		String x = "-12";
		// can't cast!
//		int y = (int) x;
		int y = Integer.parseInt(x);
		int z = 12;
		// can't cast!
//		String w = (String) z;
		String w = Integer.valueOf(z).toString();
		
		
		
		
		
		
	}

}
