package day22;

public class SinglyLinkedList {
	
	private static class Node {
		
		//fields
		private String element;
		private Node next;
		//constructor
		public Node(String element, Node next) {
			this.element = element;
			this.next = next;
		}
		//methods
		public String getElement() {return element;}
		public Node getNext() {return next;}
		public void setNext(Node next) {this.next=next;}
		public String toString() { return element.toString();};
		}
	
	// fields
	private int size = 0;
	private Node head = null;
	private Node tail = null;
	//constructors
	public SinglyLinkedList() {}
	// methods
	public void addFirst(String e) {
		head = new Node(e, head);
		if (size==0) {
			tail = head;
		}
		size++;
	}
	
	public void addLast(String e) {
		Node n = new Node(e, tail.getNext());
		if (size ==0) {
			head = n;
		} else {
			tail.setNext(n);
		}
		tail = n;
		size++;
	}
	
	public String removeFirst() {
		if (size==0) {
			return null;
		}
		String toReturn = head.getElement();
		head = head.getNext();
		size--;
		if (size==0) {
			tail = null;
		}
		return toReturn;
	}
	
	public String toString() {
		String toReturn = "";
		Node current = head;
		while (current!= null) {
			toReturn += current.toString();
			if (current != this.tail) {
				toReturn += "->";
			}
			current = current.getNext();
		}
		return toReturn;
	}
	
	public boolean equals(SinglyLinkedList other) {
		if (other.size != size) return false;
		Node walkA = head;
		Node walkB = other.head;
		while (walkA != null) {
			if (!walkA.getElement().equals(walkB.getElement())) return false; //mismatch
			walkA = walkA.getNext();
			walkB = walkB.getNext();
		}
		return true; // if we make it here, everything matched
	}
	

}