---
collection: teaching
title: "Lecture 35: Heapsort; mergesort"
---

[Lecture video](https://youtu.be/lGm4SJShMck)

### Textbook chapters
9.4.2; 12.1

### Heapsort

Since heaps have $O(\log n )$ time to insert and $O( \log n)$ time to remove,
we can take $O(n \log n)$ to sort a length $n$ list as follows:
* Create an empty heap ($O(1)$) and an empty list
* For each element in the list, add it to the heap ($n$ $O( \log n)$
	operations)
* $n$ times, remove the minimum element and add to the empty list using $O(\log
	n)$ time for each. The list is sorted.

### Mergesort

Mergesort is an example of a divide-and-conquer algorithm. We divide the list
in half, sort the halves, and then merge the two halves back together so that
the merged list is still in sorted order.

Because the depth of the recursion tree is $O( \log n)$ and the number of
operations performed at each level is $O(n)$, the overall runtime is $O(n \log
n)$.
