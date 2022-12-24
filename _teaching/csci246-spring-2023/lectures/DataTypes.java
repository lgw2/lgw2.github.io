package day2;

public class DataTypes {

	public static void main(String[] args) {
		// this is an inline comment
		
		/*
		 * This is a block comment.
		 */
		
		boolean flag = true;
		boolean verbose, debug;		// two variables declared but not yet initialized
		char grade = 'A';
		byte b = 12;
		short s = 24;
		int i, j, k = 257; 			// three variables declared; only k initialized
		double e = 2.71, a = 2.0;	// both variables initialized
		
		// set i and j
		i = 3;
		j = 20;
		j = 50;
		
		System.out.println(flag);
		System.out.println(grade);
		System.out.println(e);
		
		// how do I store whatever i + j is in a variable called result?
		int result = i + j;
		System.out.println(result);
		
		// Strings are objects
		
		String name = "Joe";
		int len = name.length();
		System.out.println(len);
		System.out.println(name.charAt(0));
		
		// let's look at the documentation for String
		// in pairs or small groups, look up a String method, test it out,
		// and be ready to share

	}

}
