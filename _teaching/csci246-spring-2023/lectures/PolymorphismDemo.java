package day8;

public class PolymorphismDemo {

	public static void main(String[] args) {
		// make an array of CreditCard objects
		// due to polymorphism, we can put in CreditCard objects or any of its
		// subclasses (parent to child is okay)
		CreditCard[] wallet = new CreditCard[3];
		wallet[0] = new PredatoryCreditCard("John Bowman", "California Savings",
				"5391 0375 9387 5309", 5000, 0, 0.08);
//		wallet[1] = new AirlineCreditCard("John Bowman", "California Federal",
//				"3485 0399 3395 1954", 3500, 0, "Alaska", 0);
		wallet[2] = new CreditCard("John Bowman", "California Finance",
				"5590 4553 5489 3244", 2500, 300);
		
//		// but we can't go the other way (child to parent)
//		// and we can't go sideways either (child to child)
//		PredatoryCreditCard[] wallet2 = new CreditCard[3];
//		wallet2[0] = new PredatoryCreditCard("John Bowman", "California Savings",
//				"5391 0375 9387 5309", 5000, 0, 0.08);
//		wallet2[1] = new AirlineCreditCard("John Bowman", "California Federal",
//				"3485 0399 3395 1954", 3500, 0, "Alaska", 0);
//		wallet2[2] = new CreditCard("John Bowman", "California Finance",
//				"5590 4553 5489 3244", 2500, 300);
		
	}

}
