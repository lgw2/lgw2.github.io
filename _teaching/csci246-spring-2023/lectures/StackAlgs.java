package day29;

import java.util.Arrays;
import java.util.Stack;

public class StackAlgs {
	
	public static<E> void reverse(E[] a) {
		Stack<E> buffer = new Stack<E>();
		for (int i=0; i < a.length; i++) {
			buffer.push(a[i]);
		}
		for (int i=0; i < a.length; i++) {
			a[i] = buffer.pop();
		}
		
	}
	
	public static boolean isMatched(String expression) {
		Stack<Character> buffer = new Stack<Character>();
		for (char c: expression.toCharArray()) {
			if (c == '(') {
				buffer.push('(');
			} else if (c == ')') {
				if (buffer.isEmpty()) return false;
				buffer.pop();
			}
		}
		return buffer.isEmpty();
	}

	public static void main(String[] args) {
		Integer[] a = {4, 6, 8, 10};
		String[] s = {"cat", "dog", "mouse"};
		System.out.println("a = " + Arrays.toString(a));
		System.out.println("s = " + Arrays.toString(s));
		System.out.println("Reversing...");
		reverse(a);
		reverse(s);
		System.out.println("a = " + Arrays.toString(a));
		System.out.println("s = " + Arrays.toString(s));
		
		System.out.println(isMatched("(10 + 5 (8 + 2) + (7 * 5) * 10)"));
	}

}
