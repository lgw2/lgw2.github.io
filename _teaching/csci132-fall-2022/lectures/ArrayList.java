/*
 * Copyright 2014, Michael T. Goodrich, Roberto Tamassia, Michael H. Goldwasser
 *
 * Developed for use with the book:
 *
 *    Data Structures and Algorithms in Java, Sixth Edition
 *    Michael T. Goodrich, Roberto Tamassia, and Michael H. Goldwasser
 *    John Wiley & Sons, 2014
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package day30;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayList<E> implements List<E>{
	// Fields
	public static final int CAPACITY = 16; // default array capacity
	private E[] data; // generic array used for storage
	private int size = 0; // current number of elements

	// Constructors
	public ArrayList() {
		this(CAPACITY);
	}
	
	public ArrayList(int capacity) { // constructs list with given capacity
		data = (E[]) new Object[capacity]; // safe cast; compiler may give warning
	}

	// Methods
	public int size() {
		return size;
	}
	
	public void clear() {
		for (E element: this.data) {
			element = null;
		}
		this.size = 0;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public E get(int i) throws IndexOutOfBoundsException {
		checkIndex(i, size);
		return data[i];
	}

	public E set(int i, E e) throws IndexOutOfBoundsException {
		checkIndex(i, size);
		E temp = data[i];
		data[i] = e;
		return temp;
	}

	public void add(int i, E e) throws IndexOutOfBoundsException {
		checkIndex(i, size + 1);
		if (size == data.length) // not enough capacity
			resize(2 * data.length); // so double the current capacity
		for (int k = size - 1; k >= i; k--) // start by shifting rightmost
			data[k + 1] = data[k];
		data[i] = e; // ready to place the new element
		size++;
	}

	public E remove(int i) throws IndexOutOfBoundsException {
		checkIndex(i, size);
		E temp = data[i];
		for (int k = i; k < size - 1; k++) // shift elements to fill hole
			data[k] = data[k + 1];
		data[size - 1] = null; // help garbage collection
		size--;
		return temp;
	}

	// utility methods
	protected void checkIndex(int i, int n) throws IndexOutOfBoundsException {
		if (i < 0 || i >= n)
			throw new IndexOutOfBoundsException("Illegal index: " + i);
	}

	protected void resize(int capacity) {
		E[] temp = (E[]) new Object[capacity]; // safe cast; compiler may give warning
		for (int k = 0; k < size; k++)
			temp[k] = data[k];
		data = temp; // start using the new array
	}

	// ---------------- nested ArrayIterator class ----------------

	private class ArrayIterator implements Iterator<E> {
		private int j = 0; // index of the next element to report
		private boolean removable = false; // can remove be called at this time?

		public boolean hasNext() {
			return j < size;
		} // size is field of outer instance

		public E next() throws NoSuchElementException {
			if (j == size)
				throw new NoSuchElementException("No next element");
			removable = true; // this element can subsequently be removed
			return data[j++]; // post-increment j, so it is ready for future call to next
		}

		public void remove() throws IllegalStateException {
			if (!removable)
				throw new IllegalStateException("nothing to remove");
			ArrayList.this.remove(j - 1); // that was the last one returned
			j--; // next element has shifted one cell to the left
			removable = false; // do not allow remove again until next is called
		}
	} // ------------ end of nested ArrayIterator class ------------


	public Iterator<E> iterator() {
		return new ArrayIterator(); // create a new instance of the inner class
	}

	public String toString() {
		StringBuilder sb = new StringBuilder("[");
		for (int j = 0; j < size; j++) {
			if (j > 0)
				sb.append(", ");
			sb.append(data[j]);
		}
		sb.append("]");
		return sb.toString();
	}
}
