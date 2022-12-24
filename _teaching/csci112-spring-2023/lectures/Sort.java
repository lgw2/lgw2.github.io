package day18;

public class Sort {
	
	public static void insertionSort(char[] data) {
		int n = data.length;
		for (int k = 1; k < n; k++) {
			char cur = data[k];
			int j = k;
			while (j > 0 && data[j-1] > cur) {
				data[j] = data[j-1];
				j--;
			}
			data[j] = cur;
		}	

	}
	
	public static void main(String args[]) {
		char[] ourArray = {'B', 'C', 'D', 'A', 'E', 'H', 'G', 'F'};
		System.out.println(ourArray);
		insertionSort(ourArray);
		System.out.println(ourArray);
	}

}
