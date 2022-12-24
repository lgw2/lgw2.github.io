package day30;

import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
	
	public static void main(String args[]) {
		String[] arr = {"Alice", "Bob", "Charlie", "Daryl", "Effie"};
		List<String> names =  Arrays.asList(arr);
		System.out.println(Collections.max(names));
		System.out.println(Collections.min(names));
		Collections.shuffle(names);
		System.out.println(names);
		
		ArrayList<Integer> ints = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			ints.add(i);
		}
		System.out.println(ints);
		Integer[] iArray = ints.toArray(new Integer[0]);
		
		Iterator<String> it = names.iterator();
		System.out.println(it.next());
		
		
		
		
		
		
	}

}
