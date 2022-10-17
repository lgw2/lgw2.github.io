---
collection: teaching
title: "Lecture 22: Equivalence and cloning"
---

[lecture video]()

### Textbook chapters
3.5-3.6

### Equivalence

For a primitive type, testing equivalence between two variables is easy: do
they store the same value?

For a reference type, variables hold references to larger data structures.
Comparing those references may not be meaningful.

As programmers, we have to decide what equivalence means for objects that we
create.

### Cloning

For reference types, using the assignment operator `=` to assign one variable
to another just makes both refer to the same underlying object.

Again, as a programmer, we have choices about what cloning means.
* Shallow clone: make a copy, but for reference fields, keep the same
	references
* Deep clone: make a copy, and copy reference fields into new references


### Files used in class
* [Movie.java](https://lgw2.github.io/teaching/csci132-fall-2022/lectures/Movie.java)
* [EquivalenceAndCloning.java](https://lgw2.github.io/teaching/csci132-fall-2022/lectures/EquivalenceAndCloning.java)
* [SinglyLinkedList2.java](https://lgw2.github.io/teaching/csci132-fall-2022/lectures/SinglyLinkedList2.java)

### Additional problems

* Update our implementation for checking equivalence for singly linked lists so
	that it takes in an `Object` type instead of a `SinglyLinkedList` type.
	(Reference our implementation of `equals` from `Movie`.)
* Write both a shallow clone and a deep clone method for `SinglyLinkedList`.
