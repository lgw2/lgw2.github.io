---
collection: teaching
title: "Lecture 32: Recursion; binary search"
---

[Lecture video]()

### Textbook chapters
5.1

### Recursion

### Examples

### Binary search

Suppose we have an unsorted list. In order to search for an element in that
list, we can start at the beginning and inspect each element, returning true if
we find it and false otherwise. This has an $O(n)$ worst case runtime.

But if the list is *sorted*, we can be more clever. We use the fact that the
list is sorted to quickly "home in" on the value

### Files used in class
* [RecursiveAlgs.java](https://lgw2.github.io/teaching/csci132-fall-2022/lectures/RecursiveAlgs.java)

## Additional exercises
* Write a Java method that computes the integer part of a log base 2, given a
	positive integer $n$.

