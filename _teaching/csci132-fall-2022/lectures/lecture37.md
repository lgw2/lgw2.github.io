---
collection: teaching
title: "Lecture 37: Quicksort"
---

[Lecture video](https://youtu.be/gvAqsQokL3g)

### Textbook chapters
12.2

### Quicksort algorithm

Similar to mergesort, quicksort is also a divide-and-conquer sorting algorithm.
Unlike mergesort, however, the "work" of sorting is done on the way down the
recursion tree, rather than on the way up.

At each step, we pick one element (called the "pivot") and divide the list into
elements smaller than the pivot, elements equal to the pivot, and elements
greater than the pivot.

We then recurse on both the elements smaller and the elements greater.

To merge the sorted lists back together, we just need to put smaller elements
on the left, equal elements in the middle, and larger elements on the right.

### Worst-case runtime

In the worst case, quicksort has to make $n-1$ recursive calls. We do a linear
amount of work at each call by walking over the list, so the overall worst-case
runtime is $O(n^2)$.

### Expected runtime

If we choose a random element as the pivot for each recursive call, we can use
probability theory to find that the expected recursion depth is $O( \log n)$
and so the expected runtime is $O(n \log n)$.

