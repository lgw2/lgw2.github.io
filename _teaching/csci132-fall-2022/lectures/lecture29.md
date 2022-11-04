---
collection: teaching
title: "Lecture 29: More on stacks + queues; more on Project 4"
---

[Lecture video]()

### Textbook chapters
6.1-6.2

### Java implementations

See links in lecture 28.

### Stack applications
* reversing an array
* delimiter checking

### Array-based queue implementation
Key idea: use an array in a circular fashion.

### Double-end queue
Also called a deque (proununced "deck").

Has methods:
* add and remove first
* access (but don't remove) first, last
* `size()`
* `isEmpty()`

### Files used in class
* [ArrayQueue.java](https://lgw2.github.io/teaching/csci132-fall-2022/lectures/ArrayQueue.java)
* [StackAlgs.java](https://lgw2.github.io/teaching/csci132-fall-2022/lectures/StackAlgs.java)

## Additional exercises
* Change our `ArrayQueue` to an `ArrayDeque`. Careful with the case when `f` is
	0 and we need to decrement it to the other end of the array!
* Change our `isMatched` algorithm to check not just for `(` and `)` but also
	other types of delimiters, `{}` and `[]`. Delimiters must match, so for
	example a `}`
	only closes a `{`, not the other opening delimters `(` and `[`.
* What are the asymptotic runtimes of the algorithms in `StackAlgs`?
