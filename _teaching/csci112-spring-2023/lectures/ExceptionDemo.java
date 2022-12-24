package day12;

import java.util.Scanner;

public class ExceptionDemo {
	
	public static final int DEFAULT = 1;

	public static void main(String[] args) {
		// get input from user and convert it to an integer
		
		// but what could go wrong?
		
		// the user enters something that can't be parsed as an int (e.g., "twelve")
		Scanner input = new Scanner(System.in);
		int n = DEFAULT;
		
		try {
			System.out.println("Enter an integer:");
			n = Integer.parseInt(input.next());
			if (n <= 0) {
				throw new IllegalArgumentException("That's not positive!");
//				System.out.println("n must be positive. Using default.");
//				n = DEFAULT;
			}
		} catch (NumberFormatException e ) {
			System.out.println("Invalid integer argument. Using default.");
		} 
		catch (IllegalArgumentException e) {
			System.out.println(e);
			n = DEFAULT;
		}
		System.out.println(n);
		input.close();

		
	}

}
