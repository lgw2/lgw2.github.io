package day5;

public class Counter {
	
	// fields
	private int count;	
	
	// constructors
	public Counter() {}
	public Counter (int initial) { 
		this.count = initial; 
	}
	
	// methods
	public int getCount() { 
		return count; 
	}
	public void increment() { 
		count++;
	}
	// use variable name count
	// try without this and with this
	public void increment(int count) { 
		this.count += count; 
	}
	public void reset() { count = 0; }
	// add another method that takes in another Counter and
	// adds its count to this one's
	
	public void add(Counter other) { 
		count += other.count;
	}

}