package day9;

public interface Sellable {
	
	// returns a description of the object
	public String description();
	
	// returns the list price in cents
	public int listPrice();
	
	// returns the lowest price in cents we will accept
	public int lowestPrice();

}
