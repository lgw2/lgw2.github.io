// the package is the folder your java file is in
// yours may be different depending on what you named it
package lab1;

// see line 27 for an explanation of what this line is doing here
import java.util.Scanner;

// the class name Lab01Example is what I chose to call this program
public class Lab1Example {

	// every executable Java program has this line...
	public static void main(String[] args) {
		
		// now we are on to the lab example... 
		// Start by just running this program to see what it outputs
		// Then read the comments and code from the top down to see why
		
		/********************* INPUT AND OUTPUT *****************************/
		
		// For OUTPUT, you saw that we need a method like this...
		System.out.println("Hello World");
		
		// For INPUT, we need to 'scan' items from the keyboard
		// so let's import the Scanner class from the Java Standard Library...
		// Let's call the Scanner object "input" (We could call it anything)
		// Notice that to create an object, we use a constructor with the new keyword
		Scanner input = new Scanner(System.in);
		
		// prompt the user for some input...
		System.out.println("Type something. ");
		
		// to use our new object, type its name, then dot, then a method
		// put the next thing the user types into a String variable called userInput
		String userInput = input.next();
		
		// just to show that we've got it, let's output it back to the screen
		// Notice the concatenation operator is the plus sign
		System.out.println("You typed " + userInput);

		// when I'm all finished getting input, I can close the Scanner object
		// by using the dot operartor with the close() method like this:
		input.close();
		
		/********************* ARRAYS **********************************/
		
		// Let's put a blank line here to tidy up the output
		System.out.println();
		
		// I'll make an array of 5 integers
		int[] evenNumbers = {2, 4, 6, 8, 10};
		
		// (Note: We declared, defined, and initialized evenNumbers all on one line)
		// here's another way to declare an array, this time broken into parts...

		// first decide the data type and name of the array variable
		// Let's make it an array of Strings, like in lab 01
		// DECLARE:
		String[] dogNames;
		
		// Java doesn't know how may elements dogNames will have in it
		// Before I can use an array, Java need to know how many elements
		// DEFINE:
		dogNames = new String[3]; // three String elements
		
		// Finally, let's put initial values in the array.
		// We'll do this part one-by-one as well by indexing each element
		// INITIALIZE:
		dogNames[0] = "Skippy"; // start indexing with zero
		dogNames[1] = "Fluff Ball"; // index 1 means the second element
		dogNames[2] = "Panda"; // Three elements indexed 0 through 2
		
		// There. Java is holding data for us in a couple of arrays
		// Arrays are basic data structures that can store elements of the same type
		// If we want to get at the data, we use the square brackets and index number
		
		System.out.println("*** Here is the second Dog Name *** ");
		System.out.println(dogNames[1]);
		
		/********************* FOR LOOP **********************************/
		
		// You probably remember in Python you could do loop through a group
		// of items, and run some code "for" the ones you specify. 
		// Java has a couple of ways to do that
		
		// Java's for loop has three parts (start value, while condition, by steps)
		// Here's one way I could print all of the integer in our evenNumbers array
		// notice I make up an integer 'i' variable in the start portion, and 
		// then in the while portion, I keep going while i is less than 3;
		// every time through the for loop, I increment'i' by 1 using the ++ operator
		
		for (int i = 0; i < 3; i++) {
			System.out.println(evenNumbers[i]);
		}
		
		// The 'enhanced for-loop' is a way to step through a collection of items
		// similarly to how you did it in Python. It's also called a 'for-each' loop
		
		for (String name : dogNames) {
			System.out.println(name);
		}
		

	}

}
