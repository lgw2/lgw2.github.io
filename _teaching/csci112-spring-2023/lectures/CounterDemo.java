package day4;

public class CounterDemo {
	
	public static void main(String[] args) {
		Counter c;					// declares a variable; no counter constructed
		c = new Counter(); 			// constructs a counter; assigns its reference to c
		c.increment();				// increases its value by 1
		c.increment();				// increases its value by 3 more
		int temp = c.getCount();	// will be 4
		c.reset();					// value becomes 0
		Counter d = new Counter(5);	// declares and constructs a counter with value 5
		d.increment();				// value becomes 6
		
	}

}
