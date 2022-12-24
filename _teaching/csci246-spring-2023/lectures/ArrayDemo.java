package day3;

import java.util.Scanner; // look at documentation

public class ArrayDemo {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); // notice the new keyword
		// System.in is telling the Scanner to get its input from the keyboard
		System.out.println("Type your first name:");
		String name = input.next();
		System.out.println("You typed " + name); // Notice the + operator works on strings
		

		/*
		 * In Python:
		 * for n in range(10):
		 *     print(n)
		 */
		
		// from 0 to 8 by 1
		for (int i = 0; i < 10 ; i+=2) {
			System.out.println(i);
		}
		// from 10 to 0 by 2
		
		// two ways to make arrays: curly brackets and new operator
		double[] highs = {85.6, 67.02, 94.55};
		double[] lows = new double[3];
		lows[0] = 56.1;
		lows[1] = 45.0;
		lows[2] = 67.333;
		// java lets you declare an array before assigning to it
		double[] avg;
		// avg[1] = highs[1]/lows[1]; // not gonna work
		
		// Array of groceries
		String[] myGroceries = {"oat milk", "rice", "oreos"};
		System.out.println(myGroceries[2]);
		
		// two ways to iterate through myGroceries
		// regular for loop
		for (int i = 0; i < myGroceries.length; i++) {
			System.out.println(myGroceries[i]);
		}
		
		// enhanced for loop
		for (String item : myGroceries) {
			System.out.println(item);
		}
		
		
		// with your partner, get 5 integers from the user and store them in an array.
		// hint: nextInt() is the method for Scanners that gets integers

		// close the scanner
		input.close();
		
		

	}

}
