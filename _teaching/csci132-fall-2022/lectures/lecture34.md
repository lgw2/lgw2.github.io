---
collection: teaching
title: "Lecture 34: File I/O; trees; heaps"
---

[Lecture video]()

### Textbook chapters


### File I/O

We can use the `java.io` package to read and write to files.

### Trees

Trees are very important abstract data types in computer science, useful for
storing hierarchical data.

### Heaps

Heaps are binary trees satisfying two properties:
* heap-order
* complete binary tree

Here are some heap facts:
* Heaps storing $n$ nodes have height $O(\log n)$
* Insertion into a heap is $O(\ log n)$.
* Removal (of the minimum element) from a heal is $(O \log n)$.

## Files used in this class
* [IOExample.java]()

## Additional exercises
* Prove that binary trees of height $h$ have strictly fewer than $h$ nodes.
* Trace through (that is, draw the heap at each step) adding the elements $5, 2, 6, 9, 7$ to a heap and then removing the minimum until each one is gone.
* In general, what is the big-O runtime of the process in the last bullet, if
	$n$ is the number of elements to be added/removed?
