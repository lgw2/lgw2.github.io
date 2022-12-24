package day13;

public class PairDemo {

	public static void main(String[] args) {
		
		// can't use primitives as type parameters
//		Pair<String, double> buy = new Pair<>("TWTR", 45.33);

		Pair<String, Double> buy = new Pair<>("TWTR", 45.33);
		System.out.println(buy);
		
		Pair<Character, Character> socks = new Pair<>('l', 'r');
		System.out.println(socks);


	}

}
