---
collection: teaching
title: "Lecture 24: Asymptotic analysis & big O notation"
---

[lecture video](https://youtu.be/7aVa6__yMeU)

### Textbook chapters
4.3

## Moving beyond experimental analysis: theoretical analysis of algorithms

* Counting primitive operations
* Measuring operations as a function of input size
* Focusing on worst-case input

## Big-O notation
Given functions $f(n)$ and $g(n)$, we say that $f(n)$ is $O(g(n))$ if there are
positive constants $c$ and $n_0$ such that

$$f(n) \leq cg(n)$$

for $n \geq n_0$.

## Some Big-O rules and intuitions
* all primitive operations run in $O(1)$ time
* lower-order terms and constants don't matter
* we don't have to give tight bounds ($n$ is $O(n^3)$)
* big-O does *not* refer only to worst-case runtimes

### Files used in class

### Additional problems
* Order the following functions by their asymptotic growth rate: $4n \log n +
	2n$, $2^{10}$, $2^{\log n}$, $3n + 100 \log n$, $4n$, $2^n$, $n^2 + 10n$,
	$n^3$, $n \log n$.
* Give the big-O characterization, in terms of $n$, of the runtime of the
	following algorithm.
```java
public static int example(int[] arr) {
	int n = arr.length; total = 0;
	for (int j = 0; j < n; j+= 2) { // note the increment of 2
		total += arr[j];
	}
}
```
