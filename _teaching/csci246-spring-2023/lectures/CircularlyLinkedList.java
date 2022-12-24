package day21;

//import java.util.LinkedList;

public class CircularlyLinkedList {
	
	private class Node {
		// fields
		private String element;
		private Node next; // link to next node
		// constructor
		public Node(String e, Node n) {
			element = e;
			next = n;
		}
		// methods
		public String getElement() {return element;}
		public Node getNext() {return next;}
		public void setNext(Node n) { next = n;}
	}
	
	// fields
	private int size = 0;
	private Node tail;
	
	// constructor
	// implicitly defined!
	
	public void rotate() {
		if (tail != null) {
			tail = tail.getNext();
		}
	}
	
	public String first() {
		if (size==0) {
			return null;
		}
		return tail.getElement();
		
	}
	
	public void addFirst(String element) {
		if (size == 0) {
			tail = new Node(element, null);
			tail.setNext(tail);
		} else {
			Node newest = new Node(element, tail.getNext());
			tail.setNext(newest);
		}
		size++;
	}
	
	public void addLast(String element) {
		addFirst(element);
		tail = tail.getNext();
		
	}
	
	public String toString() {
		String toReturn = "";
		Node current = tail.getNext();
		if (size !=0) {
			toReturn += current.getElement();
		}
		while (current!= tail) {
			current = current.getNext();
			toReturn += ", " + current.getElement();
		}
		return toReturn;
	}
	
	
	
	

}
