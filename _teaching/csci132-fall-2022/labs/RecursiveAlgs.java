package lab12_starter;

import java.util.Arrays;

public class RecursiveAlgs {
	
	public static boolean binarySearch(int[] data, int target) {
		// TODO: replace false with a call to your private binarySearch method with additional parameters
		// and write that method
		return false;
	}
	
	public static int recursiveMultiply(int m, int n) {
		// TODOD: implement this method
		return 0;
	}
	
	public static void main(String args[]) {
		
		// build a big array that is sorted
		int[] arr = new int[100000];
		for (int i = 0; i < 100; i++) {
			arr[i] = i;
		}
		for (int i = 100; i < 1000; i++) {
			arr[i] = 2*i+1;
		}
		for (int i = 1000; i < 10000; i++) {
			arr[i] = 3*i + 5;
		}
		for (int i = 10000; i < 100000; i++) {
			arr[i] = 4*i;
		}
		
		// test binary search
		System.out.println(binarySearch(Arrays.copyOf(arr, 1), 0));
		System.out.println("0 in [0] is true");
		System.out.println(binarySearch(Arrays.copyOf(arr, 100), 100));
		System.out.println("100 in [0,...,99] is false");
		System.out.println(binarySearch(Arrays.copyOf(arr, 100), 77));
		System.out.println("77 in [0,...,99] is true");
		System.out.println(binarySearch(Arrays.copyOf(arr, 1000), 4));
		System.out.println("4 in the length 1000 array is true");
		System.out.println(binarySearch(Arrays.copyOf(arr, 1000), 5004));
		System.out.println("5004 in the length 1000 array is false");
		System.out.println(binarySearch(Arrays.copyOf(arr, 10000), 2001));
		System.out.println("2001 in the length 10000 array is false");
		System.out.println(binarySearch(Arrays.copyOf(arr, 10000), 16301));
		System.out.println("16301 in the length 10000 array is true");
		System.out.println(binarySearch(Arrays.copyOf(arr, 10000), -1));
		System.out.println("-1 in the length 10000 array is false");
		System.out.println(binarySearch(Arrays.copyOf(arr, 100000), 4));
		System.out.println("4 in the length 100000 array is true");
		System.out.println(binarySearch(Arrays.copyOf(arr, 100000), 200000));
		System.out.println("200000 in the length 100000 array is true");
		System.out.println(binarySearch(Arrays.copyOf(arr, 100000), 4438923));
		System.out.println("4438923 in the length 100000 array is false");

		// test multiply
		System.out.println();
		System.out.println("5 times 4 is " + recursiveMultiply(5, 4));
		System.out.println("1 times 7 is " + recursiveMultiply(1, 7));
		System.out.println("9 times 10 is " + recursiveMultiply(9, 10));


	}

}
