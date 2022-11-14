package day33;

public class RecursiveAlgs {
	
	public static int factorial(int n) throws IllegalArgumentException {
		if (n < 0) {
			throw new IllegalArgumentException();
		}
		else if (n == 0) {
			return 1;
		} else {
			return n * factorial(n - 1);
		}
	}
	
	private static int arraySumMulti(int[] arr, int n) {
		if (n == 0) {
			return 0;
		} else {
			return arraySumMulti(arr, n-1) + arr[n-1];
		}
	}
	
	public static int arraySum(int[] arr) {
		return arraySumMulti(arr, arr.length);
	}

	public static void main(String[] args) {
		System.out.println(factorial(5));
		int[] arr = {1, 2, 3, 4, 5};
		System.out.println(arraySum(arr));

	}

}
