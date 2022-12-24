package day21;

public class CircularlyLinkedListDemo {
	
	public static void main(String args[]) {
		
		CircularlyLinkedList ourList = new CircularlyLinkedList();
		ourList.addFirst("BZN");
		System.out.println(ourList);
		ourList.addLast("MSP");
		System.out.println(ourList);
		ourList.addLast("SEA");
		System.out.println(ourList);
		ourList.rotate();
		System.out.println(ourList);



		
	}
	

}