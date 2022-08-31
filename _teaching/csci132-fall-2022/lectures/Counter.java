package day4;

public class Counter {
	
	// fields
	private int count;
	
	// constructors
	public Counter() {}
	public Counter (int initial) { count = initial; }
	
	// methods
	public int getCount() { return count; }
	public void increment() { count++;}
	public void increment(int delta) { count += delta; }
	public void reset() { count = 0; }

}
