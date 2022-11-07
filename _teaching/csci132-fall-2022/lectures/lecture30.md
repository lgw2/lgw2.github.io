---
collection: teaching
title: "Lecture 30: List ADT; ArrayList; amortized analysis; lab 11"
---

[Lecture video]()

### Textbook chapters
7.1-7.2

### Review Stack, Queue, Deque
Which methods go with which ADT?
* `isEmpty()`
* `pop()`
* `enqueue(element)`
* `addFirst(element)`
* `size()`
* `addLast(element)`
* `removeFirst()`
* `push(element)`
* `removeLast()`
* `dequeue()`

### List ADT
We've already made many implementations of the list ADT! (We could call these
*concrete data types*).

* `set(index, element)`
* `get(index)`
* `add(index, element)`
* `remove(i)`

### Resizing an array
Let's look at the `resize` method of `ArrayList.java`.

### Amortized analysis
Used to give a single (average) runtime for an operation that has different runtimes in
different cases. For example, adding to an array!
* [book_amort.png](https://lgw2.github.io/teaching/csci132-fall-2022/lectures/book_amort.png)

### Files used in class
* [List.java](https://lgw2.github.io/teaching/csci132-fall-2022/lectures/List.java)
* [ArrayList.java](https://lgw2.github.io/teaching/csci132-fall-2022/lectures/ArrayList.java)

## Additional exercises
* Read the book's analysis of the doubling strategy for dynamic arrays in 7.2.3.
