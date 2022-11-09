---
collection: teaching
title: "Lecture 31: Iterators & useful List algorithms"
---

[Lecture video]()

### Textbook chapters
7.4; 7.5.2

### Useful List algorithms in Java
There are some useful methods in `java.util.Collections` class.
* `copy(L_dest, L_src)`
* `disjoint(C, D)`: boolean whether `C`, `D` disjoint
* `max(C)`: max element

and many more! Check out the [documentation](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Collections.html).

#### Converting between Lists and Arrays

* The `List` interface has a `toArray(A)` method that returns an array of the same
type as the array passed in (`A`), with the same elements as the list it was
called on.
* `java.util.Arrays` has an `asList()` method that takes in an array and
	returns a List of the same type, with the same elements.

### Iterators

Iterators are a common design pattern in software. An iterator abstracts the
process of scanning through a sequence of elements one at a time. In Java,
iterators have these methods:
* `hasNext()`
* `next()`

We already know an iterator well: [`Scanner`](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Scanner.html)!

#### Why use iterators?

If we define iterators to have a common interface, then any class that
implements an iterator is guaranteed to have a common way that we can iterate over
it. So we can reuse the same code to iterate over anything! (As long as it has
an iterator.)

#### Java `ArrayList` iterator

* Can be implmented as a nested class.
* Also supports `remove`

### Files used in class
* [List.java](https://lgw2.github.io/teaching/csci132-fall-2022/lectures/List.java)
* [ArrayList.java](https://lgw2.github.io/teaching/csci132-fall-2022/lectures/ArrayList.java)
* [IteratorDemo.java](https://lgw2.github.io/teaching/csci132-fall-2022/lectures/IteratorDemo.java)

## Additional exercises
