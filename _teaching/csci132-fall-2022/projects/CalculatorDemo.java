package proj1_starter;

public class CalculatorDemo {

	public static void main(String[] args) {

		Calculator myCalc = new Calculator(); // create a calculator for the demo

		System.out.println("*** Welcome to Calculator ***");
		double number = myCalc.getUserNum(); // get a number from the user & initialize
											 // the number variable
		myCalc.add(number); // make the current number in myCalc equal to the number provided
		String operation = myCalc.getUserOp(); // initialize the operation
		

		// This do-while loop runs at least one time (that's the 'do' part of it)...
		// ...and repeats as long as a condition holds true (that's the 'while' part)
		do {

			if (!operation.equals("=") 
					&& !operation.equals("?")
					&& !operation.equals("c")
					&& !operation.equals("neg")
					&& !operation.equals("%")
					&& !operation.equals("log")
					&& !operation.equals("inv")
					&& !operation.equals("pert")
					) // don't get a number in these cases...
				number = myCalc.getUserNum(); // ... otherwise, go ahead and get user's next number

			myCalc.calculateAnswer(operation, number); // run the calculation
			operation = myCalc.getUserOp(); // get the user's next operation

		} while (!operation.equals("q") && !operation.equals("Q")); // 'Q' to quit
		
		System.out.println("<end>");

	}
	
	
}