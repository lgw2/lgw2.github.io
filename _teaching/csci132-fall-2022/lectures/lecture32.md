---
collection: teaching
title: "Lecture 32: Recursion; binary search"
---

[Lecture video](https://youtu.be/Ytov9Fk6CQQ)

### Textbook chapters
5.1

### Recursion
We say that a function is *recursive* if it calls itself.

We can achieve looping using recursion.

Recursive functions should have the following:
* a base case, where no recursive call is made
* recursive cases, where we call the function again

### Examples
* factorial
* summing an array

### Binary search

Suppose we have an unsorted list. In order to search for an element in that
list, we can start at the beginning and inspect each element, returning true if
we find it and false otherwise. This has an $O(n)$ worst case runtime.

But if the list is *sorted*, we can be more clever. We use the fact that the
list is sorted to quickly "home in" on the value.

### Files used in class
* [RecursiveAlgs.java](https://lgw2.github.io/teaching/csci132-fall-2022/lectures/RecursiveAlgs.java)

## Additional exercises
* Write a Java method that computes the integer part of a log base 2 of a
	positive integer $n$.
