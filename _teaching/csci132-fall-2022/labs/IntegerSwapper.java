package lab6;

import java.util.Arrays;

/*
 * Part 1: 
 * Make a Movie class with...
 * fields: String title, and Integer year
 * methods: getTitle() returns a String, getYear() returns an int, toString returns a string.
 * constructor: to set both title and year
 * 
 * Part 2:
 * Change the provided IntegerSwapper to a class called GenericSwapper that can swap elements from
 * any sort of array of objects, regardless of type. Test with Integers, Strings, and Movies. 
 * Add exception handling so that the GenericSwapper catches ArrayIndexOutOfBoundsExceptions.
 * 
 * Part 3:
 * Demonstrate GenericSwapper on Integer arrays (already in the code), String arrays, and Movie
 * arrays. Also demonstrate the exception handling.
 */


// TODO make this generic... Rename this file GenericSwapper, then complete the following...
public class IntegerSwapper {

	// swaps integers a and b in the data array
	// TODO make it swap object a and b in the data array
	public static void swap(Integer[] data, int a, int b) {
		// TODO use exception handling in case a or b is out of bounds
		// in that case, print a nice error message
		
		int temp = data[a];
		data[a] = data[b];
		data[b] = temp;
 
	}

	public static void main(String[] args) {

		System.out.println("Trying swap on an array of Integers:");
		
		Integer[] myIntegers = new Integer[10];
		for (int i = 0; i < myIntegers.length; i++) {
			myIntegers[i] = (i + 1) * 5;
		}
		System.out.println(Arrays.toString(myIntegers));

		// TODO uncomment when GenericSwapper is working
//		GenericSwapper.swap(myIntegers, 0, 9);
//		System.out.println(Arrays.toString(myIntegers));
		
		
		// TODO make the swap() method generic as described above, then:

		System.out.println("\nTrying swap on an array of Strings:");
		// TODO test with an array of Strings...

		// TODO test with an array of Movies...
		System.out.println("\nTrying swap on an array of Movies:");
		
		
		// TODO write a test on an array of any type that generates an array out of bounds exception
		System.out.println("\nTrying swap with an out of bounds array index");





	}

}
