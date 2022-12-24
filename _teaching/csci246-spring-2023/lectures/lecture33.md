---
collection: teaching
title: "Lecture 33: Binary search; analyzing recursive algorithms"
---

[Lecture video](https://youtu.be/0RdE7SHJvKs)

### Textbook chapters
5.1.3; 5.2

### Binary search

Suppose we have an unsorted list. In order to search for an element in that
list, we can start at the beginning and inspect each element, returning true if
we find it and false otherwise. This has an $O(n)$ worst case runtime.

But if the list is *sorted*, we can be more clever. We use the fact that the
list is sorted to quickly "home in" on the value.

### The log function

$\log_x y$ is the value $z$ such that $x^z=y$. In computer science, we often
use logs with base (the $x$) equal to 2.

### Analyzing recursive functions

In order to write down the big-O worst-case runtime of a recursive function, we
still want to count the number of primitive operations that the algorithm takes
in the worst case, given an input of size $n$. To do this, we think about two
things:
* how many recursive calls are there in the worst case?
* how many primitive operations does each call do in the worst case?

## Additional exercises
* Write a Java method that computes the integer part of a log base 2 of a
	positive integer $n$.
