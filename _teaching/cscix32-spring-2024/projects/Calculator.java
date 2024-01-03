package proj1_starter;

import java.util.Scanner;

public class Calculator {

	// FIELDS
	private double answer;
	private Scanner scannedInput = new Scanner(System.in);
	public  String usageInstructions = "Valid operations are: \n"
			+ " + \t add \n - \t subtract \n * \t multiply \n / \t divide \n"
			+ " c \t clear  \n neg \t negate \n % \t percent \n"
			+ " ^ \t raise to power of next value entered \n inv \t invert the current value \n"
			+ " pert \t perturb current value by a small amount \n"
			+ " log \t take the natural logarithm \n" + " = \t print answer \n ? \t Help \n q \t Quit \n";

	// CONSTRUCTORS
	Calculator() {
		this.answer = 0;
	}

	// METHODS
	// prompt user for a double and check before returning
	public double getUserNum() {
		boolean validNumber = false;
		double userVal = 0;

		System.out.print("Enter number\n>>> ");

		while (validNumber == false) {
			if (scannedInput.hasNext("pi")) {
				// TODO: make this a constant instead of 3.1: ROUGLY_PI to five decimal places.
				userVal = 3.1;				
				scannedInput.next();
				validNumber = true;
			} else if (scannedInput.hasNextDouble()) {
				userVal = scannedInput.nextDouble();
				validNumber = true;
			} else {
				System.out.print("That's not a number. \nEnter a valid number\n>>> ");
				scannedInput.next();
			}
		}
		return userVal;
	}

	// prompt user for operation and check before returning
	public String getUserOp() {
		String op;

		System.out.print("Enter operation\n>>> ");
		op = scannedInput.next();
		while (!(this.checkUserOp(op))) {
			op = scannedInput.next();
		}
		return op;
	}

	// private helper method for getUserInput()
	private boolean checkUserOp(String op) {
		if (op.equals("+") || op.equals("-") || op.equals("=") || op.equals("?") || op.equals("Q") || op.equals("q")
				|| op.equals("*") || op.equals("/") || op.equals("c") || op.equals("neg")
				|| op.equals("%") || op.equals("^") || op.equals("inv") || op.equals("pert") || op.equals("log")) {
			return true;
		} else {
			System.out.print("Invalid Entry. Enter '?' for help." + "\nEnter a valid operation \n>>> ");
			return false;
		}
	}

	public double calculateAnswer(String op, double num) {
		switch (op) {
		case "+":
			add(num);
			break;
		case "-":
			subtract(num);
			break;
		case "*":
			// TODO: code in this functionality
			break;
		case "/":
			// TODO: code in this functionality
			break;
		case "c":
			// TODO: code in this functionality
			break;
		case "neg":
			// TODO: code in this functionality
			break;
		case "%":
			// TODO: code in this functionality
			break;
		case "^":
			// TODO: code in this functionality
			break;
		case "inv":
			// TODO: code in this functionality
			break;
		case "pert":
			// TODO: code in this functionality
			break;
		case "log":
			// TODO: code in this functionality
			break;
		case "=":
			printAnswer();
			break;
		case "?":
			System.out.println(this.usageInstructions);
			break;
		default:
			System.out.println("Invalid Operator");
		}
		return this.answer;
	}

	public void add(double operand) {
		this.answer += operand;
	}

	public void subtract(double operand) {
		this.answer -= operand;
	}

	public double getAnswer() {
		return this.answer;
	}

	public void printAnswer() {
		// https://www.homeandlearn.co.uk/java/java_formatted_strings.html

		// TODO: right justify the output (position 15 used in example)
		System.out.println("TODO... FORMAT THIS: " + this.answer);


	}

}
