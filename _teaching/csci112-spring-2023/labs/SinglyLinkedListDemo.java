package lab7;

public class SinglyLinkedListDemo {

	public static void main(String[] args) {
		// TODO: fill in the demo
		SinglyLinkedList<String> airports = new SinglyLinkedList<>();
		System.out.println("Adding some airports...");
		// call the addFirst() and addLast() methods
		// example:
		// airports.addFirst("SLC");
		System.out.println(airports);
		
		System.out.println("Removing an airport...");
		// call the removeFirst() method
		System.out.println(airports);

		System.out.println("\nAdding some movies...");
		// do some adding again
		SinglyLinkedList<Movie> watchlist = new SinglyLinkedList<>();
		// example:
		// watchlist.addFirst(new Movie("Parasite", 2019));
		System.out.println(watchlist);
		
		System.out.println("\nTesting the get() method...");
		// examples:
		// System.out.println(watchlist.get(-1));
		// System.out.println(watchlist.get(1));
		// System.out.println(watchlist.get(3));

		


	}

}
