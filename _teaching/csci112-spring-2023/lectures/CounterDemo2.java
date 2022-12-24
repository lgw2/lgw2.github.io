package day5;

public class CounterDemo {
	
	public static void main(String[] args) {
		Counter c;					// declares a variable; no counter constructed
		c = new Counter(); 			// constructs a counter; assigns it to c
		c.increment();				// increases its value by 1
		c.increment(3);				// increases its value by 3 more
		int temp = c.getCount();	// will be 4
		System.out.println(temp);   //4
		c.reset();					// value becomes 0
		c.increment(2);
		int number1 = 4;
		int number2 = 6;
		Counter d = new Counter(5);	// declares and constructs a counter with value 5
		d.increment();				// value becomes 6
		System.out.println(d.getCount()); // 6
		
		d.add(c);
		System.out.println(d.getCount()); // 8
		

		
	}

}