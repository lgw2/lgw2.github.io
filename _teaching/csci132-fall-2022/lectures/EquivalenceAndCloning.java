package day22;

public class EquivalenceAndCloning {

	public static void main(String[] args) {
		// recall the difference between primitive and reference data types\
		System.out.println("Primitive data types:");
		int x = 5;
		int y = 5;
		System.out.println(x == y);
		int z = x;
		System.out.println(z == x);
		
		Movie m1 = new Movie("Harry Potter and the Sorcerer's Stone", 2001);
		Movie m2 = new Movie("Harry Potter and the Sorcerer's Stone", 2001);
		// m1 and m2 refer to different objects
		System.out.println("\nReference data types:");
		System.out.println(m1 == m2);
		// m1 and m3 refer to the same object
		Movie m3 = m1;
		System.out.println(m1 == m3);
		
		// let's build an equals method for Movie
		Movie m4 = new Movie("Harry Potter and the Prisoner of Azkaban", 2004);
		System.out.println(m1.equals(m4));
		System.out.println(m1.equals(m2));
		// why doesn't == operator work? 
		// (1) we need to make sure our method signature matches and
		// (2) we need to override the hashcode method (out of scope for this class)
		System.out.println("trying to call the equals method");
		System.out.println(m1 == m2);
		
		// let's build an equals method for SinglyLinkedList
		SinglyLinkedList s1 = new SinglyLinkedList();
		s1.addFirst("BZN");
		s1.addLast("SEA");
		
		SinglyLinkedList s2 = new SinglyLinkedList();
		s2.addFirst("BZN");
		s2.addLast("SEA");
		s2.addLast("SLC");

		
		System.out.println("s1 equals s2?");
		System.out.println(s1.equals(s2));

		
		// changing m3's field changes m1's field
		System.out.println("\nCloning");
		System.out.println(m1.getYear());
		m3.setYear(2002);
		System.out.println(m1.getYear());
		
		// what if we don't want that? we want m3 to be an actual copy of m1
		// instead of just a copy of the reference?
		// cloning!
		int[] data = {2, 3, 5, 7, 11};
		int[] backup;
		backup = data; // both refer to same object!
		backup = data.clone(); // backup is now a new object
		
		data[0] = 5;
		System.out.println(backup[0]);
		System.out.println(data[0]);
		
		// write a clone method for Movie
		
		// warning! the existing clone method for Arrays creates a shallow copy
		Movie[] movies = {m1, m2};
		Movie[] movieBackup = movies.clone();
		
		movieBackup[0].setYear(2022);
		System.out.println(movies[0].getYear());

		

	}

}
