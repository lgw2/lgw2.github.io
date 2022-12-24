package day4;

public class MoreWithDataTypes {

	public static void main(String[] args) {
		// primitive data types: 
		// boolean, char, byte, short, int, long, float, double
		boolean flag = true;
		double temp = 98.6;
		// what is stored? the actual value
		double temp2 = temp;
		System.out.println("temp=" + temp + ", temp2=" + temp2);
		temp2 += 5.3;
		System.out.println("temp=" + temp + ", temp2=" + temp2);
		
		// reference data types: classes
		Counter c = new Counter(5);
		Counter d = c;
		// let's change d
		d.increment();
		System.out.println(d.getCount());
		// what happened to c?
		System.out.println(c.getCount());
		// let's change c
		c.increment(10);
		System.out.println("c=" + c.getCount() + ", d=" + d.getCount());
		
		// bottom line: when we use = to assign primitives to other primitives,
		// the VALUE is copied
		// when we use use = to assign classes to classes,
		// the REFERENCE is copied
		
		// type casting
		System.out.println((int) temp);
		int count = 5;
		System.out.println((float) count);
		
		// implicit
		double dCount = count;
		System.out.println(dCount);
		
		// remember: not dynamically typed
		count = (float) count;
		int year = 2022;
		year = "2022";
		
		
	
	}

}
